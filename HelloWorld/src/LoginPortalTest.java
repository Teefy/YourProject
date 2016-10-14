import static org.junit.Assert.*;

import org.junit.Test;

public class LoginPortalTest {

	@Test
	public void test() {
		
		LoginPortal test = new LoginPortal();
			 		 
		// Omgeving: PRO of ACC  
		// Rol: softwaredeveloper, testanalyst, testleader, stakeholder, projectmanager
		
		assertEquals("yes", (test.inloggen("ACC", "softwaredeveloper")));

	}
}