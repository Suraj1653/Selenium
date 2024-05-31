package ExtentReport;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.crm.listernersCode.BaseClass1;

public class ReportWithActualTestCases extends BaseClass1{
	ExtentReports report;
	ExtentTest test;
	@Test(priority = 0)
	public void dwsLoginCorrect()
	{
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
		@Test(priority = 1)
		public void dwsLoginIncorrect()
		{
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			
			driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("admin02");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}
		@Test(priority = 2)
		public void Redbus()
		{
			driver.get("https://www.redbus.in/");
			assertEquals("sush", "sushant");
		}
}