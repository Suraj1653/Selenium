package com.crm.listernersCode;
import java.io.File;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateExtentReport implements ITestListener{

	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String name=result.getMethod().getMethodName();
		report.createTest(name);
		System.out.println("OnTestStart");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("OnTestSuccess");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
	    test.log(Status.FAIL, name+" is failed ");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		String name1 = result.getMethod().getMethodName();
		test.log(Status.SKIP, name1+" is skipiped ");
	}
	@Override
	public void onStart(ITestContext context) {
	 File path=new File("./ExtentReport/TestRun.html");
	 spark=new ExtentSparkReporter(path);
	 spark.config().setDocumentTitle("DemoWorkShop");
	 spark.config().setReportName("Harshad");
	 spark.config().setTheme(Theme.STANDARD);
	 
	 report=new ExtentReports();
	 report.setSystemInfo("OS", "Window-11");
	 report.setSystemInfo("Browser", "Chrome");
	 report.attachReporter(spark);
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("OnFinish");
	}
}