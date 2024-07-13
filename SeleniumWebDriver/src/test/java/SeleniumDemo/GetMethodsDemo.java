package SeleniumDemo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetMethodsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//button[normalize-space()='New Browser Window']")).click();
		
		Set<String> windowId = driver.getWindowHandles();
		System.out.println(windowId);
		
		driver.quit();

	}

}
