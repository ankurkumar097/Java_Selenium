package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethodDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement status = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
		System.out.println(status.isDisplayed());
		
		System.out.println(driver.findElement(By.xpath("//input[@id='datepicker']")).isEnabled());
		
		System.out.println(driver.findElement(By.xpath("//h3[normalize-space()='Resizable']")).isEnabled());
		
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='sunday']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='monday']")).isSelected());
		
		driver.quit();

	}

}
