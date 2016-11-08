package testuitvoer;
import static org.junit.Assert.*;

import org.junit.Test;

import codebase.mantisops_db;

public class mantisops_dbTest { // Zie Testanalyse mbt Report Issue (nu allen Chrome tbv bruikbaarheid) - bijlage-functionaliteit ook nog 'weg-gecomment' vanwege systeempad (windows vs linux)

	@Test
	public void TC1_ReportIssue() 
	{
		mantisops_db Tc1 = new mantisops_db();
		assertEquals("yes", Tc1.ReportIssue("PRO", "developer", "Chrome", "1"));
	}
	
	@Test
	public void TC2_ReportIssue() // Deze TC checked naar een foutmelding (vandaar geslaagd bij 'no')
	{
		mantisops_db Tc2 = new mantisops_db();
		assertEquals("no", Tc2.ReportIssue("PRO", "testanalyst", "Chrome", "2"));
	}
	
	@Test
	public void TC3_ReportIssue() 
	{
		mantisops_db Tc3 = new mantisops_db();
		assertEquals("yes", Tc3.ReportIssue("PRO", "testleader", "Chrome", "3"));
	}
	
	@Test
	public void TC4_ReportIssue() // Deze TC checked naar een foutmelding (vandaar geslaagd bij 'no')
	{
		mantisops_db Tc4 = new mantisops_db();
		assertEquals("no", Tc4.ReportIssue("PRO", "developer", "Chrome", "4"));
	}
			
	@Test
	public void TC5_ReportIssue() 
	{
		mantisops_db Tc5 = new mantisops_db();
		assertEquals("yes", Tc5.ReportIssue("PRO", "projectmanager", "Chrome", "5"));
	}
			
	@Test// Deze TC checked naar een foutmelding (vandaar geslaagd bij 'no')
	public void TC6_ReportIssue() 
	{
		mantisops_db Tc6 = new mantisops_db();
		assertEquals("no", Tc6.ReportIssue("PRO", "testanalyst", "Chrome", "6"));
	}
			
	@Test // Deze TC checked naar een foutmelding (vandaar geslaagd bij 'no')
	public void TC7_ReportIssue() 
	{
		mantisops_db Tc7 = new mantisops_db();
		assertEquals("no", Tc7.ReportIssue("PRO", "testleader", "Chrome", "7"));
	}
			
	@Test // Deze TC checked of de Stakeholder GEEN issues kan aanmaken
	public void TC8_ReportIssue()
	{
		mantisops_db Tc8 = new mantisops_db();
		assertEquals ("no", Tc8.ReportIssueSH("PRO", "stakeholder", "Chrome"));	
	}
	
	
	/*
	
	@Test
	public void TC9_LoginError()
	// Deze TC checked of juiste inlog-error verschijnt
	{
		mantisops_db Tc9 = new mantisops_db();
		assertEquals ("yes", Tc9.LoginError("PRO", "testleader-error" , "Chrome"));	
	}
	
	*/
}
	
