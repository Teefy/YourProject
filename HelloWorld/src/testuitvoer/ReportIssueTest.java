package testuitvoer;
import static org.junit.Assert.*;

import org.junit.Test;

import codebase.mantisops_db;

public class ReportIssueTest {

	@Test
	public void TC1() throws InterruptedException 
	{
		mantisops_db Tc1 = new mantisops_db();
		assertTrue(Tc1.ReportIssue("PRO", "developer", "Chrome", "1"));
	}

	@Test
	public void TC2() throws InterruptedException 
	{
		mantisops_db Tc2 = new mantisops_db();
		assertTrue(Tc2.ReportIssue("PRO", "testanalyst", "Firefox", "1"));
	}
	
	@Test
	public void TC3() throws InterruptedException 
	
	{
		mantisops_db Tc3 = new mantisops_db();
		assertTrue (Tc3.ReportIssue("PRO", "testleader" , "Chrome", "1"));	
	}
	
	@Test
	public void TC4() throws InterruptedException 
	
	{
		mantisops_db Tc4 = new mantisops_db();
		assertTrue (Tc4.ReportIssue("PRO", "projectmanager" , "Firefox", "1"));	
	}
	
	@Test
	public void TC5() throws InterruptedException 
	// Deze TC checked of de Stakeholder GEEN issues kan aanmaken
	{
		mantisops_db Tc5 = new mantisops_db();
		assertTrue (Tc5.ReportIssue("PRO", "stakeholder" , "Chrome", "1"));	
	}
	
	@Test
	public void TC6() throws InterruptedException 
	// Deze TC checked of juiste inlog-error verschijnt
	{
		mantisops_db Tc6 = new mantisops_db();
		assertTrue (Tc6.ReportIssue("PRO", "testleader-error" , "Chrome", "1"));	
	}
	
	
}