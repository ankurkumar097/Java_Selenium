package SeleniumDemo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WaitsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//1 Thread.sleep - java wait
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		//1 implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		//2 Explicit wait
		//WebDriverWait exWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//WebElement usrName = exWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		//usrName.sendKeys("Admin");
		
		//Fluent Wait
		Wait <WebDriver> fluWait = new FluentWait<WebDriver>(driver)
				                       .withTimeout(Duration.ofSeconds(30))
				                       .pollingEvery(Duration.ofSeconds(5))
				                       .ignoring(NoSuchElementException.class);
		
		WebElement elementNm = fluWait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply (WebDriver driver) {
				return driver.findElement(By.xpath("//input[@placeholder='Username']"));
			}
		});
		
		elementNm.sendKeys("Admin");
		
		driver.quit();
		
	}

}
