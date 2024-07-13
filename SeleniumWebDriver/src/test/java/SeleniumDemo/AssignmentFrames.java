package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		//frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		Thread.sleep(4000);
		
		//switch to parent frame
		driver.switchTo().defaultContent();
		
		//switch to 5th frame
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src=\"frame_5.html\"]"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
		//WebElement iframe5 = driver.findElement(By.xpath("/html[1]/frameset[1]/frame[2]"));
		//driver.switchTo().frame(iframe5);
		
		System.out.println(driver.findElement(By.xpath("//img[@src=\"/Content/Images/ui.vision.logo2.webp\"]")).isDisplayed());
		
		
		
		
		driver.quit();
	}

}
