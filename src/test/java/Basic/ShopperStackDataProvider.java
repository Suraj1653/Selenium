package Basic;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShopperStackDataProvider {
@Test(dataProvider="login")
	public void reciver(String email,String password) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.shoppersstack.com/");
	driver.findElement(By.id("loginBtn")).click();
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	Thread.sleep(2000);
	driver.close();	

	}
@DataProvider(name="login")
public Object[][] sender() throws EncryptedDocumentException, IOException{
return DataProviderUtility1.dwsLogin();
}
}