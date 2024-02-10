package takeScreenShotPackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByUpcastingIntoRemoteWebDriver {

	public static void main(String[] args) {
		
		
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		 driver.get("https://www.amazon.in/");
		 
		 File src = driver.getScreenshotAs(OutputType.FILE);//To take screenshot of Webpage
			
	     File dest = new File("./screenshots/Amazon.png");//To specify the  location.name and extension of screenshot
			
			
		 Files.copy(src, dest);//to copy and paste the screenshot in the specified class 

	}

}
