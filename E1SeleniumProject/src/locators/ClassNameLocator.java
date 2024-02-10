package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com");
	Thread.sleep(2000);
	//pass the input as google search box
	driver.switchTo().activeElement().sendKeys("virat kohli",Keys.ENTER);
	//identify d radio button by using name Locator
	driver.findElement(By.className("lNPNe")).click();
		
		
		
	}

}
