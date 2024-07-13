package SeleniumDemo;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Select Single Check box
		//driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		//System.out.println(driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).isSelected());
		
		//Select all the check boxes
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//tbody/tr/td//input[@type=\"checkbox\"]"));
		/*
		for(WebElement checkbox : checkboxes) {
			checkbox.click();
		}*/
		
		//Selecting 1st 3 Check boxes
		/*
		for(int i =0;i<3; i++) {
			checkboxes.get(i).click();
		}*/
		
		//Selecting last 3 Check boxes
		//Formula - Starting Index = total  number of elements - Elements needs to be selected from last
		// int i = 5 - 3 = 2
		for(int i = 2; i<checkboxes.size(); i++) {
			checkboxes.get(i).click();
			Thread.sleep(4000);
		}
		
		//UnSelect Check Boxes which are already selected
		for(WebElement checkbox : checkboxes){
			if(checkbox.isSelected()) {
				checkbox.click();
			}
			Thread.sleep(4000);
		}	
		
		driver.quit();
	}

}
