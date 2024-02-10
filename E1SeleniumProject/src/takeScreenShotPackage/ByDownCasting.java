package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByDownCasting {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		 driver.get("https://www.flipkart.com/");
		 
		 Thread.sleep(5000);
		 
		 RemoteWebDriver rwd = (RemoteWebDriver)driver;// To perform downcasting
		 
		File src = rwd.getScreenshotAs(OutputType.FILE);//To take screenshot of Webpage
		
		File dest = new File("./screenshots/Flipkart.jpg");//To specify the  location.name and extension of screenshot
		
		
		
		Files.copy(src, dest);//to copy and paste the screenshot in the specified class 
	}

}
