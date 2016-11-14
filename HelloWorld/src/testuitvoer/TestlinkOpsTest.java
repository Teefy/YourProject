package testuitvoer;

import static org.junit.Assert.*;

import org.junit.Test;

import codebase.TestlinkOps;

public class TestlinkOpsTest {
	
	
	@Test
	public void createTestProject_TC01() {
		
		TestlinkOps TC01 = new TestlinkOps();
		assertEquals ("true", TC01.createTestProject("PRO", "testleader", "Chrome"));
	}

	@Test
	public void createTestProject_TC02() {
		
		TestlinkOps TC02 = new TestlinkOps();
		assertEquals ( "false", TC02.createTestProjectFail("PRO", "testleader", "Chrome"));
	}

}