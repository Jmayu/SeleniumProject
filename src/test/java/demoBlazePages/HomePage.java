package demoBlazePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Base.TestBase;



public class HomePage extends TestBase{
	
	By productLink=  By.xpath("//a[text()='Samsung galaxy s6']");
	public HomePage(WebDriver driver ) {
		this.driver=driver;
	}
	
	public CartPage scrollingProduct()
	{
		driver.findElement(productLink).click();
		return new CartPage(driver);
	}
	


}
