import static org.junit.Assert.*;

import org.junit.Test;


public class RapportageTest {

	@Test
	public void TC01() {
		Rapportage TC01 = new Rapportage ();
		assertEquals ("true", TC01.A ( "PRO", "testleader", "Chrome"));
	
			}
	
	@Test
	public void TC02() {
		Rapportage TC02 = new Rapportage ();
		assertEquals ("true", TC02.B ( "PRO", "testleader", "Chrome"));
	
			}
	@Test
	public void TC03() {
		Rapportage TC03 = new Rapportage ();
		assertEquals ("true", TC03.C ( "PRO", "testleader", "Chrome"));
	
			}
	@Test
	public void TC04() {
		Rapportage TC04 = new Rapportage ();
		assertEquals ("true", TC04.D ( "PRO", "testleader", "Firefox"));
	
			}
		@Test
	public void TC05() {
		Rapportage TC05 = new Rapportage ();
		assertEquals ("true", TC05.E ( "PRO", "testleader", "Firefox"));
	
			}
		@Test
		public void TC06() {
			Rapportage TC06 = new Rapportage ();
			assertEquals ("true", TC06.F ( "PRO", "testleader", "Firefox"));
		
				}
}
