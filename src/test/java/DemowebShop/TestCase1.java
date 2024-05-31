package DemowebShop;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.listernersCode.BaseClass;
@Listeners(com.crm.listernersCode.DwsLogin.class)
public class TestCase1 extends BaseClass{

@Test
public void addToCart() {
	driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
}
}
