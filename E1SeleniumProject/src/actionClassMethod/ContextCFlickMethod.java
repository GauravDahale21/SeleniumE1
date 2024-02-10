package actionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextCFlickMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		 
		 Actions act = new Actions(driver); // to create the object of action class
		 
		 WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
		 act.click(button).perform();// to perform single operation using click method of action class
		 
		 WebElement rightClickButton = driver.findElement(By.xpath("//a[text()='Right Click']"));
		 act.click(rightClickButton).perform();
		 
		 WebElement button1 = driver.findElement(By.xpath("//button[@id='btn30']"));
		 act.contextClick(button1).perform();
		 WebElement button1Option = driver.findElement(By.xpath("//div[text()='Yes']"));
		 act.click(button1Option).perform();
		 
		 
		 WebElement button2 = driver.findElement(By.xpath("//button[@id='btn31']"));
		 act.contextClick(button2).perform();
		 WebElement button2Option = driver.findElement(By.xpath("//div[text()='No']"));
		 act.click(button2Option).perform();
		 
		 
		 
		 WebElement button3 = driver.findElement(By.xpath("//button[@id='btn32']"));
         act.contextClick(button3).perform();// to perform right click operation on webelement
         WebElement button3Option = driver.findElement(By.xpath("//div[text()='5']"));
		 act.click(button3Option).perform();
		 

	}

}
