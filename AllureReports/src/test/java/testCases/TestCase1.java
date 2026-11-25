package testCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Allure Examples")
@Feature("User Login & Registration")
public class TestCase1 extends BaseTest{
	
	@Test
	@Story("User Login")
	@Description("Test for User Login")
	@Severity(SeverityLevel.CRITICAL)
	public void doLogin() throws FileNotFoundException {
		System.out.println("User logged in successfully!");
	}
	
	@Test
	@Story("Standard User Registration")
	@Description("Test for User Registration")
	@Severity(SeverityLevel.BLOCKER)
	public void doUserReg() {
		Assert.fail("Standard User Registration got failed!");
	}

	@Test
	@Story("Skip Test")
	@Description("Test to be Skipped")
	public void isSkip() {
		throw new SkipException("Test case skipped!");
	}
	
	@Test
	@Story("User Registration with SSO")
	@Description("Test for User Registration with Single Sign-On")
	@Severity(SeverityLevel.BLOCKER)
	public void doUserReg2() {
		Assert.fail("User Registration with SSO got failed!");
	}
}
