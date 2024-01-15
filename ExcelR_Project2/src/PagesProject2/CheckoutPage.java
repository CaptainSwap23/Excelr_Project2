package PagesProject2;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage { 

	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) { 
		this.driver = driver;  
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="checkout") WebElement checkoutbtn;
	@FindBy(id="first-name") WebElement firstname;
	@FindBy(id="last-name") WebElement lastname;
	@FindBy(id="postal-code") WebElement zipcode;
	@FindBy(id="continue") WebElement countinue;
	@FindBy(id="finish") WebElement finish;

	public void checkout() {
		 
		checkoutbtn.click();
		firstname.sendKeys("Swapnil");
		lastname.sendKeys("Gandge");
		zipcode.sendKeys("431131");
		countinue.click();
		finish.click();
	}
	
}

