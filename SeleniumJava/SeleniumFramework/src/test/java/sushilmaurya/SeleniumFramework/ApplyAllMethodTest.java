package sushilmaurya.SeleniumFramework;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import sushilmaurya.AbstractComponents.AbstractCommonComponent;
import sushilmaurya.TestComponent.BaseTest;
import sushilmauryapageobject.ApplicationCatalogue;
import sushilmauryapageobject.CheckOut;
import sushilmauryapageobject.FinaleCheckOut;
import sushilmauryapageobject.LandingPage;

public class ApplyAllMethodTest extends BaseTest {

	@Test
	public void MakeThePageObjectModel() throws IOException, InterruptedException {
		String productName = "BANARSI SAREE";
		ApplicationCatalogue productCataloge = landingpage.ApplicationCatalogue("sushil1@gmail.com", "Sushil123");
		List<WebElement> products = productCataloge.GetproductList();
		productCataloge.addToCart(productName);
		CheckOut verify = productCataloge.AddCart();
		Boolean cartName = verify.match(productName);
		Assert.assertTrue(cartName);
		FinaleCheckOut Fc = verify.checkOut();
		Fc.action();
		String text = Fc.Text();
		Assert.assertEquals(text, "THANKYOU FOR THE ORDER.");

	}

}
