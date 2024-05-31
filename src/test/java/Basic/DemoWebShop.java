package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);	
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);	
		driver.findElement(By.className("email")).sendKeys("yadavsuraj2910@gmail.com");
		driver.findElement(By.className("password")).sendKeys("Surajyadav@2001");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
}
