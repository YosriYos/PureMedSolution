package DossierTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.Status;

import Reports.ExtentManager;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Base {

	public static ExtentReports extent;
	public ExtentTest test;
	public static WebDriver driver;

	@BeforeSuite
	public void setup() throws IOException {
		extent = ExtentManager.getInstance();
		test = extent.createTest("Testing");
		Before(); // Call the Before method to set up the driver and other configurations
	}

	public void Before() throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		driver = new ChromeDriver();

		Properties prop = new Properties();
		FileInputStream FIchier = new FileInputStream(
				"C:\\Users\\YOSRI\\Desktop\\NewWorkSpace\\Maven Projects\\PureMedProject\\PureMedProject\\Environnment.Properties");
		prop.load(FIchier);
		driver.get(prop.getProperty("URL"));

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	public void ScreenShot() {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		if (scrShot != null) {
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);

			// Use the getFormattedTimestamp method to get a formatted timestamp
			String timestamp = getFormattedTimestamp();

			// Build the destination file path using the timestamp
			File destFile = new File("C:\\Users\\YOSRI\\Desktop\\formation\\ScreenShot\\Failure " + timestamp + ".png");

			try {
				FileUtils.copyFile(scrFile, destFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public String getFormattedTimestamp() {
		// Get current timestamp
		LocalDateTime now = LocalDateTime.now();

		// Define a format for the timestamp in the file name
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy à HH;mm;ss").withLocale(Locale.FRANCE);

		// Format the timestamp
		return now.format(formatter);
	}

	@AfterMethod

	public void tearDown(ITestResult result) {

		test = extent.createTest("Test");
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "Test Case Failed: " + result.getName());
			test.log(Status.FAIL, "Error Details: " + result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test Case Skipped: " + result.getName());
		}

		extent.flush();

	}

	@AfterSuite
	public void Quit() {
		// Close the WebDriver after all tests in the suite have executed
		driver.quit();
	}
}
