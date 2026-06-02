package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FormTests {

    private WebDriver driver;

    @BeforeAll
    public void setUpAll() {
        BasePage.initializeDriver();
        driver = BasePage.getDriver();
    }

    @BeforeEach
    public void setUp() {
        driver.get("https://automationexercise.com/contact_us");
    }

    @Test
    public void testContactFormFillAndValidation() {
        driver.findElement(By.name("name")).sendKeys("John Doe");
        driver.findElement(By.name("email")).sendKeys("john@example.com");
        driver.findElement(By.name("subject")).sendKeys("Test Subject");
        driver.findElement(By.name("message")).sendKeys("This is a test message.");

        driver.findElement(By.name("upload_file")).sendKeys(System.getProperty("user.dir") + "/src/test/resources/test.txt");
        driver.findElement(By.name("submit")).click();

        // Verify success alert
        Assertions.assertTrue(driver.getPageSource().contains("Success! Your details have been submitted successfully."),
                "Form should submit successfully");
    }

    @AfterEach
    public void tearDownEach() {
        // Return to home page or clean up
    }

    @AfterAll
    public void tearDownAll() {
        BasePage.quitDriver();
    }
}
