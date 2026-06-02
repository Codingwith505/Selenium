package sushilmauryapageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sushilmaurya.AbstractComponents.AbstractCommonComponent;

public class ApplicationCatalogue extends AbstractCommonComponent {

	WebDriver driver;

	public ApplicationCatalogue(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(css = ".card-body")
	List<WebElement> products;

	@FindBy(css = ".ng-animating")
	WebElement spinner;
	
	By waitLocator = By.cssSelector(".card-body");
	By produ = By.cssSelector(".card-body b");
	By addCart = By.cssSelector(".card-body button:last-of-type");
	By toastMessage = By.id("toast-container");

	//List<WebElement> products = driver.findElements(By.cssSelector(".card-body"));
	
	public List<WebElement> GetproductList() {
		visibilityOFAllElement(waitLocator);
		return products;
	}

	public WebElement ProductAction(String productName) {
		WebElement productText = products.stream()
				.filter(product -> product.findElement(By.cssSelector(".card-body b")).getText().equalsIgnoreCase(productName)).findFirst()
				.orElse(null);
		return productText;
	}

	

	public void addToCart(String productName) throws InterruptedException {
		WebElement productText = ProductAction(productName);
		productText.findElement(addCart).click();
		visibilityOFAllElement(toastMessage);
		//invisibilityOf(spinner);
		Thread.sleep(1000);
	}

}
