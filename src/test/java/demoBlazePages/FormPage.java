package demoBlazePages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import Base.TestBase;



public class FormPage extends TestBase{
	
	 By Name = By.id("name");
	 By Country = By.id("country");
     By City = By.id("city");
	 By CreditCard = By.id("card");	
	 By Month = By.id("month");
	 By Year = By.id("year");
	 By PurchaseButton = By.xpath("//button[text()='Purchase']");
	 By purchaseMessage = By.xpath("//div[10]//h2");
	 By OkButton = By.xpath("//button[text()='OK']");
	
	
	
public FormPage(WebDriver driver) {
	this.driver=driver;
}

public void nameField() {
	driver.findElement(Name).sendKeys("name 1");
}

public void countryField() {
	driver.findElement(Country).sendKeys("Mumbai");
}
public void creditCardField() {
	driver.findElement(CreditCard).sendKeys("111");
}
public void monthField() {
	driver.findElement(Month).sendKeys("Feb");
}
public void yearField() {
	driver.findElement(Year).sendKeys("2022");
}

public void button1() {
	driver.findElement(PurchaseButton).click();
}




public FormPage okButton() {
	driver.findElement(OkButton).click();
	return new FormPage(driver);
}

public boolean validatePurchaseMessage() {
	String text = driver.findElement(purchaseMessage).getText();
	String expText = "Thank you for your purchase!";
	if (text.equalsIgnoreCase(expText))
		return true;
	else
		return false;
}

public boolean validateTitle() {
	String title = driver.getTitle();

	String expTitle = "STORE";
	if (title.equalsIgnoreCase(expTitle))
		return true;
	else
		return false;
}

public static void takeSnapShot(WebDriver webdriver) throws Exception{

    TakesScreenshot scrShot =((TakesScreenshot)webdriver);
            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            File DestFile=new File("ScreenShot.png");
            FileUtils.copyFile(SrcFile, DestFile);

}




}
