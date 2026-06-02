package sushilmaurya.extentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	ExtentReports extent;
	@BeforeTest
	public void config() {
		// ExtentReports ExtentSparkReporter

		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter repoter = new ExtentSparkReporter(path);
		repoter.config().setReportName("web report");
		repoter.config().setDocumentTitle("Test Result");

		extent = new ExtentReports();
		extent.attachReporter(repoter);
		extent.setSystemInfo("Tester", "Sushil");
	}

	@Test
	public void intialDemo() {
		extent.createTest("Intial Demo");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.getTitle();
		extent.flush();
	}
}
