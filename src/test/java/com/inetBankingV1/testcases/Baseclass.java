package com.inetBankingV1.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBankingV1.utilities.Readconfig;

public class Baseclass {
	Readconfig read=new Readconfig();
	public String url= read.getApplicationUrl();
	public String uname= read.getusername();
	public String upass= read.getpassword();

	
	public static WebDriver driver;	
	public static Logger logger;
	
   @Parameters("browser")
	@BeforeClass

	public void setup(String br)
	{
	   logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome"))
				{
			System.setProperty("webdriver.chrome.driver",read.getchromepath());
			driver= new ChromeDriver();
			//WebDriverManager.chromedriver().setup();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",read. getFirefoxPath());
			driver= new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",read. getiePath());
			driver= new InternetExplorerDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	driver.get(url);
		driver.manage().window().maximize();
	}
@AfterClass
public void teardown()
{
	driver.close();
}
public void captureScreen(WebDriver driver,String tname) throws IOException
{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
	FileUtils.copyFile(src, target);
	System.out.println("Screenshot taken");
}
public String randomeSting()
{
	String gnrtdString= RandomStringUtils.randomAlphabetic(8);
	return (gnrtdString);
}
public String randomenum()
{
	String gnrtdString2 = RandomStringUtils.randomNumeric(4);
	return (gnrtdString2);
}
}
