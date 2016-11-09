package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testlinkobjecten {
	
	private static WebElement element = null;
	
	public static WebElement PijlRechts(WebDriver driver){
		element =  driver.findElement(By.id("arrow-right-wrapper"));
		return element;
	}
	
	public static WebElement OpenTestLink(WebDriver driver){
		element =  driver.findElement(By.linkText("Test cases"));
		return element;
	}		
	
	
}
