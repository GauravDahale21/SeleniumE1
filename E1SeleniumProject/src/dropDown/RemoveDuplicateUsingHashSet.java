package dropDown;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateUsingHashSet {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 driver.get("file:///C:/Users/gaura/OneDrive/Desktop/Seleniun%20Link/multidropdown1.html");
		 
		 WebElement multiSelectDD = driver.findElement(By.id("idddd"));
		 
		 Select sel = new Select(multiSelectDD);//to create the object of select
		 
		 HashSet<String> hs = new HashSet <String>();
		 
		 List<WebElement> options = sel.getOptions();
		 
		 //for each loop
		 for(WebElement we : options)
		 {
			String textToInsert = we.getText();
			hs.add(textToInsert);
		 }
		 for(String text : hs)
		 {
          System.out.println(text);
		 }
		 
		 //for loop
		 for(int i=0 ; i<options.size() ; i++)
		 {
			 String textToInsert = options.get(i).getText();
			 
			 hs.add(textToInsert);
		 }
		 for(String text : hs)
		 {
			 System.out.println(text);
		 }
	}

}
