package tests;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.chain.pattern.LoginPage;

public class TC002 extends ProjectSpecification {
	
	@Test
	public void test_ChainPattern() {
		new LoginPage(driver)
		.enterUserName("standard_user")
		.enterPassword("secret_sauce")
		.clickLoginBtn()
		.verifyCurrentUrl("inventory")
		.clickMenuListBtn()
		.clickLogoutBtn();
	}

}