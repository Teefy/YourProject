package testuitvoer;
import static org.junit.Assert.*;

import org.junit.Test;

import codebase.mantisops_db;

public class LoginPortalTest {

	@Test
	public void TC1() 
	{
		mantisops_db Tc1 = new mantisops_db();
		assertEquals("yes", Tc1.ReportIssue("PRO", "testanalyst", "Chrome", "1"));
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
		assertEquals ("yes", Tc3.ViewIssue("PRO", "testanalyst" , "Chrome"));
	}
}
