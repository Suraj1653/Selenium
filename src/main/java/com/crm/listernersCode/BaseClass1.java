package com.crm.listernersCode;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 {
public static WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Welcome to the page");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("Thanks for coming");
	}
	@AfterClass
	public void AfterClass() {
		driver.quit();
	}
}
