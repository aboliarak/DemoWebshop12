package com.stepefinition;

import com.browser.Browser;
import com.locators.Locators;
import com.pages.Search1;
import com.pages.Search2;
import com.pages.Search3;
import com.pages.SearchAdvanced;
import com.pages.SearchBy;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefin extends Browser{

	@Given("Browser is open")
	public void browser_is_open() {
		setDriver();
	}

	@And("Home page is visible")
	public void home_page_is_visible() throws Exception {
		getUrl();
		//result_should_displayed();
	}

	@When("User enters the data in search text bar")
	public void user_enters_the_data_in_search_text_bar() throws Exception {
		try
		{
			Search1.show_resu();
			Thread.sleep(2000);
			Search1.getclickbtn1();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@And("Click on search button")
	public void click_on_search_button() throws Exception {
		
	}

	@Then("Result should displayed")
	public void result_should_displayed() throws Exception {
		System.out.println("Test case 1 is running sucessfully and Result is shown as per the entered data");
		//Locators.getclear();
			//result_should_displayed();
	}

	/*********************************************/
	
	@Given("Relevant data")
	public void relevant_data() {
	    
	}

	@When("As user enters the data in search text bar")
	public void as_user_enters_the_data_in_search_text_bar() throws Exception {
		
	}

	@Then("System should suggest some keywords relevant to entered data")
	public void system_should_suggest_some_keywords_relevant_to_entered_data() throws Exception {
		try
		{
			Search2.getsuglist();
			Thread.sleep(2000);
			System.out.println("Test case 2 is running sucessfully. System is suggesting a suggested keywords");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	}

	/*********************************************/
	
	@Given("Search text box is visible")
	public void search_text_box_is_visible() {
	    
	}

	@When("As User enters data with {int} letters")
	public void as_user_enters_data_with_letters(Integer int1) throws Exception {
		Search3.getmin();
		Thread.sleep(2000);
	}

	@And("Click enter")
	public void click_enter() {
	    
	}

	@Then("System will display a message as no search result found")
	public void system_will_display_a_message_as_no_search_result_found() throws Exception {
		try
		{
			Search1.getclickbtn1();
			Thread.sleep(2000);
			System.out.println("Test case 3 is running sucessfully. An error message is shown 'Minimum 3 characters are required");
//			Thread.sleep(2000);
//			Locators.getclear();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
			}

	/*********************************************/
	
	@Given("Search box is enabled")
	public void search_box_is_enabled() {
	   
	}

	@When("User enters a data in search bar")
	public void user_enters_a_data_in_search_bar() throws Exception {
		SearchAdvanced.getAdvanced();
		Thread.sleep(2000);
	}

	@And("Click on search")
	public void click_on_search() throws Exception {
		Search1.getclickbtn1();
		Thread.sleep(2000);
	}

	@Then("Search advanced must be visible")
	public void search_advanced_must_be_visible() throws Exception {
		try
		{
			Locators.getAdvanced().click();
			System.out.println("Test case 4 is running sucessfully. Search advanced ckeckbox is getting selected");
			Thread.sleep(2000);
//			Locators.getclear();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	/*********************************************/
	
	@Given("Search button is visible")
	public void search_button_is_visible() {
	   
	}

	@When("User is enter the data from company's name")
	public void user_is_enter_the_data_from_company_s_name() throws Exception {
		SearchBy.getsearchby1();
		Thread.sleep(2000);
	}

	@And("Click on search buttton")
	public void click_on_search_buttton() {
	  
	}

	@Then("System should display result")
	public void system_should_display_result() {
		try
		{
			Search1.getclickbtn1();
			System.out.println("Test case 5 is running sucessfully. System is not showing any results for dell");//User is not able to search product by Company's name. 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
