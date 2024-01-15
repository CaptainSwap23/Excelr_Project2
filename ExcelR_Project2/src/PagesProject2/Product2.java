package PagesProject2;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product2 { 

	WebDriver driver;
	
	public Product2(WebDriver driver) { 
		this.driver = driver;  
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"item_0_title_link\"]/div") WebElement item;
	@FindBy(id="add-to-cart-sauce-labs-bike-light") WebElement addtocart;
	
	public void product2checkout() {
		LoginPage loginobj = new LoginPage(driver);
		LogoutPage logoutobj = new LogoutPage(driver);
		CartPage obj = new CartPage(driver);
		CheckoutPage obj2 = new CheckoutPage(driver);
		BackToHome obj3 = new BackToHome(driver);
		loginobj.login();
		item.click();
		addtocart.click();
		obj.cartclick();
		obj2.checkout();
		obj3.BacktoHomeClick();
		logoutobj.logout();
		
	}
	
}
