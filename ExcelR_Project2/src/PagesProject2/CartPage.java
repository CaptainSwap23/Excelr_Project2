package PagesProject2;
import org.openqa.selenium.*;

public class CartPage {
		WebDriver driver;
		
		By cart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
		By yourcarttext = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
		
		public CartPage(WebDriver driver) {
			this.driver=driver;
		}
		public void cartclick() {
			driver.findElement(cart).click();
		}
		
		public void cartverify() {
			System.out.println(driver.findElement(yourcarttext).getText());
		}
		
}
 