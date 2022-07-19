package org.facebook;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utility.BaseClass;

public class FrontWorks extends BaseClass {
	
	@BeforeClass
	public static void beforeClass() {
	
		launchBrowser("chrome");		
		maximize();
		implicitWait(10);		

	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		Date d=new Date();
		System.out.println("Before....."+d);
	}

	@AfterMethod
	public void afterMethod() {

		Date d=new Date();
		System.out.println("After....."+d);	
	}
	
	@AfterClass
	public static void afterClass() throws InterruptedException {
		
//		Thread.sleep(3000);
//		quit();
		
	}
	
	
	@Test
	public void test1() throws InterruptedException {
		
		urlLaunch("https://www.facebook.com/");
		Login l=new Login();
		sendkeys(l.getTxtUser(),"karthi");
		sendkeys(l.getTxtPass(),"3645765");
		click(l.getBtnLogin());
		Thread.sleep(3000);

	}
	
	@Test
	public void test2() {
		
		urlLaunch("https://www.facebook.com/");
		Registration r=new Registration();
		click(r.getBtnCreate());
		sendkeys(r.getFirstName(), "karthi");
		sendkeys(r.getLastName(), "keyan");
		sendkeys(r.getMobileNo(), "4567298373");
		sendkeys(r.getNewPassword(), "89076");
		click(r.getBtnSignup());

	}
	
	
}
