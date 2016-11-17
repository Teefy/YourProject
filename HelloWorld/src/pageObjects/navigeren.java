package pageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class navigeren {

	private static WebElement element = null;
	
	public static WebElement PijlRechts(WebDriver driver){
		element =  driver.findElement(By.id("arrow-right-wrapper"));
		return element;
	}
	public static WebElement NavigeerMantis(WebDriver driver){
		element =  driver.findElement(By.linkText("Issues"));
		return element;
	}
	
	public static WebElement MaakBevinding(WebDriver driver){
		element =  driver.findElement(By.linkText("Report Issue"));
		return element;
	}
	public static WebElement BekijkBevindingen(WebDriver driver){
		element =  driver.findElement(By.linkText("View Issues"));
		return element;
	}
	
	
	
	
}
