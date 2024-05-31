package ExtentReport;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {
@Test
public void launchTheReport() {
	ExtentReports report = new ExtentReports();
	File path = new File("./ExtentReoprt/SampleReport.html");
	ExtentSparkReporter spark = new ExtentSparkReporter(path);
	spark.config().setDocumentTitle("Qspider");
	spark.config().setReportName("Suraj");
	spark.config().setTheme(Theme.DARK);
	report.attachReporter(spark);
	ExtentTest test1 = report.createTest("Test1");
	test1.log(Status.FAIL,"Login function error");
				
	report.flush();
	
}
}
