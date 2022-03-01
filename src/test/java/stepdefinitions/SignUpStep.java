package stepdefinitions;


import Base.TestBase;

import demoBlazePages.LogInPage;
import demoBlazePages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStep extends TestBase{
	

	LogInPage loginP;
	SignUpPage signupP;
	public SignUpStep() {
		super();
	}
	
@Given("user is on signup page")
public void user_is_on_signup_page() {
    
	initialization();
    signupP=new SignUpPage(driver);
}

@When("user enters {string} and {string}")
public void user_enters_and(String userName, String passWord) throws InterruptedException {
	
	signupP.signInBtn();
	loginP=signupP.signUp(userName, passWord);
	Thread.sleep(2000);

}

@And("clicks on signup button")
public void clicks_on_signup_button() {
	signupP.signBtn2();
 
}

@Then("navigate to main page")
public void navigate_to_main_page() {
	driver.close();
  
}

}
