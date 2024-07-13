package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment5Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebDriverWait alWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// 1. Normal Alert
		driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		// 2. Confirmation Alert
		driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click();
		
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		//myalert.accept();
		myalert.dismiss();
		
		//3. Prompting Alert
		driver.findElement(By.xpath("//button[normalize-space()='Prompt']")).click();
		Alert promptAl = driver.switchTo().alert();
		
		String prompttext = promptAl.getText();
		System.out.println(prompttext);
		
		promptAl.sendKeys("Tester");
		//promtAl.accept();
		//System.out.println("Promp Output: " +driver.findElement(By.xpath("//p[@id='demo']")).getText());
		
		promptAl.dismiss();
		System.out.println("Promp Output: " +driver.findElement(By.xpath("//p[@id='demo']")).getText());
		
		// Handling Alert without Switch command
		driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
		Alert waitElement = alWait.until(ExpectedConditions.alertIsPresent());
		waitElement.dismiss();
		Thread.sleep(4000);
		
		
		//4. Authentication prompt
		//https://the-internet.herokuapp.com/basic_auth
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(4000);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(4000);
		driver.quit();

	}

}
