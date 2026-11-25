package testCases;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.InputStream;
import org.testng.ITestResult;
import io.qameta.allure.Allure;
import org.testng.ITestContext;
import org.testng.ITestListener;
//import org.testng.ITestResult;

//import io.qameta.allure.Allure;

public class CustomListeners implements ITestListener{
	
	InputStream is;
	
	@Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    }

    /*@Override
    public void onTestFailure(ITestResult result) {
		try {
			is = new FileInputStream("D:\\Projects\\RP Lumos - React\\Bug Screenshots\\IncorrectSiteVolumeByModality.png");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Allure.addAttachment("Screenshot", is);
    }*/
    
    @Override
    public void onTestFailure(ITestResult result) {
        Allure.addAttachment("Failure - " + result.getName(),
                String.valueOf(result.getThrowable()));
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }
    
}
