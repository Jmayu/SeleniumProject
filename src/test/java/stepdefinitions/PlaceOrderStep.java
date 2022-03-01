package stepdefinitions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;

import demoBlazePages.CartPage;
import demoBlazePages.FormPage;
import demoBlazePages.HomePage;
import demoBlazePages.LogInPage;
import demoBlazePages.PlaceOrderPage;
import demoBlazePages.ProductAddPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PlaceOrderStep extends TestBase{
	LogInPage loginP;
	HomePage homeP;
	CartPage cartP;
	PlaceOrderPage placeOrderP;
	FormPage formP;
	
	public PlaceOrderStep() {
		super();
	}
	
	@Given("user is on placeorder page")
	public void user_is_on_placeorder_page() throws InterruptedException {
		initialization();
		loginP=new LogInPage(driver);
		
		homeP=loginP.logIn(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
		cartP=homeP.scrollingProduct();
		placeOrderP=cartP.cLink();
		formP=new FormPage(driver);
	   
	}

	@When("clicks on place button")
	public void clicks_on_place_button() throws InterruptedException {
		
		Thread.sleep(2000);
		formP=placeOrderP.placeOrderLink();
		System.out.println("Clicked on place order link");
		
	 
	}

	@Then("navigated to form page")
	public void navigated_to_form_page() {
		driver.close();
	  
	}


}
