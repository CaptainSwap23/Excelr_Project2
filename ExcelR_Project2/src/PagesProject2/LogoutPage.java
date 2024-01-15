package PagesProject2;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LogoutPage {
	WebDriver driver;
	//constructor
	public LogoutPage(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="react-burger-menu-btn") WebElement button;
	@FindBy(id="logout_sidebar_link") WebElement Logoutbtn;

	public void logout() {
		button.click();
		Logoutbtn.click();
		
	}
	
}
