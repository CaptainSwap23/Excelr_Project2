package TestProject2;
import PagesProject2.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestClass {
	WebDriver driver;
	
	@BeforeTest
	public void Beforetest() {

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	} 
	
	@Test(priority =1)
	public void product1()	{
		Product1 obj = new Product1(driver);
		obj.product1checkout();
	}
	
	@Test(priority =2)
	public void product2() {
		Product2 obj = new Product2(driver);
		obj.product2checkout();
	}
	@Test(priority =3)
	public void product3() {
		Product3 obj = new Product3(driver);
		obj.product3checkout();
	}
	@Test(priority =4)
	public void product4() {
		Product4 obj = new Product4(driver);
		obj.product4checkout();
	}
	@Test(priority =5)
	public void product5() {
		Product5 obj = new Product5(driver);
		obj.product5checkout();
	}
	@Test(priority =6)
	public void product6() {
		Product6 obj = new Product6(driver);
		obj.product6checkout();
	}
	
	@Test(priority =7)
	public void logintest() {
		LoginPage loginobj = new LoginPage(driver);
		loginobj.login();
	}
	@Test(priority =8)
	public void logouttest() {
		LogoutPage logoutobj = new LogoutPage(driver);
		logoutobj.logout();
	}
	@Test(priority =9)
	public void Cartdisplaytest() {
		LoginPage loginobj = new LoginPage(driver);
		loginobj.login();
		CartPage obj = new CartPage(driver);
		obj.cartclick();
		obj.cartverify();
		
	}
	@Test(priority =10)
	public void HomePagedisplayTest() {
		HomePage obj = new HomePage(driver);
		obj.homepageclick();
		obj.homepageverify();
		
	}
	
	@Test(priority =11)
	public void addproductTest(){
		addproduct obj = new addproduct(driver);
		obj.add();
		
	}
	
	@Test(priority =12)
	public void RemoveproductTest() {
		Removeproduct obj = new Removeproduct(driver);
		obj.remove();
		
	}
	
	
	
	@AfterTest
	public void AfterTest() {
		//driver.quit();
}
	
}
