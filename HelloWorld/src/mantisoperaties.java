import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.thread.TestNGThread;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class mantisoperaties {

	
	public static void main(String[] args) {
	
		mantisoperaties.InternInloggen();
		
	}
	
	public static void InternInloggen(){
		
		System.setProperty("webdriver.chrome.driver", "c://windows/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
					String url = "http://accept.yourtestprojects.com/";
					driver.get(url);
					driver.findElement(By.name("name")).sendKeys("mvdweetering");
					driver.findElement(By.name("pass")).sendKeys("grand000");
					driver.findElement(By.name("op")).click();
					
	Nieuwebevinding();
				
	}
		
	public static void Nieuwebevinding() {
		
		// System.setProperty("webdriver.chrome.driver", "c://windows/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize(); 
		driver.findElement(By.linkText("Issues")).click();
			
	}
}
