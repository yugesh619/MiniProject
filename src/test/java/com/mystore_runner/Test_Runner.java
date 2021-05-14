package com.mystore_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mystore.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//mystore//feature",glue="com.mystore.stepdef",monochrome=true)
public class Test_Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void set_Up() {
		driver=Base_Class.browser("chrome");

	}
	@AfterClass
	public static void tearDown() {
		driver.close();

	}

}
