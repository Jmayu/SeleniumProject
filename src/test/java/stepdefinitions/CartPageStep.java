package stepdefinitions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;

import demoBlazePages.CartPage;
import demoBlazePages.HomePage;
import demoBlazePages.LogInPage;
import demoBlazePages.PlaceOrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class CartPageStep extends TestBase{

	LogInPage loginP;
	HomePage homeP;
	CartPage cartP;
	PlaceOrderPage placeOrderP;
	
	public CartPageStep() {
		super();
	}
	
	
	@Given("user is on cart page")
	public void user_is_on_cart_page() throws InterruptedException {
		initialization();
		loginP=new LogInPage(driver);
		homeP = loginP.logIn(prop.getProperty("username"), prop.getProperty("password"));
	    Thread.sleep(2000);
		cartP=homeP.scrollingProduct();
		placeOrderP=new PlaceOrderPage(driver);

	}

	@When("clicks on cart link")
	public void clicks_on_cart_link() throws InterruptedException {
     cartP.addCLink();
	}

	@When("handles the alert pop up")
	public void handles_the_alert_pop_up() throws InterruptedException {
		cartP.popUp();
	}

	@Then("user navigated to placeOrderpage")
	public void user_navigated_to_place_orderpage() throws InterruptedException {
		Thread.sleep(2000);
         cartP.cLink();
	}

}
