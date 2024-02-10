package actionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		 
		 Actions act = new Actions(driver);//to create the object of actions class
		 
		 WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
		 act.click(button).perform();// to perform single operation using click method of action class
		 
		 WebElement doubleClickButton = driver.findElement(By.xpath("//a[text()='Double Click']"));
		 act.click(doubleClickButton).perform();
         
		 WebElement yesButton1 = driver.findElement(By.xpath("//button[@id='btn20']"));
		 WebElement noButton2 = driver.findElement(By.xpath("//button[@id='btn23']"));
		 WebElement rateButton3 = driver.findElement(By.xpath("//button[@id='btn26']"));
		 
		 act.doubleClick(yesButton1).perform();//to perform double click operation on 'yes' button
		 
		 act.doubleClick(noButton2).perform();//to perform double click operation on 'no' button
		 
		 act.doubleClick(rateButton3).perform();//to perform double click operation on Rating(3) button
	}

}
