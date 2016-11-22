package testuitvoer;

import static org.junit.Assert.*;

import org.junit.Test;

import codebase.TestlinkOps;

public class TestlinkOpsTest {
	
	//vuile !@!@#
	@Test
	public void createTestProject_TC01() throws InterruptedException {
		
		TestlinkOps TC01 = new TestlinkOps();
		assertEquals (true, TC01.createTestProject("PRO", "testleader", "Chrome"));
	}

	@Test
	public void createTestProject_TC02() throws InterruptedException {
		
		TestlinkOps TC02 = new TestlinkOps();
		assertEquals (false, TC02.createTestProjectFail("PRO", "testleader", "Chrome"));
	}
	
	@Test
	public void createTestSpecsTC_TC01() throws InterruptedException {
		
		TestlinkOps TC01 = new TestlinkOps();
		assertEquals (true, TC01.createTestSpecsTC("PRO", "testleader", "Chrome"));
	}
	
	@Test
	public void createTestSpecsTC_TC02() throws InterruptedException {

		TestlinkOps TC02 = new TestlinkOps();
		assertEquals (false, TC02.createTestSpecsTCFail("PRO", "testleader", "Chrome"));
	}
}