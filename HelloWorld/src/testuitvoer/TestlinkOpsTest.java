package testuitvoer;

import static org.junit.Assert.*;

import org.junit.Test;

import codebase.TestlinkOps;

public class TestlinkOpsTest {

	@Test
	public void TC01() {
		
		TestlinkOps TC01 = new TestlinkOps();
		assertEquals ("true", TC01.createTestProject("PRO", "testleader", "Chrome"));
	}

	@Test
	public void TC02() {
		
		TestlinkOps TC02 = new TestlinkOps();
		assertEquals ( "true", TC02.createTestProject("PRO", "testleader", "Chrome"));
	}

}