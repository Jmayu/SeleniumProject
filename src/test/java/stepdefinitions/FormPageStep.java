package stepdefinitions;



import Base.TestBase;

import demoBlazePages.CartPage;
import demoBlazePages.FormPage;
import demoBlazePages.HomePage;
import demoBlazePages.LogInPage;
import demoBlazePages.PlaceOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FormPageStep extends TestBase{
	LogInPage loginP;
	HomePage homeP;
	CartPage cartP;
	PlaceOrderPage placeOrderP;
	FormPage formP;
	
public FormPageStep() {
	super();
}

@Given("user is on FillForm page")
public void user_is_on_fill_form_page() throws InterruptedException {
	initialization();
	loginP = new LogInPage(driver);
	homeP = loginP.logIn(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(3000);
	cartP = homeP.scrollingProduct();
	placeOrderP = cartP.cLink();
	formP = new FormPage(driver);
   
}

@When("user enters Name")
public void user_enters_name() throws InterruptedException {
	formP=placeOrderP.placeOrderLink();
	Thread.sleep(2000);
	formP.nameField();

}

@And("user enter Country")
public void user_enter_country() {
	formP.countryField();
   
}

@And("user enters City")
public void user_enters_city() {
  formP.countryField();
}

@And("user enters CreditCard")
public void user_enters_credit_card() {
formP.creditCardField();
}

@And("user enters Month")
public void user_enters_month() {
formP.monthField();
}

@And("user enters Year")
public void user_enters_year() {
formP.yearField();
}

@And("clicks on purchase button")
public void clicks_on_purchase_button() {
	formP.button1();
  
}

@Then("user validate the title and purchase message")
public void user_validate_the_title_and_purchase_message() throws Exception {
	Thread.sleep(2000);
	FormPage.takeSnapShot(driver);
	Thread.sleep(2000);
	formP.validateTitle();
	Thread.sleep(2000);
	System.out.println("First site name assertion executed.");
    formP.validatePurchaseMessage();
    Thread.sleep(2000);
	System.out.println("--- 2nd validateMessage assertion executed.");
	
   
}
@And("clicks on ok button")
public void clicks_on_ok_button() {
	formP.okButton();
}

@Then("close the browser")
public void close_the_browser() {
	driver.close();
   
}

}
