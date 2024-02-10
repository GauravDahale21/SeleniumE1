package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver= new ChromeDriver();//launch the browser
		 driver.manage().window().maximize();//To maximize the browser windows
		 driver.get("https://www.facebook.com/ ");
		 Thread.sleep(2000);
		 WebElement usnTexbox = driver.findElement(By.id("email"));
		 usnTexbox.sendKeys("gaurav");
		 Thread.sleep(2000);
		 WebElement passTexbox = driver.findElement(By.id("pass"));
		 passTexbox.sendKeys("dahale");
		 Thread.sleep(2000);
		 WebElement loginButton = driver.findElement(By.tagName("button"));
		 loginButton.click();
	}

}
