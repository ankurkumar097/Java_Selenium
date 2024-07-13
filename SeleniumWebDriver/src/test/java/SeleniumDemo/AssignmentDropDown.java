package SeleniumDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDropDown {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		//Assignment1 - count total number of options, print all the options, select one option
		// handling drop down without select class
		driver.findElement(By.id("country-list")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//option[@value='3']")).click();
		Thread.sleep(4000);
		
		List<WebElement> state = driver.findElements(By.xpath("//select[@id='country-list']/option"));
		System.out.println("no of countries are: "+ state.size());
		
		driver.findElement(By.id("state-list")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//option[@value='12']")).click();
		Thread.sleep(4000);
		
		// handling drop down using select class
		WebElement states = driver.findElement(By.id("country-list"));
		//to select 1 option
		Select statedd = new Select(states);
		statedd.selectByValue("4");
		//to count total number of options
		List<WebElement> statesopt = statedd.getOptions();
		System.out.println("Number of States are: " + statesopt.size());
		// to print all the options
		for(int i =0; i<statesopt.size(); i++) {
			System.out.println(statesopt.get(i).getText());
		}
		
		
		//Assignment2 - hidden drop down
		/*
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(4000);
		*/
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement colour = driver.findElement(By.xpath("//select[@id='colors']"));
		Select couloropt = new Select(colour);
		couloropt.selectByVisibleText("Green");
		couloropt.selectByIndex(1);
		Thread.sleep(4000);
		
		
		//Auto Suggestion Drop down
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Java");
		Thread.sleep(4000);
		
		List<WebElement> ddvalues = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@role='option']"));
		for(int i=0; i<ddvalues.size();i++) {
			String val = ddvalues.get(i).getText();
			if(val.equals("java")) {
				ddvalues.get(i).click();
				break;
			}
		}
		
		
		driver.quit();
	}
}
