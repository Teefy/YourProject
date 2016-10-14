import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void TC1() {
		HelloWorld Tc1 = new HelloWorld();
		assertEquals("yes", Tc1.checkhome());
	}
	
	@Test
	public void TC2() 
	{
		mantisoperaties Tc2 = new mantisoperaties();
		assertEquals("yes", Tc2.Nieuwebevinding());
	}
}
