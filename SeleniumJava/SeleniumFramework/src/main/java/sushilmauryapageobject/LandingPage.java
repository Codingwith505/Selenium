package sushilmauryapageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sushilmaurya.AbstractComponents.AbstractCommonComponent;

public class LandingPage extends AbstractCommonComponent {
	
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id= "userEmail")
	WebElement email1;
	
	@FindBy(id= "userPassword")
	WebElement pass1;
	
	@FindBy(id= "login")
	WebElement login;
	
//	public ApplicationCatalogue LandingApplication(String email,String pass) {
//		email1.sendKeys(email);
//		pass1.sendKeys(pass);
//		login.click();
//		ApplicationCatalogue productCataloge = new ApplicationCatalogue(driver);
//		return productCataloge;
//	}
	
	public void GoTo() {
		driver.get("https://rahulshettyacademy.com/client/");
	}

	public ApplicationCatalogue ApplicationCatalogue(String email, String pass) {
		email1.sendKeys(email);
		pass1.sendKeys(pass);
		login.click();
		ApplicationCatalogue productCataloge = new ApplicationCatalogue(driver);
		return productCataloge;
	}

}
