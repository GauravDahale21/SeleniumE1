package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://hp/login.jsp");
		 Thread.sleep(2000);
		 
		 //by using text function ie text()
		// WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
        // loginButton.click();
         
		 
		 //by using text function ie .
         WebElement login = driver.findElement(By.xpath("//a[.='Login']"));
         login.click();

	}

}
