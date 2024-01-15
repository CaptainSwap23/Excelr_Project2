package PagesProject2;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class addproduct {
	WebDriver driver;
	//constructor
	public addproduct(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack") WebElement addproduct;
	@FindBy(xpath="//*[@id=\"item_4_title_link\"]/div") WebElement verifyproduct;
	
	
	
	public void add() {
		CartPage obj = new CartPage(driver);
		addproduct.click();
		obj.cartclick();
		
		//verify product is added
		System.out.println(verifyproduct.getText());
		
	}
	
}
