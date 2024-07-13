package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// to use css selectors to locate elements on a web page

public class Assessment2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		//by tag#id
		//driver.findElement(By.cssSelector("a#narbar-menu")).click();
		
		//by tag.class
		//driver.findElement(By.cssSelector("a.nav-link")).click();
		//driver.findElement(By.cssSelector(".nav-link")).click(); //returns list of web elements
		
		//by tag[attribute='value']
		//driver.findElement(By.linkText("iPhone")).click();
		//driver.findElement(By.cssSelector("button[id='button-cart']")).click();
		
		//by tag.clss[attribute='value']
		System.out.println(driver.findElement(By.cssSelector("img.img-fluid[alt=\"iPhone 6\"]")).isDisplayed());
		
		Thread.sleep(4000);
		driver.quit();
	}

}
