package SeleniumDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDD {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.bjs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("water");
		List<WebElement> options = driver.findElements(By.xpath("//div[@class=\"container search-suggestion\"]//div[@class=\"list list-group\"]//a"));
		
		for(WebElement op : options) {
			String val = op.getText();
			if(val.equals("watermelons")) {
				op.click();
			}
		}
		
	}

}
