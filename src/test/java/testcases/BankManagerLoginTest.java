package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class BankManagerLoginTest extends BaseTest {
	
	@Test
	public void loginAsBankManager() throws InterruptedException {
		Thread.sleep(2000);
		click("bmlBtn_CSS");
		Assert.assertTrue(isElementPresent("addCustBtn_CSS"),"Add customer button not exists ");
		//Assert.fail("Bank Manager Test Failed");
	}

}
