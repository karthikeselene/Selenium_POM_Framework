package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.InventoryPage;
import pages.LoginPage;


public class TC001 extends ProjectSpecification {
	
	LoginPage login;
	InventoryPage inventory;

	@BeforeClass
	public void setUp() {		
		login = new LoginPage(driver);
		inventory = new InventoryPage(driver);
	}

	@Test
	public void tc01_Logintest() {		
		login.enterUserName("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLoginBtn();
		inventory.verifyCurrentUrl("inventory");
		inventory.clickMenuListBtn();
		inventory.clickLogoutBtn();
	}

	@AfterClass
	public void tearDown() {
		login = null;
		inventory = null;
	}	

}