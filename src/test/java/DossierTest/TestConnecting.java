package DossierTest;

import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import PageObjectModel.HomePage;
import PageObjectModel.LogPage;

import Reports.ExtentManager;

@Listeners(ListenersMethods.class)

public class TestConnecting extends Base {

	ExtentReports extent = ExtentManager.getInstance();
	ExtentTest test;

	@Test
	void Connect() { // Déclarer les POM LogPage L = new LogPage(driver);
		HomePage H = new HomePage(driver);
		LogPage L = new LogPage(driver);
		
		WebElement Mail = L.getMail();
		Mail.clear();
		Mail.sendKeys("mhamdi.yosrii@gmail.com");
		
		WebElement MPS = L.getMps();
		MPS.clear();
		MPS.sendKeys("Project*Puremed1");
		
		WebElement CnxButton = L.getCnxButton();
		CnxButton.click();
		
		String Expected = "Connexion réussie";
		String Actual = H.getCnxNotif().getText();
		//String CSSValue = H.getCnxNotif().getAttribute("Background");
		
	//Assert.assertEquals(H.getCnxNotif().getCssValue("background-color"), "rgba(92, 184, 92, 0)");

	Assert.assertEquals(Actual, Expected, "Connexion réussie");	
		//System.out.println(CSSValue);
		
	}

}
