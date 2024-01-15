package PagesProject2;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Removeproduct {
	WebDriver driver;
	//constructor
	public Removeproduct(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="remove-sauce-labs-backpack") WebElement removeproduct;
	@FindBy(xpath="//*[@id=\"item_4_title_link\"]/div") WebElement verifyproduct;
	
	
	public void remove() {
		removeproduct.click();
		
		
		//verify product is removed
		try {
		System.out.println(verifyproduct.isDisplayed());
		}
		catch(Exception e) {
			System.out.println("Successfully removed");
		}
	}
	
}
