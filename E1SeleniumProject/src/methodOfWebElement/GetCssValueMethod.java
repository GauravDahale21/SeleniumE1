package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 driver.get("http://hp/login.do");
		 
		WebElement loginButton = driver.findElement(By.id("loginButton"));//To find Login Button and store in a variable
		String cssValue = loginButton.getCssValue("background");//Tp get the css value used for background 
		System.out.println(cssValue);// to print the received value in the console
		
		String colour = loginButton.getCssValue("colour");
		System.out.println(colour);
	}

}
