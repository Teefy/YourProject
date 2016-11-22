package testuitvoer;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   LoginPortalTest.class,
   mantisops_dbTest.class
})

public class JunitTestSuite {   
}  	