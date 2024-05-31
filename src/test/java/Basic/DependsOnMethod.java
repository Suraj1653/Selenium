package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod {
@Test(priority = 3)
public void CreateAccount()
{WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.Marvel.com/");
driver.close();
	System.out.println("Account is Created");
}
@Test(priority = 2,dependsOnMethods = "CreateAccount")
public void ModifyAccount() 
{
	System.out.println("account has been Modified");
}
@Test(priority = 1)
public void deleteAccount()
{
	System.out.println("account has been Deleted");
}
}
