package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.DashboardPage;
import pages.LoginPage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginTests {

    private WebDriver driver;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    @BeforeAll
    public void setUpAll() {
        BasePage.initializeDriver();
        driver = BasePage.driver;
    }

    @BeforeEach
    public void setUp() {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        loginPage.open();
    }

    @Test
    public void testPositiveLogin() {
        loginPage.login("sushil91@gmail.com", "India@123");

        Assertions.assertTrue(dashboardPage.isUserLoggedIn(),
                " Logged in as Sushil");
    }

    @Test
    public void testNegativeLogin() {
        loginPage.login("sushil2@gmail.com", "jsdhsnd24");  //wrong_password

        // assert error message appears
        Assertions.assertTrue(loginPage.isErrorMessageDisplayed(),
                "Error message should appear for invalid credentials");

        // assert still on login page (not logged in)
        Assertions.assertTrue(loginPage.isLoginPageStillDisplayed(),
                "User should remain on login page for invalid credentials");
    }

    @AfterEach
    public void tearDownEach() {
        // If logged in, logout to clean up
        try {
            if (dashboardPage.isUserLoggedIn()) {
                dashboardPage.logout();
            }
        } catch (Exception ignored) {
            // no logout link visible = already logged out
        }
    }

    @AfterAll
    public void tearDownAll() {
        BasePage.quitDriver();
    }
}
