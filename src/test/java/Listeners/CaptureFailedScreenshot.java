package Listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.crm.listernersCode.BaseClass1;

public class CaptureFailedScreenshot extends BaseClass1 implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(":","-");
		TakesScreenshot ts =(TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("./Screenshot/dws"+time+".png");
		try {
			FileHandler.copy(from, to);
		} catch ( IOException e) {
			e.printStackTrace();
		}
	}
}
