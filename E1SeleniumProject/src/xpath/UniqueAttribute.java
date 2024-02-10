package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.fireflink.com/");
		 Thread.sleep(5000);
		 
		 WebElement reject = driver.findElement(By.id("rcc-decline-button"));
		 reject.click();
		 Thread.sleep(2000);
		 
		 
		 WebElement signInLink = driver.findElement(By.linkText("https://app.fireflink.com/signin"));
		 signInLink.click();
		 Thread.sleep(2000);
		 
		 WebElement email = driver.findElement(By.xpath("//input[@id='mui-1']"));
		 email.sendKeys("gauravdahale1991@gmail.com");
		 Thread.sleep(2000);
         
		 WebElement pass = driver.findElement(By.xpath("//input[@id='mui-2']"));
		 pass.sendKeys("gaurav@09");
		 Thread.sleep(2000);
		 
		 WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		 loginButton.click();
		 Thread.sleep(2000);
		 
		 
	}

}
