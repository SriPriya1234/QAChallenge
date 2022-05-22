package Scripts;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.collect.ImmutableMap;

import BaseLib.BaseLib;
import GenericFunctions.UtilityFunctions;
import PageObjects.CreateAccountPage;
import PageObjects.LoginPage;
import PageObjects.MainDashboardPage;
import PageObjects.MainPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SampleTest extends BaseLib{
	@BeforeClass
	public void initialsetup() throws MalformedURLException
	{
		BaseLib.installApps();
	}
	
	@Test
	public void VerifyCreateAccountFlow() throws IOException {
		SoftAssert softassert=new SoftAssert();
		String email=UtilityFunctions.getDatafromProperty("username");
		String firstname=UtilityFunctions.getDatafromProperty("firstname");
		String secondname=UtilityFunctions.getDatafromProperty("secondname");
		String password=UtilityFunctions.getDatafromProperty("password");
		UtilityFunctions.clickElement(MainPage.getCreateaccount_btn());
		UtilityFunctions.enterValueToTextBox(CreateAccountPage.getFirstname_txtbox(),firstname);
		UtilityFunctions.enterValueToTextBox(CreateAccountPage.getSecondname_txtbox(),secondname);
		UtilityFunctions.enterValueToTextBox(CreateAccountPage.getEmail_txtbox(),email);
		UtilityFunctions.enterValueToTextBox(CreateAccountPage.getPassword_txtbox(),password);
		UtilityFunctions.clickElement(CreateAccountPage.getCreateaccount_btn());
		UtilityFunctions.waitforfewseconds(3);
		softassert.assertTrue(UtilityFunctions.isElementVisible(MainPage.getLogin_btn()),"After creating account we not back to main page");
		softassert.assertAll();
	}
	
	@Test
	public void VerifyLoginFlow() throws IOException {
		SoftAssert softassert=new SoftAssert();
		String email=UtilityFunctions.getDatafromProperty("username");
		String firstname=UtilityFunctions.getDatafromProperty("firstname");
		String secondname=UtilityFunctions.getDatafromProperty("secondname");
		String password=UtilityFunctions.getDatafromProperty("password");
		UtilityFunctions.clickElement(MainPage.getLogin_btn());
		UtilityFunctions.enterValueToTextBox(LoginPage.getEmail_txtbox(),email);
		UtilityFunctions.enterValueToTextBox(LoginPage.getPassword_txtbox(),password);
		UtilityFunctions.clickElement(LoginPage.getLogin_btn());
		UtilityFunctions.waitforfewseconds(3); 
		softassert.assertTrue(UtilityFunctions.isElementVisible(MainDashboardPage.getLogout_btn()),"Logout button not there on dashboard page");
		softassert.assertTrue(UtilityFunctions.getTextFromElement(MainDashboardPage.getFirstname_lbl()).contains(firstname),"first name on dashboard page is not same as added");
		softassert.assertTrue(UtilityFunctions.getTextFromElement(MainDashboardPage.getLastname_lbl()).contains(secondname),"second name on dashboard page is not same as added");
		softassert.assertTrue(UtilityFunctions.getTextFromElement(MainDashboardPage.getLoggedin_lbl()).equalsIgnoreCase("User Logged In"),"Not getting success login greeting");
		UtilityFunctions.clickElement(MainDashboardPage.getLogout_btn());
		UtilityFunctions.waitforfewseconds(2);
		softassert.assertTrue(UtilityFunctions.isElementVisible(MainPage.getLogin_btn()),"After creating account we not back to main page");
		softassert.assertAll();
		
	}

	
}
