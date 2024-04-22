package com.sgtest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowserdemo {
	static WebDriver launchbrowser()
	{
		WebDriver obrowser = null;
		try {
			obrowser=new FirefoxDriver();
			return obrowser;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	static void navigateurl(WebDriver obrowser)
	{
		try {
			obrowser.navigate().to("http://localhost/login.do");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	static void closeapplication(WebDriver obrowser)
	{
		try {
			obrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		WebDriver wb=launchbrowser();
		navigateurl(wb);
		closeapplication(wb);
	}
}
