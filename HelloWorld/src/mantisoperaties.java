import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class mantisoperaties {
	
	public static void main(String[] args) 
	{
		Nieuwebevinding();
	}
	
	public static void Nieuwebevinding() 
	{
		inloggen inloggen = new inloggen();
		WebDriver driver = inloggen.InternInloggen();
		driver.manage().window().maximize(); 
		driver.findElement(By.linkText("KWF")).click();
		driver.findElement(By.linkText("GMS 360")).click();
		driver.findElement(By.linkText("Issues")).click();
	}
}
