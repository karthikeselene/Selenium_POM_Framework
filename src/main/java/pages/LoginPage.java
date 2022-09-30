package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReadProperties;

public class LoginPage {
	
	WebDriver driver;
	By ele_user_name = By.id(ReadProperties.getObjectRepositoryProp("LoginPage", "login.username.txt"));
	By ele_password = By.id(ReadProperties.getObjectRepositoryProp("LoginPage", "login.password.txt"));
	By ele_login_btn = By.id(ReadProperties.getObjectRepositoryProp("LoginPage", "login.singin.btn"));
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String uName) {
		driver.findElement(ele_user_name).sendKeys(uName);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(ele_password).sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		driver.findElement(ele_login_btn).click();
	}

}