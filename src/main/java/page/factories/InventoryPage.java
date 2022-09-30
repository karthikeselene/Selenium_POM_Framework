package page.factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InventoryPage {
	
	WebDriver driver;
	
	@FindBy(id = "react-burger-menu-btn")
	WebElement ele_menu_btn;
	
	@FindBy(id = "logout_sidebar_link")
	WebElement ele_logout_link;
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyCurrentUrl(String resource) {
		String currentUrl = driver.getCurrentUrl();
		boolean actual = currentUrl.contains(resource);
		Assert.assertEquals(actual, true);
	}
	
	public void clickMenuListBtn() {
		ele_menu_btn.click();
	}
	
	public void clickLogoutBtn() {
		ele_logout_link.click();
	}
	

}