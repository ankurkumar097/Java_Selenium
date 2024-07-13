package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6WebTableDynamic {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Step 1 - to find total number of page
		
		int noOfPage = driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
		
		// Step 2 - to iterate through each page
		
		System.out.println("ID"+"\t"+"Name"+"\t"+"\t"+"Price");
		
		for(int p=1;p<= noOfPage; p++) {
			//Thread.sleep(4000);
			if(p>1) {
				WebElement active_page = driver.findElement(By.xpath("//ul[@id='pagination']//li["+p+"]"));
				active_page.click();
			}
			
			// Step 3 - reading values and performing action
			int rows = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tbody//tr")).size();
			
			for(int r=1;r<=rows;r++) {
				String id = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tbody//tr["+r+"]//td[1]")).getText();
				String name = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tbody//tr["+r+"]//td[2]")).getText();
				String price = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tbody//tr["+r+"]//td[3]")).getText();
				
				driver.findElement(By.xpath("//table[@id=\"productTable\"]//tbody//tr["+r+"]//input")).click();
				
				System.out.println(id+"\t"+name+"\t"+price);
			}
		}
		//driver.quit();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//li[1]//a[1]//span[1]")).click();
		//Thread.sleep(4000);
		System.out.println("Username"+"\t"+"User Role");
		
		int rows= driver.findElements(By.xpath("//div[@class='oxd-table-body']//div[@class=\"oxd-table-card\"]")).size();
		for(int r=1;r<=rows;r++) {
			String usrname=driver.findElement(By.xpath("//div[@class='oxd-table-body']/div["+r+"]/div[1]/div[2]/div")).getText();
			String usrrole=driver.findElement(By.xpath("//div[@class='oxd-table-body']/div["+r+"]/div[1]/div[3]/div")).getText();
			
			System.out.println(usrname+"\t"+"\t"+usrrole);
		}
		
		driver.quit();
	}
}
