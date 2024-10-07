package Generic_utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportImp implements ITestListener{

	ExtentTest test;
	ExtentReports report;


	@Override
	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName());
		test.log(Status.PASS, result.getThrowable());
		System.out.println("Script Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName());
			test.log(Status.FAIL, result.getThrowable());
//			System.out.println("Script fail");

			System.out.println("----------im taking ScreenShot-----");
			String screenshot=null;
			try {
				screenshot = Webdriver_utility.takeScreenShot1(BaseClass.sdriver, result.getMethod().getMethodName());

			} catch (Throwable e) {

				e.printStackTrace();
			}
			test.addScreenCaptureFromPath(screenshot);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
//		test.log(Status.SKIP, result.getMethod().getMethodName());
//		test.log(Status.SKIP, result.getThrowable());
		System.out.println("Script skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		Java_utility jlib = new Java_utility();
		int ranNum = jlib.returnRandomNumber();

		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport/Report.html" + ranNum);
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("VtigerReport");
		spark.config().setReportName("Shobha");

		// System configuration
		report = new ExtentReports();

		report.attachReporter(spark);
		report.setSystemInfo("platform", "window10");
		report.setSystemInfo("executedBy", "SHOBHA");
		report.setSystemInfo("Reviewed By", "Rathin");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		
	}

	
}
