package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;


import demoBlazePages.CartPage;
import demoBlazePages.HomePage;
import demoBlazePages.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class HomePageStep extends TestBase{
	LogInPage loginP;
	HomePage homeP;
	CartPage cartP;
	
	public HomePageStep() {
		super();
	}
	
	@Given("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
	
		initialization();
		
		loginP= new LogInPage(driver);
		homeP=loginP.logIn(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
        cartP=new CartPage(driver);

	}
	@When("user scroll to the product")
	public void user_scroll_to_the_product() throws InterruptedException {
		Thread.sleep(3000);
		cartP=homeP.scrollingProduct();
	}
	
	@And("clicks on product")
	public void clicks_on_product() {
		System.out.println("Clicked on link");
		driver.close();
	}



}
