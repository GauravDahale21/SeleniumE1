package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 driver.get("http://hp/login.do");
		 
		 WebElement loginButton = driver.findElement(By.id("loginButton"));//to find login button
		 String loginText = loginButton.getText();// to get the text of login button
		 System.out.println(loginText);//to print the text of login button in the console
		 
		 WebElement link = driver.findElement(By.id("licenseLink"));
		 String linkText = link.getText();
		 System.out.println(linkText);
		 
	}

}
