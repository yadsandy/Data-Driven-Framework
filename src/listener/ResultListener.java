/**
 * @author sandeepyadav
 *
 */
package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.WriteExcel;

public class ResultListener implements ITestListener {

	@Override
	public void onFinish(ITestContext Result) {

	}

	@Override
	public void onStart(ITestContext Result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {

	}

	// When Test case get failed, this method is called.
	WriteExcel we = new WriteExcel();

	@Override
	public void onTestFailure(ITestResult Result) {
		we.write("Fail");
	}

	// When Test case get Skipped, this method is called.
	@Override
	public void onTestSkipped(ITestResult Result) {
		we.write("Skipped");
	}

	// When Test case get Started, this method is called.
	@Override
	public void onTestStart(ITestResult Result) {
		
	}

	// When Test case get passed, this method is called.
	@Override
	public void onTestSuccess(ITestResult Result) {
		we.write("Pass");
	}

}
