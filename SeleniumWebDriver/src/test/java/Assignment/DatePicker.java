package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {
	
	static void selectYMD (WebDriver driver, String year, String month, String date) {
		WebElement yeardd = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select yr = new Select(yeardd);
		yr.selectByValue(year);
		
		WebElement mondd = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select mon = new Select(mondd);
		mon.selectByVisibleText(month);
		
		//selecting date
		List<WebElement> dt = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		for(WebElement dt1 : dt) {
			String dt2 = dt1.getText();
			if(dt2.equals(date)) {
				dt1.click();
				break;
			}
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		/*
		driver.get("https://dummy-tickets.com/buyticket");
		
		driver.findElement(By.xpath("//a[normalize-space()='Flight']")).click();
		driver.findElement(By.xpath("//input[@value='onewaymain']")).click();
		
		driver.findElement(By.xpath("//form[@id='flight_oneway']//div[@class='col-sm-12 p-0 suggestion-container']//input[@name='source[]']")).sendKeys("chandigarh");
		WebElement option1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[normalize-space()='Chandigarh Airport,']"))));
		option1.click();
		
		driver.findElement(By.xpath("//form[@id='flight_oneway']//div[@class='col-sm-12 p-0 suggestion-container']//input[@name='destination[]']")).sendKeys("chennai");
		WebElement option2 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[normalize-space()='Chennai International Airport,']"))));
		option2.click();
		
		// Selecting Year Month
		WebElement dp = driver.findElement(By.xpath("//input[@id='dp1718209711044']"));
		dp.click();
		*/
		
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Practice");
		
		//input
		String year = "1990";
		String month = "Mar";
		String date = "20";
		
		// Selecting year month
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		selectYMD(driver, year, month, date);
		
		driver.findElement(By.xpath("//input[@id='departon']")).click();
		selectYMD(driver, "2024", "Jun", "30");
	}

}
