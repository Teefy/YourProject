import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPortal {
		
		public WebDriver inloggen(String Omgeving, String Rol) {
			
		String InlogUrl = null;
			 
		  System.setProperty("webdriver.chrome.driver", "c://windows//chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  // Variablen van productie- en acceptatieomgeving
		  if (Omgeving == "ACC") {
		  	   InlogUrl = "http://accept.yourtestprojects.com/";
		  }
		  
		  if (Omgeving == "PRO") {
			  InlogUrl = "http://www.yourtestprojects.com/";
		  }
		  
		  // Url  aan de hand van opgegeven ACC of PRO variable
		  driver.get(InlogUrl);
		  
		  // Formaat browser aanpassen
		  driver.manage().window().setSize(new Dimension(1280, 820));
		  
		  // Maximaal formaat browservenster
		  // driver.manage().window().maximize(); 
		  
		  // Variablen van diverse users/rollen
		  if (Rol == "developer") {
			  driver.findElement(By.name("name")).sendKeys("softwaredeveloper");
			  driver.findElement(By.name("pass")).sendKeys("cptYTP2016");
		  }
		  
		  if (Rol == "testanalyst") {
			  driver.findElement(By.name("name")).sendKeys("testanalyst");
			  driver.findElement(By.name("pass")).sendKeys("cptYTP2016");
		  }
		  
		  if (Rol == "testleader") {
			  driver.findElement(By.name("name")).sendKeys("testleader");
			  driver.findElement(By.name("pass")).sendKeys("cptYTP2016");
		  }
		  
		  if (Rol == "stakeholder") {
			  driver.findElement(By.name("name")).sendKeys("softwaredeveloper");
			  driver.findElement(By.name("pass")).sendKeys("cptYTP2016");
		  }
		  
		  if (Rol == "projectmanager") {
			  driver.findElement(By.name("name")).sendKeys("projectmanager");
			  driver.findElement(By.name("pass")).sendKeys("cptYTP2016");
		  }
		   
		  // Inloggen - submit button
		  driver.findElement(By.name("op")).click();
				  
		  // Verificatie inloggen
		  String a = "Log out";
		  String b = driver.findElement(By.linkText("Log out")).getText();				      
		  String message;
		   
		  if ((a).equals(b)) {
			   System.out.println("Inloggen op CP/T Portal gelukt als " + Rol + " in " + Omgeving + "-omgeving");
			   message = "yes";
		  }
		    
		  else {
			   System.out.println("Inloggen op CP/T Portal mislukt als " + Rol + " in " + Omgeving + "-omgeving");
			   message = "no";
		  }
		  return driver;
		  //driver.close();
		  		  
		 }

}


