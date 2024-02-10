package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 driver.get("http://hp/login.do");
		 
		 WebElement loginButton = driver.findElement(By.id("loginButton"));//to find login button
		 String loginTag = loginButton.getTagName();//to get the tagname of login button
		 System.out.println(loginTag);//to print the tag name of login button on console
		 
		 WebElement usn = driver.findElement(By.name("username"));
		 String usnTag = usn.getTagName();
		 System.out.println(usnTag);
	}

}
