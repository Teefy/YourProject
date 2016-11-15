package probeercode;

import static org.junit.Assert.*;

import org.junit.Test;
public class onderzoekbooltest {

	@Test
	public void test() {
		onderzoekbool onderzoekbool = new onderzoekbool();
		
		assertTrue(onderzoekbool.jaofnee());
		
	}
}
