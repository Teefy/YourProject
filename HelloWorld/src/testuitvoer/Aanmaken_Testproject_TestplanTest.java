package testuitvoer;

import static org.junit.Assert.*;

import org.junit.Test;

import codebase.Aanmaken_Testproject_Testplan;
import codebase.Beoordeling_Testcases;
import codebase.LoginPortal;
import codebase.mantisops_db;

public class Aanmaken_Testproject_TestplanTest {

	@Test
	public void TC01() {
		
		Aanmaken_Testproject_Testplan TC01 = new Aanmaken_Testproject_Testplan();
		assertEquals ( "true", TC01.InloggenTestproject("PRO", "testleader", "Firefox"));

}
}