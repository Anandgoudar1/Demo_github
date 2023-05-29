package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Data1 implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
     System.out.println("Testcase is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
    System.out.println("Testcase failed captured screenshort");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase is skipped");
	}

}
