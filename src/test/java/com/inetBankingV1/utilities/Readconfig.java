package com.inetBankingV1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	
	public Readconfig()
	{
		File src = new File("./Configuration\\Config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public String getApplicationUrl()
	{
		String url=pro.getProperty("url");
		return url;
	}

	public String getusername()
	{
		String username=pro.getProperty("uname");
		return username;
	}
	public String getpassword()
	{
		String userpassw=pro.getProperty("upass");
		return userpassw;
	}
	public String getchromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath; 
	}
	
	public String getFirefoxPath()
	{
		String firefox=pro.getProperty("firepath");
		return firefox; 
	}
	public String getiePath()
	{
		String ie=pro.getProperty("firepath");
		return ie; 
	}
	
	
}
