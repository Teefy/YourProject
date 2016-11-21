package testuitvoer;
import static org.junit.Assert.*;

import org.junit.Test;

import codebase.Rapportage;


public class RapportageTest {

	@Test
	public void TC01() throws InterruptedException {
		Rapportage TC01 = new Rapportage ();
		assertTrue(TC01.A ( "PRO", "testleader", "Chrome"));
	
			}
	
	@Test
	public void TC02() throws InterruptedException {
		Rapportage TC02 = new Rapportage ();
		assertTrue (TC02.B ( "PRO", "testleader", "Chrome"));
	
			}
	@Test
	public void TC03() throws InterruptedException {
		Rapportage TC03 = new Rapportage ();
		assertTrue ("true", TC03.C ( "PRO", "testleader", "Chrome"));
	
	}
	
}
