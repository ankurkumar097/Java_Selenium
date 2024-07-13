package SeleniumDemo;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3SwitchWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//provide some string and search for it
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
		
		//count no. of links present		
		List<WebElement> linksAfterSearch = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link' or @id='Wikipedia1_wikipedia-search-more']/a"));
		System.out.println(linksAfterSearch.size());
		
		//click on each link using loop
		for(WebElement link : linksAfterSearch) {
			link.click();
		}
		
		//get window id's of each browser window
		Set<String> winId = driver.getWindowHandles();
		System.out.println(winId);
		
		//close specific browser window
		for(String id : winId) {
			String title = driver.switchTo().window(id).getTitle();
			if(title.equals("Selenium - Search results - Wikipedia") || title.equals("Selenium (software) - Wikipedia") ) {
				driver.close();
				System.out.println("close window");
			}
		}
		
		driver.quit();

	}

}
