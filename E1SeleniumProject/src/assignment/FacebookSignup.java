package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 driver.get("https://www.facebook.com/signup");
		 
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Gaurav");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("Dahale");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("gauravdahale21@gmail.com");
		
		WebElement confirmEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		confirmEmail.sendKeys("gauravdahale21@gmail.com");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		passWord.sendKeys("Gaurav09");
		
		
		 
		 WebElement dayDropdown = driver.findElement(By.id("day"));
		 WebElement monthDropdown = driver.findElement(By.id("month"));
		 WebElement yearDropdown = driver.findElement(By.id("year"));
		 
		Select daySelect = new Select(dayDropdown);
		boolean result1 = daySelect.isMultiple();
		System.out.println("dayDropdown is multiple ? : " +result1);
		
		List<WebElement> dayOptions = daySelect.getOptions();
		for(WebElement we : dayOptions)
		{
			System.out.println(we.getText());
		}
		daySelect.selectByIndex(16);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		
		 Select monthSelect = new Select(monthDropdown);
		boolean result2 = monthSelect.isMultiple();
		System.out.println("Month Dropdown is multiple ? : " +result2);
		
		List<WebElement> monthOptions = monthSelect.getOptions();
		for(WebElement we : monthOptions) 
		{
			System.out.println(we.getText());
		}
		monthSelect.selectByValue("6");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		

		 Select yearSelect = new Select(yearDropdown);
		boolean result3 = yearSelect.isMultiple();
		System.out.println("Year Dropdown is multiple ? : " +result3);
		
		List<WebElement> yearOptions = yearSelect.getOptions();
		for(WebElement we : yearOptions) 
		{
			System.out.println(we.getText());
		}
		yearSelect.selectByValue("1994");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		
		WebElement radioButton = driver.findElement(By.xpath("//label[text()='Male']"));
		radioButton.click();
	    
	   // WebElement signUp = driver.findElement(By.xpath("//button[text()='Sign Up']"));
	    //signUp.click();
		    
	
	}
	     
	   


}
