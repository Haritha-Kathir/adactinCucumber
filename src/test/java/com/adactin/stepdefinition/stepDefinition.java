package com.adactin.stepdefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.adactin.runner.TestRunner;
import com.fasterxml.jackson.databind.Module.SetupContext;
import com.sun.org.apache.bcel.internal.classfile.PMGClass;

import baseClass.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sdp.pageobjectmanager;

public class stepDefinition extends Baseclass {

	public static WebDriver driver1 = TestRunner.driver;

	public static pageobjectmanager pm = new pageobjectmanager(driver);

	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {

		//getUrl("https://adactinhotelapp.com/");
		
		getUrl("url");

	}
	
	
	@When("^user Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String username) throws Throwable {
	   
		inputValuestoElement(pm.getLp().getUsername(),username );
	}

	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {
	   
		inputValuestoElement(pm.getLp().getPassword(), password);
	}


//	@When("^user Enter The Username In The Username Field$")
//	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
//
//		inputValuestoElement(pm.getLp().getUsername(), "Haritha11");
//
//	}
//
//	@When("^user Enter The Password In The Password Field$")
//	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
//
//		sendText(pm.getLp().getPassword(), "R3230N");
//
//	}

	@Then("^user Click The Login Button And Navigate to Search Hotel Page$")
	public void user_Click_The_Login_Button_And_Navigate_to_Search_Hotel_Page() throws Throwable {

		elementClick(pm.getLp().getLogin());

	}

	@When("^user Select The Location From Select Location Dropdown$")
	public void user_Select_The_Location_From_Select_Location_Dropdown() throws Throwable {

		selectValuesfromDD(pm.getSp().getLocation(), "index", "3");

	}

	@When("^user Select The Hotel From Select Hotel Dropdown$")
	public void user_Select_The_Hotel_From_Select_Hotel_Dropdown() throws Throwable {

		selectValuesfromDD(pm.getSp().getHotel(), "index", "2");

	}

	@When("^user Select The Room Type From Select Room Type Among Standard,Double,Deluxe,Super Deluxe$")
	public void user_Select_The_Room_Type_From_Select_Room_Type_Among_Standard_Double_Deluxe_Super_Deluxe()
			throws Throwable {

		selectValuesfromDD(pm.getSp().getRoom(), "Value", "Super Deluxe");

	}

	@When("^user Select The Number Of Rooms From The Number of Rooms Dropdown$")
	public void user_Select_The_Number_Of_Rooms_From_The_Number_of_Rooms_Dropdown() throws Throwable {

		selectValuesfromDD(pm.getSp().getNos(), "Value", "3");

	}

	@When("^user Enter Check In Date In Format Of \\(dd/mm/yyyy\\)$")
	public void user_Enter_Check_In_Date_In_Format_Of_dd_mm_yyyy() throws Throwable {

		sendText(pm.getSp().getPickin(), "03/07/2023");

	}

	@When("^user Enter Check Out Date In Format Of \\(dd/mm/yyyy\\)$")
	public void user_Enter_Check_Out_Date_In_Format_Of_dd_mm_yyyy() throws Throwable {

		sendText(pm.getSp().getPickout(), "02/08/2023");

	}

	@When("^user Select Adults Rooms From From Adult Per Room$")
	public void user_Select_Adults_Rooms_From_From_Adult_Per_Room() throws Throwable {

		selectValuesfromDD(pm.getSp().getAdult(), "index", "2");

	}

	@When("^user Select Children Room From Children Per Room$")
	public void user_Select_Children_Room_From_Children_Per_Room() throws Throwable {
		
		selectValuesfromDD(pm.getSp().getChild(), "index", "3");

	}

	@Then("^user Click The Search Button And Navigate To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_Navigate_To_Select_Hotel_Page() throws Throwable {

		elementClick(pm.getSp().getSearch());

	}

	@When("^user Click The Radio Button To Select the Hotel From Booked Itinerary$")
	public void user_Click_The_Radio_Button_To_Select_the_Hotel_From_Booked_Itinerary() throws Throwable {

		elementClick(pm.getSe().getRadio());

	}

	@Then("^user Click the Continue Button And Navigate to Book A Hotel Page$")
	public void user_Click_the_Continue_Button_And_Navigate_to_Book_A_Hotel_Page() throws Throwable {

		elementClick(pm.getSe().getClick());

	}

	@When("^user Enter The First Name In The First Name Field$")
	public void user_Enter_The_First_Name_In_The_First_Name_Field() throws Throwable {

		sendText(pm.getBp().getFirstname(), "Haritha");

	}

	@When("^user Enter The Last Name In The Last Name Field$")
	public void user_Enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {

		sendText(pm.getBp().getLast(), "Kathir");

	}

	@When("^user Enter The Address For Billing In The Billing Address$")
	public void user_Enter_The_Address_For_Billing_In_The_Billing_Address() throws Throwable {

		sendText(pm.getBp().getAddress(), "Ambattur,chennai");

	}

	@When("^user Enter The Credit Card Number In The Credit Card Field \\(Limit (\\d+) digits\\)$")
	public void user_Enter_The_Credit_Card_Number_In_The_Credit_Card_Field_Limit_digits(int arg1) throws Throwable {

		sendText(pm.getBp().getCc(), "1234567891011121");

	}

	@When("^user Select The credit Card Type From The Credit Card DropDown$")
	public void user_Select_The_credit_Card_Type_From_The_Credit_Card_DropDown() throws Throwable {

		selectValuesfromDD(pm.getBp().getCc_type(), "Value", "MAST");

	}

	@When("^user Select The Expiry Date From The Select Month DropDown$")
	public void user_Select_The_Expiry_Date_From_The_Select_Month_DropDown() throws Throwable {

		selectValuesfromDD(pm.getBp().getMonth(), "index", "5");

	}

	@When("^user Select The Expiry Year in Expiry Date Dropdown$")
	public void user_Select_The_Expiry_Year_in_Expiry_Date_Dropdown() throws Throwable {

		selectValuesfromDD(pm.getBp().getYear(), "value", "2025");

	}

	@When("^user Enter The CVV Number In The CVV Number Field$")
	public void user_Enter_The_CVV_Number_In_The_CVV_Number_Field() throws Throwable {

		sendText(pm.getBp().getCvv(), "255");

	}

	@Then("^user Click The Book Now Button And Navigate To Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_Navigate_To_Booking_Confirmation_Page() throws Throwable {

		elementClick(pm.getBp().getBook());
		;

	}

	@Then("^user Click The Logout Button  And Navigate To Successfully logged Out Page$")
	public void user_Click_The_Logout_Button_And_Navigate_To_Successfully_logged_Out_Page() throws Throwable {

		elementClick(pm.getLo().getLog());

	}

}
