package page.factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id = "user-name")
	WebElement ele_user_name; //driver.findElement(By.id("user-name")
	
	@FindBy(id = "password")
	WebElement ele_password;
	
	@FindBy(id = "login-button")
	WebElement ele_login_btn;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String uName) {
		ele_user_name.sendKeys(uName);
	}
	
	public void enterPassword(String pwd) {
		ele_password.sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		ele_login_btn.click();
	}

}