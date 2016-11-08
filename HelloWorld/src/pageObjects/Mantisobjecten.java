package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Mantisobjecten {
	
	private static WebElement element = null;

	public static WebElement DropDown_category(WebDriver driver){
		element =  driver.findElement(By.name("category_id"));
		return element;
	}

	public static WebElement DropDown_reproducibility(WebDriver driver){
		element =  driver.findElement(By.name("reproducibility"));
		return element;
	}
	
	public static WebElement DropDown_severity(WebDriver driver){
		element =  driver.findElement(By.name("severity"));
		return element;
	}
	
	public static WebElement DropDown_priority(WebDriver driver){
		element =  driver.findElement(By.name("priority"));
		return element;
	}
		
	public static WebElement text_platform(WebDriver driver){
		element =  driver.findElement(By.name("platform"));
		return element;
	}
	public static WebElement text_os(WebDriver driver){
		element =  driver.findElement(By.name("os"));
		return element;
	}
	public static WebElement text_os_build(WebDriver driver){
		element =  driver.findElement(By.name("os_build"));
		return element;
	}
	
	public static WebElement DropDown_handler_id(WebDriver driver){
		element =  driver.findElement(By.name("handler_id"));
		return element;
	}	
	
	public static WebElement text_summary(WebDriver driver){
		element =  driver.findElement(By.name("summary"));
		return element;
	}
	public static WebElement text_description(WebDriver driver){
		element =  driver.findElement(By.name("description"));
		return element;
	}
	public static WebElement text_steps_to_reproduce(WebDriver driver){
		element =  driver.findElement(By.name("steps_to_reproduce"));
		return element;
	}
	public static WebElement text_additional_info(WebDriver driver){
		element =  driver.findElement(By.name("additional_info"));
		return element;
	}
	
	public static WebElement DropDown_custom_field_5(WebDriver driver){
		element =  driver.findElement(By.name("custom_field_5"));
		return element;
	}
		
	public static WebElement DropDown_custom_field_1(WebDriver driver){
		element =  driver.findElement(By.name("custom_field_1"));
		return element;
	}
}
