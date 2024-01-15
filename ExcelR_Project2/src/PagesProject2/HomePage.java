package PagesProject2;
import org.openqa.selenium.*;

public class HomePage {
		WebDriver driver;
		
		By menu = By.id("react-burger-menu-btn");
		By home = By.id("inventory_sidebar_link");

		By yourproducttext = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
		
		public HomePage(WebDriver driver) {
			this.driver=driver;
		}
		public void homepageclick() {
			driver.findElement(menu).click();
			driver.findElement(home).click();
		}
		
		public void homepageverify() {
			System.out.println(driver.findElement(yourproducttext).getText());
		}
		
}
 