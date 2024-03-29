package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 driver.get("https://www.instagram.com/");
		 
		 driver.findElement(By.name("username")).sendKeys("Qspiders");
		 driver.findElement(By.name("password")).sendKeys("123456");
		 
		 WebElement loginButton = driver.findElement(By.xpath("//div[text()='Log in']"));
		 loginButton.submit();
	}

}
