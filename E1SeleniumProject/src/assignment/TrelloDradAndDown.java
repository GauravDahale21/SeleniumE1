package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrelloDradAndDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://trello.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("gauravdahale1991@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
		driver.findElement(By.id("password")).sendKeys("Gaurav09@");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		

	}

}
