
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

		 public String checkhome() {
			 
		  System.setProperty("webdriver.chrome.driver", "c:/windows/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://www.teamliquid.net/");
		 		   
		   String a = "Home";
		   String b = driver.findElement(By.xpath("/html/body/div[@id='navwrapper']/div[@id='siteheader']/div[@id='navwrap']/ul[@class='smallnav']/li[1]/a")).getText();				      
		   String derp;
		   
		   if ((a).equals(b)) 
		   {
			System.out.println("Team Liquid Home");
			derp = "yes";
		   }
		    
		   else {
			   System.out.println("no");
			   derp = "no";
		  }
		   driver.close();
		   return derp;
		 }
}
