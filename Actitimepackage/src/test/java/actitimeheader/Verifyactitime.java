package actitimeheader;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import actitmepakagemaveen.ActitimeHeader;
import actitmepakagemaveen.Loginpage;
import browsersetting.Base;

public class Verifyactitime extends Base{
	WebDriver driver;
	ActitimeHeader actitimeHeader;
	Loginpage loginpage;
	@Parameters ("browser")
	@BeforeTest
	public void launchbrowser(String browser){
	if(browser.equals("ChromeBrowser"))
	{
		driver =openChromeBrowser();
		}
	if(browser.equals("FirefoxBrowser"))
	{
		driver =openFirefoxBrowser();
		}
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	@BeforeClass
	public void launchBrowser() {
		 loginpage =new Loginpage(driver);
	actitimeHeader =new ActitimeHeader(driver);
	}
	
	@BeforeMethod
	public void logintoapplication() {
	driver.get("https://online.actitime.com/Vedang/login.do");
	loginpage.sendusername();
	loginpage.sendpassword();
	loginpage.selectkeepLoggedInCheckBox();
	loginpage.loginbutton();
	}
	@Test
	public void verifyTasktab() {
	actitimeHeader.clickOnTaskTab();
	String url = driver.getCurrentUrl();
	String title =driver.getTitle();
	
	System.out.println(url);
	System.out.println(title);
	
	if(url.equals("https://online.actitime.com/Vedang/tasks/tasklist.do"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	}
	@Test
	public void verifyreporttab() {
		actitimeHeader.clickOnReportTab();
		String url = driver.getCurrentUrl();
		String title =driver.getTitle();
		
		System.out.println(url);
		System.out.println(title);
		
		if(url.equals("https://online.actitime.com/Vedang/tasks/tasklist.do"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		}

	
	@AfterMethod
	public void logoutapplication() throws InterruptedException {
		Thread.sleep(3000);
	actitimeHeader.clickOnLogout();
	}
	@AfterClass
	public void clearPOMobject() {
		loginpage =null;
		actitimeHeader =null;
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
		driver =null; 
		System.gc();
		}
}