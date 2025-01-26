package utility;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import base.Base;


public class ListenersClass extends Base implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart" + result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess" + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure " + result.getName());

		String filename = System.getProperty("user.dir") + "\\target\\screenshots\\" + result.getName()
				+ generateNumber() + ".jpg";
		// System.out.println(filename);
		generateScheenshot(filename);

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped" + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	public void onStart(ITestContext context) {
		System.out.println("onStart");
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
	}

}
