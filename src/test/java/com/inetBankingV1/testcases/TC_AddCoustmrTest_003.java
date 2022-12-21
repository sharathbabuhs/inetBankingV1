package com.inetBankingV1.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingV1.PageObject.AddcustmrPage;
import com.inetBankingV1.PageObject.LoginPage;

public class TC_AddCoustmrTest_003 extends Baseclass {
	
	@Test
	public void addNewCstmr() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setusername(uname);
		logger.info("User name is provided");
		lp.setupassward(upass);
		logger.info("User pawrd is provided");
		lp.clicksubmite();
		
		Thread.sleep(2000);
		AddcustmrPage addcut=new AddcustmrPage(driver);
		addcut.Clicknewcustmr();
		logger.info("Providing Custmr details....");
		addcut.TextcustmrName("sharath");
		addcut.Cgender("male");
		addcut.Cdob("08", "05", "91");
		Thread.sleep(2000);
		addcut.Caddrs("ramanagara");
		addcut.Ccity("channapatana");
		addcut.Cstate("karnataka");
		addcut.CPin("562160");
		addcut.Cmobilenum("9538584833");
		String email = randomeSting()+"@gmail.com";
		addcut.Cemail(email);
		addcut.CPasw("509me09034");
		addcut.Submit();
		
		logger.info("Validate Started...");
		Thread.sleep(2000);
		boolean res= driver.getPageSource().contains("Customer Registered Successfully!!");
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test Case is pass");
		}else {
			logger.info("Test Case is faile");
			captureScreen( driver,"AddCoustmrTest");
			Assert.assertTrue(false);
			
			
		}
	}

	
	
}
