package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Absolute Xpath
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[1]/input[1]")).sendKeys("xyz");
		Thread.sleep(2000);
		
		//Relative Xpath with Single attribute
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@gmai.com");
		Thread.sleep(2000);
		
		//Relative Xpath with Multiple attribute
		driver.findElement(By.xpath("//input[@id = 'phone'][@class=\"form-control\"]")).sendKeys("8584566252");
		Thread.sleep(2000);
		
		//Relative Xpath with 'and' 'or' operators
		driver.findElement(By.xpath("//textarea[@id = 'textarea' and @class='form-control']")).sendKeys("787,adk,India");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"female\" or @name=\"nder\"]")).click();
		Thread.sleep(2000);
		
		//Relative Xpath with text()='inner text' method
		driver.findElement(By.xpath("//button[text() ='New Browser Window']")).click();
		
		//Relative Xpath with contains method
		driver.findElement(By.xpath("//input[contains(@id, 'sunday')]")).click();
		
		//Relative Xpath with starts-with method
		driver.findElement(By.xpath("//input[starts-with(@id , 'tues')]")).click();
		
		//Xpath Axes
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement impParent = driver.findElement(By.xpath("//img[@title='Show products in category Apparel']/parent::a"));
		
		WebElement child = driver.findElement(By.xpath("//img[@title='Show products in category Apparel']/child::a"));
		
		WebElement ancestor = driver.findElement(By.xpath("//img[@title='Show products in category Apparel']/ancestor::a"));
		
		WebElement descendent = driver.findElement(By.xpath("//img[@title='Show products in category Apparel']/descendent::a"));
		
		WebElement followingSibling = driver.findElement(By.xpath("//img[@title='Show products in category Apparel']/following-sibling::a"));
		
		WebElement precedinfSibling = driver.findElement(By.xpath("//img[@title='Show products in category Apparel']/preceding-sibling::a"));
		
		WebElement precedin = driver.findElement(By.xpath("//img[@title='Show products in category Apparel']/preceding::a"));
		
		WebElement following = driver.findElement(By.xpath("//img[@title='Show products in category Apparel']/following::a"));
		
		driver.quit();

	}

}
