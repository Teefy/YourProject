package testuitvoer;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	Beoordeling_login_Test.class,
	LoginPortalTest.class,
	mantisops_dbTest.class,
	RapportageTest.class,
	TestlinkOpsTest.class
})

public class JunitTestSuite {   
}  	