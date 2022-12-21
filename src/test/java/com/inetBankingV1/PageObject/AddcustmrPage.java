package com.inetBankingV1.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddcustmrPage {
	WebDriver Idriver;
	public AddcustmrPage(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(how=How.XPATH,using="//a[text()=\"New Customer\"]")
	WebElement lnknewcustmr;

	@FindBy(how=How.NAME,using="name")
	WebElement txtcutmname;

	@FindBy(how=How.NAME,using="name")
	WebElement gender;

	@FindBy(how=How.ID,using="dob")
	WebElement dob;

	@FindBy(how=How.NAME,using="addr")
	WebElement Addres;

	@FindBy(how=How.NAME,using="city")
	WebElement city;

	@FindBy(how=How.NAME,using="state")
	WebElement state;

	@FindBy(how=How.NAME,using="pinno")
	WebElement pin;

	@FindBy(how=How.NAME,using="telephoneno")
	WebElement mobnum;

	@FindBy(how=How.NAME,using="emailid")
	WebElement email;

	@FindBy(how=How.NAME,using="password")
	WebElement pasword;

	@FindBy(how=How.NAME,using="sub")
	WebElement submit;

	public void Clicknewcustmr() {
		lnknewcustmr.click();

	}

	public void TextcustmrName(String cname) {
		txtcutmname.sendKeys(cname);

	}

	public void Cgender(String cgnd) {
		gender.click();

	}

	public void Cdob(String DD,String MM,String YY) {
		dob.sendKeys(DD);
		dob.sendKeys(MM);
		dob.sendKeys(YY);

	}
	public void Caddrs(String addrs) {
		Addres.sendKeys(addrs);

	}

	public void Ccity(String city1) {
		city.sendKeys(city1);

	}

	public void Cstate(String Cstate) {
		state.sendKeys(Cstate);

	}

	public void CPin(String CPin) {
		pin.sendKeys(CPin);

	}

	public void Cmobilenum(String Cmob) {
		mobnum.sendKeys(Cmob);
	}

	public void Cemail(String Cemail) {
		email.sendKeys(Cemail);

	}
	public void CPasw(String Cpass) {
		pasword.sendKeys(Cpass);

	}
	public void Submit() {
		submit.click();

	}

}
