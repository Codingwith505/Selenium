package sushilmauryapageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sushilmaurya.AbstractComponents.AbstractCommonComponent;

public class FinaleCheckOut extends AbstractCommonComponent {
	WebDriver driver;

	public FinaleCheckOut(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	By action = By.cssSelector(".form-group input.txt.text-validated");
	By waitClass = By.cssSelector(".ta-results");
	
	@FindBy (xpath="(//button[contains(@class,'ta-item')])[2]")
	WebElement selectInd;
	
	@FindBy (css=".action__submit")
	WebElement select;
	
	@FindBy (css=".hero-primary")
	WebElement textExtract;

	public void action() {
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(action), "India").build().perform();
		visibilityOFAllElement(waitClass);
		selectInd.click();
		select.click();
		textExtract.getText();
		
	}
	


	public String Text() {
		String text =textExtract.getText();
		return text;
	}
	
	
//	String getValue = driver.findElement(By.cssSelector(".hero-primary")).getText();
//	
}
