package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBasic {
@Test(dataProvider = "login")
public void receiver(String username,String password)throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	driver.navigate().to("https://demowebshop.tricentis.com/");
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("admin01");
	driver.findElement(By.cssSelector("input[value='Log in']")).click();
	Thread.sleep(2000);
	driver.close();
	
}
@DataProvider(name = "login")
public Object[][] Sender(){
	Object[][] obj = new Object[2][2];
	obj[0][0] ="admin01@gmail.com";
	obj[0][1] ="admin01";
	obj[1][0] ="admin01@gmail.com";
	obj[1][1] ="admin01";
	return obj;
}
}
