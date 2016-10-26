import static org.junit.Assert.*;

import org.junit.Test;

public class LoginPortalTest {

	@Test
	public void TC1() 
	{
		mantisoperaties Tc1 = new mantisoperaties();
		assertEquals("yes", Tc1.Nieuwebevinding("PRO", "testanalyst", "Chrome"));
	}
/*
	@Test
	public void TC2() 
	{
		mantisoperaties Tc2 = new mantisoperaties();
		assertEquals("yes", Tc2.Nieuwebevinding("PRO", "testanalyst", "Firefox"));
	}
<<<<<<< HEAD
	*/
=======
	
	@Test
	public void TC3()
	
	{
		mantisoperaties Tc3 = new mantisoperaties();
		assertEquals ("yes", Tc3.ViewBevindingen("PRO", "testanalyst" , "Chrome"));
		
		
		
	}
	
	
	
>>>>>>> branch 'master' of https://github.com/Teefy/YourProject
}
