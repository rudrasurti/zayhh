/**
 * @author 
 */

/***************************************************/

package com.appium.tests;

import java.lang.reflect.Method;

import org.json.JSONObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appium.annotations.FrameworkAnnotation;
import com.appium.base.BaseTestMobile;
import com.appium.enums.AuthorType;
import com.appium.enums.CategoryType;
import com.appium.pages.CompanySettingsPage;
import com.appium.pages.HomePage;
import com.appium.pages.LoginPage;
import com.appium.pages.MyComapnyPage;
import com.driver.utils.TestUtils;

public class MyCompanyTests extends BaseTestMobile {

	LoginPage loginPage;
	HomePage homePage;
	CompanySettingsPage companySettingsPage;
	MyComapnyPage myComapnyPage;

	JSONObject loginUsers;

	@AfterClass
	public void afterClass() {
		// closeApp();
		// launchApp();
	}

	@BeforeMethod
	public void beforeMethod(Method method) {

		TestUtils.log().debug("---------------------------------------------------");
		TestUtils.log().debug("******************* Test started: " + method.getName() + "*******************");

		loginPage = new LoginPage();
		companySettingsPage = new CompanySettingsPage();
		myComapnyPage = new MyComapnyPage();
	}

	@AfterMethod
	public void afterMethod(Method method) {
		TestUtils.log().debug("******************* Test ended: " + method.getName() + "*******************");
		TestUtils.log().debug("---------------------------------------------------");
		// closeApp();
		// launchApp();

	}

	@FrameworkAnnotation(author = { AuthorType.RAHUL }, category = { CategoryType.SANITY, CategoryType.BVT,
			CategoryType.REGRESSION })
	@Test(groups = { "SANITY", "BVT", "REGRESSION" })
	public void checkUpdateComapnyAbout() throws InterruptedException {
		myComapnyPage.openMenu().openCompanySettings();
	}
}
