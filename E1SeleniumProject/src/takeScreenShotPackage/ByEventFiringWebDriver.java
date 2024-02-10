package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

@SuppressWarnings("deprecation")
public class ByEventFiringWebDriver {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();//to upcast to webdriver interface
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.instagram.com/");
        
        EventFiringWebDriver efwd = new EventFiringWebDriver(driver);//to create the object of eventFiringClass
		 
		 
		 
		File src = efwd.getScreenshotAs(OutputType.FILE);//To take the screenshot of the webpage.
		
		File dest = new File("./screenshots/Instagram.png");//To specify the location.name and extension of screenshot.
       
		Files.copy(src, dest);//To save the screenshot into screenshots folder.
		
	

	}

}
