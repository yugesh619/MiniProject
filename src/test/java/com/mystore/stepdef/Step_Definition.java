package com.mystore.stepdef;

import org.openqa.selenium.WebDriver;

import com.mystore.baseclass.Base_Class;
import com.mystore.pom.Mystore_Pom;
import com.mystore_runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	public static WebDriver driver=Test_Runner.driver;
	public static Mystore_Pom pom=new Mystore_Pom(driver);
	
	@Given("^user Launch The  Mystore Url$")
	public void user_Launch_The_Mystore_Url() throws Throwable {
	    url("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	
	@When("^user Enter The Email Id In The Email Field$")
	public void user_Enter_The_Email_Id_In_The_Email_Field() throws Throwable {
	   d_sendkeys(pom.getEmail(),"yugeshkumar01@gmail.com");
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
	    d_sendkeys(pom.getPassword(),"Yugesh@1234");
	}

	@Then("^user Click On The Sigin Button To Go To Next Page$")
	public void user_Click_On_The_Sigin_Button_To_Go_To_Next_Page() throws Throwable {
	    to_Click(pom.getLogin());
	}

	@Given("^user Select The Women Section$")
	public void user_Select_The_Women_Section() throws Throwable {
		movetoElement(pom.getSelectwomen());
	}

	@When("^user Moveto Evening Dress Type$")
	public void user_Moveto_Evening_Dress_Type() throws Throwable {
	    d_actions(pom.getEvegdress());
	}

	@Then("^user Select The dresses$")
	public void user_Select_The_dresses() throws Throwable {
	    to_Click(pom.getQuickview());
	}
	@Then("^user Enter Into Frames$")
	public void user_Enter_Into_Frames() throws Throwable {
	    d_frames(pom.getFrames());
	}

	@Then("^User Select The Add To Kart$")
	public void user_Select_The_Add_To_Kart() throws Throwable {
	   framess(pom.getAddtokart());
	}

	@Then("^user Select The Proceed To Checkout$")
	public void user_Select_The_Proceed_To_Checkout() throws Throwable {
	    Thread.sleep(5000);
		actionss(pom.getCheckout());
	}

	@Then("^user select The Proceed To Checkout For Summary$")
	public void user_select_The_Proceed_To_Checkout_For_Summary() throws Throwable {
	    actionss(pom.getSumary());
	}

	@Then("^user Select The Address For Delivery$")
	public void user_Select_The_Address_For_Delivery() throws Throwable {
	   actionss(pom.getAdress());
	}

	@Then("^user Select The Terms And Conditions$")
	public void user_Select_The_Terms_And_Conditions() throws Throwable {
	    actionss(pom.getCheckbox());
	}
	
	@Then("^user Select The Shipping$")
	public void user_Select_The_Shipping() throws Throwable {
	actionss(pom.getSubmit());    
	}

	@Then("^user Choose The Payby Bank Wire Mode$")
	public void user_Choose_The_Payby_Bank_Wire_Mode() throws Throwable {
	    actionss(pom.getBank());
	}

	@Then("^user Confirm The Order$")
	public void user_Confirm_The_Order() throws Throwable {
	   actionss(pom.getConfirm());
	}



}
