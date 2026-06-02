package sushilmauryapageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {

	WebDriver driver;

	public CheckOut(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(css=".subtotal.cf.ng-star-inserted button")
	WebElement checkOut;

	@FindBy(css = ".cart")
	List<WebElement> verifyCart;

	By extractValue = By.cssSelector(".infoWrap h3");

	public Boolean match(String productName) {
		Boolean cartName = verifyCart.stream()
				.anyMatch(verifyEcart -> verifyEcart.findElement(extractValue).getText().equalsIgnoreCase(productName));
		return cartName;
	}
	
	public FinaleCheckOut checkOut() {
		checkOut.click();
		FinaleCheckOut Fc = new FinaleCheckOut(driver);
		return Fc;
	}

}
