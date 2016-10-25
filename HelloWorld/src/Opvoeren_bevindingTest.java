import static org.junit.Assert.*;

import org.junit.Test;


public class Opvoeren_bevindingTest {

	@Test
	public void TC01() {
		
		Opvoeren_bevinding TC01 = new Opvoeren_bevinding ();
		assertEquals ("true", TC01.Bevinding ( "PRO", "testleader", "Chrome"));
		
		
	}
		
	
}


