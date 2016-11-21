package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testlinkobjecten {
	
	private static WebElement element = null;
	
	// Sectie: Navigeren naar Testlink / Test Project Management	
	
	public static WebElement OpenTestLink(WebDriver driver){
		element =  driver.findElement(By.linkText("Test cases"));
		return element;
	}		
	
	public static WebElement OpenTestProjectManagement(WebDriver driver){
		driver.switchTo().frame("mainframe");
		element =  driver.findElement(By.linkText("Test Project Management"));
		return element;
	} 
	
	public static WebElement CreateNewProjectButton(WebDriver driver){
		element =  driver.findElement(By.id("create"));
		return element;
	} 
	
	// Sectie: Projectnaam, prefix en beschrijving		
	
	public static WebElement ProjectNaam(WebDriver driver){
		element =  driver.findElement(By.name("tprojectName"));
		return element;
	} 
	

	public static WebElement Prefix_en_Description(WebDriver driver){
		element =  driver.findElement(By.name("tcasePrefix"));
		return element;
	} 
	
	// Sectie: Enhanced features	
	
	public static WebElement RequirementsRadiobutton(WebDriver driver){
		element =  driver.findElement(By.cssSelector("input[name='optReq']"));
		return element;
	
	}
	
	public static WebElement PriorityRadiobutton(WebDriver driver){
		element =  driver.findElement(By.cssSelector("input[name='optPriority']"));
		return element;
	
	}
	
	public static WebElement AutomationRadiobutton(WebDriver driver){
		element =  driver.findElement(By.cssSelector("input[name='optAutomation']"));
		return element;
	
	}
	
	public static WebElement InventoryRadiobutton(WebDriver driver){
		element =  driver.findElement(By.cssSelector("input[name='optInventory']"));
		return element;
	
	}
	
	// Sectie: Issue Tracker Integration
	
	public static WebElement IssueTrackerRadiobutton(WebDriver driver){
		element =  driver.findElement(By.cssSelector("input[name='issue_tracker_enabled']"));
		return element;
	
	}
	
	public static WebElement IssueTrackerDropdown(WebDriver driver){
		element =  driver.findElement(By.name("issue_tracker_id"));
		return element;
	
	}
	
	// Sectie: Availability

	public static WebElement ActiveRadiobutton(WebDriver driver){
		element =  driver.findElement(By.cssSelector("input[name='active']"));
		return element;
	
	}		
	
	public static WebElement PublicRadiobutton(WebDriver driver){
		element =  driver.findElement(By.cssSelector("input[name='is_public']"));
		return element;
	
	}	
	
	// Sectie: Create of Cancel 
	
	public static WebElement CreateProjectButton(WebDriver driver){
		element =  driver.findElement(By.cssSelector("input[value='Create']"));
		return element;
	
	}			
	
	public static WebElement CancelProjectButton(WebDriver driver){
		element =  driver.findElement(By.cssSelector("input[value='Cancel']"));
		return element;
	
	}
	
	
	// !!!!!!!!!!! Test Specification !!!!!!!!!!!!	
	
	public static WebElement OpenTestSpecification(WebDriver driver){
		driver.switchTo().frame("mainframe");
		element =  driver.findElement(By.linkText("Test Specification"));
		return element;
	} 

	public static WebElement CreateTestSuite(WebDriver driver){
		element = driver.findElement(By.id("new_testsuite"));
		return element;
	}
	
	
	public static WebElement TestPlanNaam(WebDriver driver){
	element = driver.findElement(By.id("name"));
	return element;
	} 
	
	public static WebElement Kroesuway3000project(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='extdd-12']/span"));
		return element;
		} 
		
	

	public static WebElement CreateTCButton(WebDriver driver){
		element = driver.findElement(By.id("create_tc"));
		return element;
		} 
	
	
	public static WebElement TCNaam_beschrijving(WebDriver driver){
		element = driver.findElement(By.id("testcase_name"));
		return element;
		} 
	
		
	public static WebElement DropDown_status(WebDriver driver){
		element =  driver.findElement(By.id("tc_status"));
		return element;
	}
	
	public static WebElement DropDown_importance(WebDriver driver){
		element =  driver.findElement(By.name("importance"));
		return element;
	}

	public static WebElement DropDown_execution(WebDriver driver){
		element =  driver.findElement(By.name("exec_type"));
		return element;
	}
	
	public static WebElement Duration_field(WebDriver driver){
		element =  driver.findElement(By.id("estimated_execution_duration"));
		return element;
	}
	
	public static WebElement CreateTCinTP(WebDriver driver){
		element =  driver.findElement(By.id("do_create_button_2"));
		return element;
	}
	
	public static WebElement CancelTCinTP(WebDriver driver){
		element =  driver.findElement(By.id("go_back_2"));
		return element;
	}
	
	
	
	
}
