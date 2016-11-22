package testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import testuitvoer.Beoordeling_login_Test;
import testuitvoer.RapportageTest;
import testuitvoer.TestlinkOpsTest;
import testuitvoer.mantisops_dbTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	Beoordeling_login_Test.class,
	mantisops_dbTest.class,
	RapportageTest.class,
	TestlinkOpsTest.class
})

public class JunitTestSuite {   
}  	