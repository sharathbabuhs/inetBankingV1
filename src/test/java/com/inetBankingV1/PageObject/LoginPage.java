package com.inetBankingV1.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

	}
	@FindBy(name="uid")
	WebElement txtUserName;

	@FindBy(name="password")
	WebElement passw;

	@FindBy(name="btnLogin")
	WebElement logbutton;

	@FindBy(xpath="//a[normalize-space()='Log out']")
	WebElement logout;


	public void setusername(String uname)
	{
		txtUserName.sendKeys(uname);
	}

	public void setupassward(String upass)
	{
		passw.sendKeys(upass);
	}
	public void clicksubmite()
	{
		logbutton.click();
	}
	public void clicklogout()
	{
		logout.click();
	}

}
