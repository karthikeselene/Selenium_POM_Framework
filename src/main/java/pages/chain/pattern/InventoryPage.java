package pages.chain.pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class InventoryPage {
	
	WebDriver driver;
	By ele_menu_btn = By.id("react-burger-menu-btn");
	By ele_logout_link = By.id("logout_sidebar_link");
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public InventoryPage verifyCurrentUrl(String resource) {
		String currentUrl = driver.getCurrentUrl();
		boolean actual = currentUrl.contains(resource);
		Assert.assertEquals(actual, true);
		return this;
	}
	
	public InventoryPage clickMenuListBtn() {
		driver.findElement(ele_menu_btn).click();
		return this;
	}
	
	public LoginPage clickLogoutBtn() {
		driver.findElement(ele_logout_link).click();
		return new LoginPage(driver);
	}
	

}