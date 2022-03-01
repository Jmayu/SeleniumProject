package demoBlazePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.TestBase;


public class CartPage extends TestBase{
	
	 By addCartLink = By.partialLinkText("Add");
//	 By OrderLink = By.partialLinkText("Place");
	 By cartLink = By.partialLinkText("Cart");
	

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
//	public PlaceOrderPage addProduct() throws InterruptedException {
//		driver.findElement(addCartLink).click();
//		Thread.sleep(3000);
//		
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		driver.findElement(cartLink).click();
//		return new PlaceOrderPage(driver);
//	}
	
	public void addCLink () throws InterruptedException {
		driver.findElement(addCartLink).click();
		Thread.sleep(2000);
	}
	public void popUp() {
		driver.switchTo().alert().accept();
	}
	
	public PlaceOrderPage cLink() {
		driver.findElement(cartLink).click();
		return new PlaceOrderPage(driver);
	}

}
