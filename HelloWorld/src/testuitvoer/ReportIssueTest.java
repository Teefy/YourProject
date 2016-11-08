package testuitvoer;
import static org.junit.Assert.*;

import org.junit.Test;

import codebase.mantisops_db;

public class ReportIssueTest {

	@Test
	public void TC1() 
	{
		mantisops_db Tc1 = new mantisops_db();
		assertEquals("yes", Tc1.ReportIssue("PRO", "developer", "Chrome", "1"));
	}

	@Test
	public void TC2() 
	{
		mantisops_db Tc2 = new mantisops_db();
		assertEquals("yes", Tc2.ReportIssue("PRO", "testanalyst", "Firefox", "1"));
	}
	
	@Test
	public void TC3()
	
	{
		mantisops_db Tc3 = new mantisops_db();
		assertEquals ("yes", Tc3.ReportIssue("PRO", "testleader" , "Chrome", "1"));	
	}
	
	@Test
	public void TC4()
	
	{
		mantisops_db Tc4 = new mantisops_db();
		assertEquals ("yes", Tc4.ReportIssue("PRO", "projectmanager" , "Firefox", "1"));	
	}
	
	@Test
	public void TC5()
	// Deze TC checked of de Stakeholder GEEN issues kan aanmaken
	{
		mantisops_db Tc5 = new mantisops_db();
		assertEquals ("yes", Tc5.ReportIssue("PRO", "stakeholder" , "Chrome", "1"));	
	}
	
	@Test
	public void TC6()
	// Deze TC checked of juiste inlog-error verschijnt
	{
		mantisops_db Tc6 = new mantisops_db();
		assertEquals ("yes", Tc6.ReportIssue("PRO", "testleader-error" , "Chrome", "1"));	
	}
	
	
}