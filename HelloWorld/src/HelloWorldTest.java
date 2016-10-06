import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		
		HelloWorld hello = new HelloWorld();
			 		
		assertEquals("yes", hello.checkhome());

	}
}
