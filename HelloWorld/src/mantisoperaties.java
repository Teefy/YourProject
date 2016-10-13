import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class mantisoperaties {
	
	public String Nieuwebevinding() 
	{
		inloggen inloggen = new inloggen();
		WebDriver driver = inloggen.InternInloggen();
		driver.manage().window().maximize(); 
		driver.findElement(By.linkText("KWF")).click();
		driver.findElement(By.linkText("GMS 360")).click();
		driver.findElement(By.linkText("Issues")).click();
		
		String a = driver.findElement(By.linkText("View Issues")).getText();
		String b = "View Issues";
		String returnvalue = null;
		   
		   if ((a).equals(b)) 
		   {
			System.out.println("Nieuwe bevinding");
			returnvalue = "yes";
		   }
		
		driver.close();
		return returnvalue;
	}
}
