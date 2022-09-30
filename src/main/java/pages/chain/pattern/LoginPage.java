package pages.chain.pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	By ele_user_name = By.id("user-name");
	By ele_password = By.id("password");
	By ele_login_btn = By.id("login-button");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage enterUserName(String uName) {
		driver.findElement(ele_user_name).sendKeys(uName);
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {
		driver.findElement(ele_password).sendKeys(pwd);
		return this;
	}
	
	public InventoryPage clickLoginBtn() {
		driver.findElement(ele_login_btn).click();
		return new InventoryPage(driver);
	}

}