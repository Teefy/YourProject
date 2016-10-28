import static org.junit.Assert.*;

import org.junit.Test;


public class mantisops_dbTest {

	@Test
	public void TC1() 
	{
		mantisops_db Tc1 = new mantisops_db();
		assertEquals("yes", Tc1.reportissue("PRO", "developer", "Chrome", "1"));
	}


}
