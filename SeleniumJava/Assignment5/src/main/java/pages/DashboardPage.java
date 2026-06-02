package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {

    private final By loggedInUser = By.xpath("//a[contains(text(),'Logged in as')]");
    private final By logoutLink = By.xpath("//a[contains(text(),'Logout')]");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isUserLoggedIn() {
        return driver.findElement(loggedInUser).isDisplayed();
    }

    public void logout() {
        driver.findElement(logoutLink).click();
    }
}
