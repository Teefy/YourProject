import static org.junit.Assert.*;

import org.junit.Test;

public class ReportIssueTest {

	@Test
	public void TC1() 
	{
		mantisoperaties Tc1 = new mantisoperaties();
		assertEquals("yes", Tc1.Nieuwebevinding("PRO", "developer", "Chrome"));
	}

	@Test
	public void TC2() 
	{
		mantisoperaties Tc2 = new mantisoperaties();
		assertEquals("yes", Tc2.Nieuwebevinding("PRO", "testanalyst", "Firefox"));
	}
	
	@Test
	public void TC3()
	
	{
		mantisoperaties Tc3 = new mantisoperaties();
		assertEquals ("yes", Tc3.Nieuwebevinding("PRO", "testleader" , "Chrome"));	
	}
	
	@Test
	public void TC4()
	
	{
		mantisoperaties Tc4 = new mantisoperaties();
		assertEquals ("yes", Tc4.Nieuwebevinding("PRO", "projectmanager" , "Firefox"));	
	}
	
	@Test
	public void TC5()
	// Deze TC checked of de Stakeholder GEEN issues kan aanmaken
	{
		mantisoperaties Tc5 = new mantisoperaties();
		assertEquals ("yes", Tc5.NieuwebevindingSH("PRO", "stakeholder" , "Chrome"));	
	}
	
	@Test
	public void TC6()
	// Deze TC checked of juiste inlog-error verschijnt
	{
		mantisoperaties Tc6 = new mantisoperaties();
		assertEquals ("yes", Tc6.inlogError("PRO", "testleader-error" , "Chrome"));	
	}
	
	
}