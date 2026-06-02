import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownTicket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("input[class*='inputs']")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("ul#ui-id-1"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='PAT']")).click();
		driver.findElement(By.xpath("//div [@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']"))
				.click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.cssSelector("span#hrefIncAdt")).click();
		}
		int i = 1;
		while (i < 3) {
			driver.findElement(By.cssSelector("span#hrefIncChd")).click();
			i++;
		}
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		Thread.sleep(2000);
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown = new Select(staticDropDown);
		dropDown.selectByContainsVisibleText("INR");
		
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).click();
		driver.findElement(By.xpath("//div[@id='discount-checkbox'] //input[@name='ctl00$mainContent$chk_StudentDiscount']")).click();
		driver.findElement(By.cssSelector("input#ctl00_mainContent_btn_FindFlights")).click();
	}

}
