package PagesProject2;

import org.openqa.selenium.*;

public class BackToHome {
		WebDriver driver;
		By cart = By.id("back-to-products");
		
		public BackToHome(WebDriver driver) {
			this.driver=driver;
		}
		public void BacktoHomeClick() {
			driver.findElement(cart).click();
		} 
}
