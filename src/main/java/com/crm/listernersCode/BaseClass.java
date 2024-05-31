package com.crm.listernersCode;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass{
	protected WebDriver driver;
	
	 public String url;
	 public String username;
	 public String password;
	@Test
	@BeforeSuite
	public void beforeSuite() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Suraj\\eclipse-workspace\\com.crm.selenium.advanced\\src\\test\\resources\\Num.Properties");
		prop.load(fis);
		
	  url = prop.getProperty("url");
	  username = prop.getProperty("username");
	  password = prop.getProperty("password");
	}
	@BeforeTest
	public void beforeTest() {
		
	}
	@BeforeClass
	public void beforeClass() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to(url);
	
	
		
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
	@AfterMethod
	public void AfterMethod() {
		
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("afterclass");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("aftertest");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("aftersuite");
	}
}

