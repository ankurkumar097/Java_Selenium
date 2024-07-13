package SeleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Link https://www.demoblaze.com/index.html
// Ques - 1 find total no of links and print them, 2 total number of images, 3click on any product link using link text or partial link text

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		// Ques 1
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		/*for(int i =0; i<links.size();i++) {
			System.out.println(links.get(i));
		}*/
		
		for(WebElement x : links) {
			System.out.println(x);
		}
		
		// Ques 2
		List<WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println("Toatal Number of Image is :"+img.size());
		
		//ques3
		//driver.findElement(By.linkText("Samsung galaxy s7")).click();
		driver.findElement(By.partialLinkText("HTC")).click();
		
		
		driver.quit();
	}

}
