package testuitvoer;

import static org.junit.Assert.*;

import org.junit.Test;

import codebase.Aanmaken_Testproject_Testplan;

public class Aanmaken_Testproject_TestplanTest {

	@Test
	public void TC01() throws InterruptedException {
		
		Aanmaken_Testproject_Testplan TC01 = new Aanmaken_Testproject_Testplan();
		assertEquals (true, TC01.InloggenTestproject("PRO", "testleader", "Chrome"));
	}
}