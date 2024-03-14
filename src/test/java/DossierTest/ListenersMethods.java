package DossierTest;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersMethods implements ITestListener, IInvokedMethodListener {

	Base Report = new Base();

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		IInvokedMethodListener.super.beforeInvocation(method, testResult);
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		IInvokedMethodListener.super.afterInvocation(method, testResult);
		Report.tearDown(testResult);

	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
		// TODO Auto-generated method stub
		IInvokedMethodListener.super.beforeInvocation(method, testResult, context);
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
		// TODO Auto-generated method stub
		IInvokedMethodListener.super.afterInvocation(method, testResult, context);
	}

	Base BSshot = new Base();

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		BSshot.ScreenShot();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
