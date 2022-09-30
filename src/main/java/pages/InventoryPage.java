package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.ReadProperties;

public class InventoryPage {
	
	WebDriver driver;
	By ele_menu_btn = By.id(ReadProperties.getObjectRepositoryProp("InventoryPage", "inventory.burger.menu"));
	By ele_logout_link = By.id(ReadProperties.getObjectRepositoryProp("InventoryPage", "inventory.logout.link"));
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyCurrentUrl(String resource) {
		String currentUrl = driver.getCurrentUrl();
		boolean actual = currentUrl.contains(resource);
		Assert.assertEquals(actual, true);
	}
	
	public void clickMenuListBtn() {
		driver.findElement(ele_menu_btn).click();
	}
	
	public void clickLogoutBtn() {
		driver.findElement(ele_logout_link).click();
	}
	

}