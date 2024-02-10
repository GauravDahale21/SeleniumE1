package dropDown;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateUsingTreeSet {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 driver.get("file:///C:/Users/gaura/OneDrive/Desktop/Seleniun%20Link/multidropdown1.html");
		 
		 WebElement multiSelectDD = driver.findElement(By.id("idddd"));
		 
		 Select sel = new Select(multiSelectDD);//To create the object of Select
		 
		TreeSet<String> ts = new TreeSet <String>();//To create the object of TreeSet
		
		 List<WebElement> options = sel.getOptions();//To get the list of all the options
		
		 for(WebElement we : options) 
		 {
			String textToInsert = we.getText();
			
			ts.add(textToInsert );
		 }
		 for( String t : ts)
		 {
			 System.out.println(t);
		 }
		 
	}

}
