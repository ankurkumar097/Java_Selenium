package Assignment;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		//1st page
		WebElement dep = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select deptCity = new Select(dep);
		deptCity.selectByValue("Portland");
		
		driver.findElement(By.xpath("//select[@name='fromPort']")).click();
		driver.findElement(By.xpath("//option[@value='Berlin']")).click();
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		//operating table
		int row = driver.findElements(By.tagName("tr")).size();
		int couls = driver.findElements(By.xpath("//table[@class='table']//th")).size();
		String[] allprice = new String[6];
		allprice[0]="0";
		
		for(int r = 1; r<= row-1; r++) {
			String price = driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
			allprice[r] = price;
			System.out.println(allprice[r]);
		}
		
		Arrays.sort(allprice);
		String lowest = allprice[0];
		System.out.println(lowest);
		
		for(int r1 = 1; r1<= row-1; r1++) {
			String lowVal = driver.findElement(By.xpath("//table[@class='table']//tr["+r1+"]//td[6]")).getText();
			if(lowVal.equals(lowest)) {
				driver.findElement(By.xpath("//table[@class='table']//tr["+r1+"]//td[1]//input")).click();
				break;
			}
		}
		
		//purchase flight
		driver.findElement(By.id("inputName")).sendKeys("Black Rock");
		driver.findElement(By.id("address")).sendKeys("123 Street");
		driver.findElement(By.id("city")).sendKeys("Chandigarh");
		driver.findElement(By.id("state")).sendKeys("Punjab");
		driver.findElement(By.id("zipCode")).sendKeys("12542");
		
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("1234567812345678");
		driver.findElement(By.id("nameOnCard")).sendKeys("jon smith");
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		Thread.sleep(4000);
		
		String mesg = driver.findElement(By.xpath("//div[@class='container']//h1")).getText();
		if(mesg.contains("Thank you")) {
			System.out.println("test case pass");
		}
		
		driver.quit();
	}

}
