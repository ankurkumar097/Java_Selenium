package SeleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		WebDriver driver = new FirefoxDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		Thread.sleep(4000);
		
		String title = driver.getTitle();
		Thread.sleep(4000);
		if(title.equals("Your Store")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		//Thread.sleep(4000);
		//driver.close();
		driver.quit();

	}

}
