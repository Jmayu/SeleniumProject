package demoBlazePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.TestBase;



public class SignUpPage extends TestBase{
	

	 By signInButton = By.partialLinkText("Sign up");
	 By uName = By.id("sign-username");
	 By passW = By.id("sign-password");
	 By signInButton2 = By.xpath("//button[text()='Sign up']");
	 
	 public SignUpPage(WebDriver driver) {
		 this.driver=driver;
	 }

	 
	 public void signInBtn() {
		 driver.findElement(signInButton).click();
		 
	 }
	 public  LogInPage signUp(String userName, String passWord) {

     driver.findElement(uName).sendKeys(userName);
     driver.findElement(passW).sendKeys(passWord);
     return new LogInPage(driver);
	 }
	 
	 public LogInPage signBtn2() {
		 driver.findElement(signInButton2).click();
		 driver.switchTo().alert().accept();
		 return new LogInPage(driver);
	 }
}


