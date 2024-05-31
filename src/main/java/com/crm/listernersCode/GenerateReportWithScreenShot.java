package com.crm.listernersCode;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateReportWithScreenShot extends BaseClass1 implements ITestListener {
	public ExtentReports Report;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test = Report.createTest(name);
		test.log(Status.INFO,"Welcome to our Class");
		test.log(Status.INFO,"My Wonderfull");
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		 test.log(Status.PASS,"your test case has passed");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,"Your test case has failed");
		TakesScreenshot tss = (TakesScreenshot) driver;
		String from = tss.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,"is Skipped");	
	}
	@Override
	public void onStart(ITestContext context) {
		File path = new File("ExtentReportss/TestRun.html");
		spark = new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("First");
		spark.config().setReportName("omkar");
		spark.config().setTheme(Theme.STANDARD);
		
		Report = new ExtentReports();
		Report.setSystemInfo("os", "window-11");
		Report.setSystemInfo("browser","chrome");
		Report.attachReporter(spark);
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("OnFinish");
		Report.flush();
	}
}