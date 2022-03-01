package demoBlazePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Base.TestBase;

public class LogInPage extends TestBase{
	
	By logInButton1 = By.id("login2");
	By userN = By.id("loginusername");
	By pwd = By.id("loginpassword");
	By LogInbtn2 = By.xpath("//button[text()='Log in']");
	
		
	public LogInPage(WebDriver driver ) {
		this.driver=driver;
	}
	

public HomePage logIn(String userName, String passWord) {
	driver.findElement(logInButton1).click();
	driver.findElement(userN).sendKeys(userName);
	driver.findElement(pwd).sendKeys(passWord);
	driver.findElement(LogInbtn2).click();
	 return new HomePage(driver);
}

}
