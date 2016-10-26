
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inloggen_CPT {
		
	public String Inloggen01(String Omgeving, String Rol, String Browser) 
	{
		LoginPortal PortalInloggen = new LoginPortal();
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
		driver.manage().window().maximize(); 
		
				//Vind geschreven tekst in element voor de Rollen
			WebElement userRol = driver.findElement(By.className("username")) ;
			System.out.println("Rol: " + userRol.getText());
		
		String actualrole = driver.findElement(By.className("username")).getText();
		String expectedRole = "testleader";
		String returnvalue = null;
		
		driver.close();  
		driver.quit(); 
		
		if ((actualrole).equals (expectedRole))
		{
			System.out.println("Geslaagd: userrol komt overeen (zie boven)");
		returnvalue = "no";
	   }
	   
	   else 
	   { 
			System.out.println("Fail: userrol komt niet overeen (zie boven)");
	   }
		
	   
	return returnvalue;
	}
//------------------------------------------------------------------------------------------------------------

	public String Inloggen02(String Omgeving, String Rol, String Browser) 
	{
		LoginPortal PortalInloggen = new LoginPortal();
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
		driver.manage().window().maximize(); 
		
				//Vind geschreven tekst in element voor de Rollen
			WebElement userRol = driver.findElement(By.className("username")) ;
			System.out.println("Rol: " + userRol.getText());
		
		String actualrole = driver.findElement(By.className("username")).getText();
		String expectedRole = "stakeholder";
		String returnvalue = null;
		
		driver.close();  
		driver.quit(); 
		
		if ((actualrole).equals (expectedRole))
		{
			System.out.println("Geslaagd: userrol komt overeen (zie boven)");
		returnvalue = "no";
	   }
	   
	   else 
	   { 
			System.out.println("Fail: userrol komt niet overeen (zie boven)");
	   }
		
	   
	return returnvalue;
	
	}
	//--------------------------------------------------------------------------------------------------------
	public String Inloggen03(String Omgeving, String Rol, String Browser) 
	{
		LoginPortal PortalInloggen = new LoginPortal();
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
		driver.manage().window().maximize(); 
		
				//Vind geschreven tekst in element voor de foutcode
		WebElement userRol = driver.findElement(By.className("username")) ;
		System.out.println("Rol: " + userRol.getText());
		
		String actualrole = driver.findElement(By.className("username")).getText();
		String expectedRole = "developer";
		String returnvalue = null;
		
		driver.close();  
		driver.quit(); 
		
		if ((actualrole).equals (expectedRole))
		{
			System.out.println("Geslaagd: userrol komt overeen (zie boven)");
		returnvalue = "no";
	   }
	   
	   else 
	   { 
			System.out.println("Fail: userrol komt niet overeen (zie boven)");
	   }
		
	   
	return returnvalue;
	
	}
//-----------------------------------------------------------------------------------------------------------
	
	public String Inloggen04(String Omgeving, String Rol, String Browser) 
	{
		LoginPortal PortalInloggen = new LoginPortal();
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
		driver.manage().window().maximize(); 
		
				//Vind geschreven tekst in element voor de foutcode
		WebElement userRol = driver.findElement(By.className("username")) ;
		System.out.println("Rol: " + userRol.getText());
		
		String actualrole = driver.findElement(By.className("username")).getText();
		String expectedRole = "projectmanager";
		String returnvalue = null;
		
		driver.close();  
		driver.quit(); 
		
		if ((actualrole).equals (expectedRole))
		{
			System.out.println("Geslaagd: userrol komt overeen (zie boven)");
		returnvalue = "no";
	   }
	   
	   else 
	   { 
			System.out.println("Fail: userrol komt niet overeen (zie boven)");
	   }
		
	   
	return returnvalue;
	
	}

//-----------------------------------------------------------------------------------------------------
	public String Inloggen05(String Omgeving, String Rol, String Browser) 
	{
		LoginPortal PortalInloggen = new LoginPortal();
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
		driver.manage().window().maximize(); 
		
				//Vind geschreven tekst in element voor de foutcode
		WebElement userRol = driver.findElement(By.className("username")) ;
		System.out.println("Rol: " + userRol.getText());
		
		String actualrole = driver.findElement(By.className("username")).getText();
		String expectedRole = "testanalyst";
		String returnvalue = null;
		
		driver.close();  
		driver.quit(); 
		
		if ((actualrole).equals (expectedRole))
		{
			System.out.println("Geslaagd: userrol komt overeen (zie boven)");
		returnvalue = "no";
	   }
	   
	   else 
	   { 
			System.out.println("Fail: userrol komt niet overeen (zie boven)");
	   }
		
	   
	return returnvalue;
	
	}
	//-----------------------------------------------------------------------------------------------------
		public String Inloggen06(String Omgeving, String Rol, String Browser) 
		{
			LoginPortal PortalInloggen = new LoginPortal();
			WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
			driver.manage().window().maximize(); 
			
					//Vind geschreven tekst in element voor de foutcode
			WebElement validatie = driver.findElement(By.id("information")) ;
			System.out.println("Validatie:  " + validatie.getText());
			
			String actualrole = driver.findElement(By.id("information")).getText();
			String expectedRole = "Sorry, unrecognized username or password.";
			String returnvalue = null;
			
			driver.close();  
			driver.quit(); 
			
			if ((actualrole).equals (expectedRole))
			{
				System.out.println("Validatie: Sorry, unrecognized username or password. ");
			returnvalue = "no";
		   }
		   
		   else 
		   { 
				System.out.println("Login geslaagd");
		   }
			
		   
		return returnvalue;
		
		}
}

