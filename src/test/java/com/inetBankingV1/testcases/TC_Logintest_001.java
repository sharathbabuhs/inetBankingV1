package com.inetBankingV1.testcases;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingV1.PageObject.LoginPage;

public class TC_Logintest_001 extends Baseclass {

@Test	
public void loginTest() throws IOException
{
	
	logger.info("url is opened");
	
	LoginPage lp = new LoginPage(driver);
	
	lp.setusername(uname);
	logger.info("user enter user name");
	
	lp.setupassward(upass);
	logger.info("user enter password");
	
	lp.clicksubmite();
	
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
		logger.info("login test pass");
	}
	else {
		captureScreen(driver,"loginTest");
		Assert.assertTrue(false );
		logger.info("login test fail");
	}
}

}
