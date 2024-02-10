package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/gaura/OneDrive/Desktop/selenium%20web%20element%20c/textbox.html");

		WebElement textBox = driver.findElement(By.tagName("input"));
		textBox.sendKeys("Manager");
		
		WebElement password = driver.findElement(By.tagName("input"));
		password.sendKeys("admin");
	}

}
