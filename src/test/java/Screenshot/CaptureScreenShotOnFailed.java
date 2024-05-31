package Screenshot;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.listernersCode.BaseClass;
import com.crm.pom.DwsLoginPage;

public class CaptureScreenShotOnFailed extends  BaseClass{
@Test
public void dwsLoginCorrect() {
	driver.get("https://www.demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[text()='Login in']")).click();
	DwsLoginPage dws = new DwsLoginPage(driver);
	dws.username("admin01@gmail.com");
	dws.password("admin01");
	dws.login_button();
	driver.findElement(By.xpath("a[text()='Log out']")).click();
}
public void dwsLoginInCorrect() {
	driver.get("https://www.demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[text()='Login in']")).click();
	DwsLoginPage dws = new DwsLoginPage(driver);
	dws.username("admin01@gmail.com");
	dws.password("admin02");
	dws.login_button();
	driver.findElement(By.xpath("a[text()='Log out']")).click();
}
}