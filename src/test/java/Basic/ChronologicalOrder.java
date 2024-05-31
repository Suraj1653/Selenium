package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {

@BeforeSuite
public void beforeSuit()
{
	System.out.println("Before Suite");
}
@BeforeTest
public void beforeTest()
{
	System.out.println("Before Test");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("Before class");
}
@BeforeMethod
public void beforeMethod()
{
	System.out.println("Before Method");
}
@Test
public void Test1()
{
	System.out.println("test 1");
}
@Test
public void Test2()
{
	System.out.println("test 2");
}
@Test
public void Test3()
{
	System.out.println("test 3");
}@Test
public void Test4()
{
	System.out.println("test 4");
}
@AfterMethod
public void AfterMethod()
{
	System.out.println("After Method");
}
@AfterClass
public void Afterclass()
{
	System.out.println("Afterclass");
}
@AfterTest
public void AfterTest()
{
	System.out.println("After Test");
}
@AfterSuite
public void AfterSuit()
{
	System.out.println(" AfterSuit");
}
}
