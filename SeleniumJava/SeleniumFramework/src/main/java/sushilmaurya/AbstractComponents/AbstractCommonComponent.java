package sushilmaurya.AbstractComponents;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sushilmauryapageobject.CheckOut;
import sushilmauryapageobject.OrderVerify;

public class AbstractCommonComponent {

	WebDriver driver;

	public AbstractCommonComponent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//ul/li/button)[3]")
	WebElement addcart;

	@FindBy(xpath = "//button[@routerlink='/dashboard/myorders']")
	WebElement ordercart;

	public void visibilityOFAllElement(By findBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));

	}

	public void invisibilityOf(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}

	public OrderVerify order() {
		ordercart.click();
		OrderVerify ov = new OrderVerify(driver);
		return ov;
	}

	public CheckOut AddCart() {
		addcart.click();
		CheckOut verify = new CheckOut(driver);
		return verify;
	}

}
