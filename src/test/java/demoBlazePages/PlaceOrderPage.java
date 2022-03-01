package demoBlazePages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Base.TestBase;

public class PlaceOrderPage extends TestBase{
	
	 By Orderbutton = By.xpath("//button[text()='Place Order']");
	 
	public PlaceOrderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public FormPage placeOrderLink() throws InterruptedException {
		Thread.sleep(3000);
			driver.findElement(Orderbutton).click();
			return new FormPage(driver);
		}

}
