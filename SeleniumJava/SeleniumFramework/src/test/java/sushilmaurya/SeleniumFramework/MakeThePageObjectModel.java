package sushilmaurya.SeleniumFramework;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sushilmaurya.AbstractComponents.AbstractCommonComponent;
import sushilmaurya.TestComponent.BaseTest;
import sushilmauryapageobject.ApplicationCatalogue;
import sushilmauryapageobject.CheckOut;
import sushilmauryapageobject.FinaleCheckOut;
import sushilmauryapageobject.LandingPage;
import sushilmauryapageobject.OrderVerify;

public class MakeThePageObjectModel extends BaseTest {

	@Test(dataProvider = "getData", groups = { "smoke" })
	public void MakeThePageObjectModel(HashMap<String, String> input) throws IOException, InterruptedException {

		ApplicationCatalogue productCataloge = landingpage.ApplicationCatalogue(input.get("email"), input.get("pass"));
		List<WebElement> products = productCataloge.GetproductList();
		productCataloge.addToCart(input.get("productName"));
		CheckOut verify = productCataloge.AddCart();
		Boolean cartName = verify.match(input.get("productName"));
		Assert.assertTrue(cartName);
		FinaleCheckOut Fc = verify.checkOut();
		Fc.action();
		String text = Fc.Text();
		Assert.assertEquals(text, "THANKYOU FOR THE ORDER.");

	}

	@Test(dependsOnMethods = { "MakeThePageObjectModel" })
	public void orderValidation(HashMap<String, String> input) {
		ApplicationCatalogue productCataloge = landingpage.ApplicationCatalogue("email", "pass");
		OrderVerify oerder = productCataloge.order();
		Assert.assertTrue(oerder.orderMatch(input.get("productName")));

	}

	@DataProvider()
	public Object[][] getData() {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", "sushil1@gmail.com");
		map.put("pass", "Sushil123");
		map.put("productName", "BANARSI SAREE");
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("email", "Maurya@gmail.com");
		map1.put("pass", "Sushil1234");
		map1.put("productName", "LG REFRIGERATOR");
		return new Object[][] { { map }, { map1 } };

	//	return new String[][] { { "sushil1@gmail.com", "Sushil123" }, { "Maurya@gmail.com", "Sushil1234" } };

	}

}
