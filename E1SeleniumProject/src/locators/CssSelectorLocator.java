package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver= new ChromeDriver();//to launch chrome browser
		 driver.manage().window().maximize();// To Maximize the browser windows
		 driver.get("https://www.instagram.com/");// To launch the Web Application
		 Thread.sleep(2000);
		 
		 //to find/locate username textbox and pass inputs
		 WebElement usnTB = driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']"));
         usnTB.sendKeys("qspider");
         Thread.sleep(2000);
         
         //to find/locate password textbox and pass the inputs
         WebElement passTB = driver.findElement(By.cssSelector("input[type='Password']"));
         passTB.sendKeys("password12345");
         Thread.sleep(4000);
         
         //To click on login button
         WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
         loginButton.click();
	}

}
