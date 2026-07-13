package testCases;

import org.testng.annotations.BeforeSuite;

public class BaseTest {

	@BeforeSuite
	public void beforeSuite() throws Exception {

	    System.out.println("Inside BeforeSuite");

	    EnvironmentWriter.createEnvironmentFile();

	    System.out.println("Environment file created");
	}
}