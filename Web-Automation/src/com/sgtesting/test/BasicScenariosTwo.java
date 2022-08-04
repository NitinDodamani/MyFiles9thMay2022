package com.sgtesting.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenariosTwo
{
	public static  WebDriver obrowser=null;
	public static void main(String[] args)
	{
	launchBrowser();
	navigate();
	login();
	minimiseFlyoutWindow();
	createUser();
	modifyUser();
	logout();
	exitApplication();
	}
	public static void launchBrowser()
	{
		try
		{
			
		System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		obrowser=new ChromeDriver();
		Thread.sleep(5000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
			obrowser.get("http://localhost/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	public static void login()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void createUser()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo");
			obrowser.findElement(By.name("lastName")).sendKeys("userone");
			obrowser.findElement(By.name("email")).sendKeys("userdemo@gmail.com");
			obrowser.findElement(By.name("username")).sendKeys("demouser");
			obrowser.findElement(By.name("password")).sendKeys("123demo456");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("123demo456");
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void minimiseFlyoutWindow()
	{
		try
		{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modifyUser()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.name("password")).sendKeys("123456");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("123456");
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void exitApplication()
	{
		try
		{
			obrowser.close();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
