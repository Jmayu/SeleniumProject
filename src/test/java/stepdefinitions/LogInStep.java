package stepdefinitions;

import Base.TestBase;
import demoBlazePages.HomePage;
import demoBlazePages.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LogInStep extends TestBase{
	
	LogInPage loginP;
	HomePage homeP;
	
	public LogInStep() {
		super();
	}
	
	@Given("user is on login")
	public void user_is_on_login() throws InterruptedException {
		initialization();
		loginP=new LogInPage(driver);
		System.out.println("Done");

	}
	
	
	 @When("user enters username and password")
	 public void user_enters_username_and_password() {

       System.out.println("user enters login details");
       homeP=loginP.logIn(prop.getProperty("username"), prop.getProperty("password"));
       
	 }
	 
	  @Then("close browser")
	  public void close_browser() {
		  driver.close();
		  
	  }
	  


	

}
