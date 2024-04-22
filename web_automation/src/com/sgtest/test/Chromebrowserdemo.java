package com.sgtest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowserdemo {

	public static WebDriver obrowser=null;
	static void launchbrowser()
	{
		try {
			obrowser=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void navigateurl()
	{
		try {
			obrowser.get("http://localhost/login.do");
			obrowser.findElement(By.id("username")).sendKeys("admin");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void closeapplication()
	{
		try {
			obrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		launchbrowser();
		navigateurl();
		closeapplication();
	}
}
