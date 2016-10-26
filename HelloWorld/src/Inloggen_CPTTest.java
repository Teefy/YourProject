import static org.junit.Assert.*;

import org.junit.Test;


public class Inloggen_CPTTest {
	@Test
	public void TC1() 
	{
		Inloggen_CPT TC1 = new Inloggen_CPT();
		assertEquals("no", TC1.Inloggen01("PRO", "testleader", "Chrome"));
	}

	@Test
	public void TC2() 
	{
		Inloggen_CPT TC2 = new Inloggen_CPT();
		assertEquals("no", TC2.Inloggen02("PRO", "stakeholder", "Firefox"));
	}
	
	@Test
	public void TC3() 
	{
		Inloggen_CPT TC3 = new Inloggen_CPT();
		assertEquals("no", TC3.Inloggen03("PRO", "developer", "Chrome"));
	}
	
	@Test
	public void TC4() 
	{
		Inloggen_CPT TC4 = new Inloggen_CPT();
		assertEquals("no", TC4.Inloggen04("PRO", "projectmanager", "Firefox"));
	}
	
	@Test
	public void TC5() 
	{
		Inloggen_CPT TC5 = new Inloggen_CPT();
		assertEquals("no", TC5.Inloggen05("PRO", "testanalyst", "Chrome"));
	}
	
	@Test
	public void TC6() 
	{
		Inloggen_CPT TC6 = new Inloggen_CPT();
		assertEquals("no", TC6.Inloggen06("PRO", "testleader-error", "Chrome"));
	}
	
}
