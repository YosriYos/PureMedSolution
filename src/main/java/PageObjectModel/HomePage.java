package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Locator TitlePateints
	By TitlePateints = By.xpath("//div[@class='patient_title']");

	public WebElement getTitlePatients() {
		return driver.findElement(TitlePateints);
	}

	// Locator CnxNotif : à réviser***
	By CnxNotif = By.xpath("/html/body/app-root/notifier-container/ul/li/notifier-notification/p");

	public WebElement getCnxNotif() {
		return driver.findElement(CnxNotif);
	}

// Locator ProfileType
	By ProfileType = By.xpath("//div[@class='doctor_title ng-tns-c346-0 ng-star-inserted']");

	public WebElement getProfileType() {
		return driver.findElement(ProfileType);
	}

	// Locator PatientsDashboard
	By PatientsDashboard = By.xpath("//span[normalize-space()='Patients']");

	public WebElement getPatientsDashboard() {
		return driver.findElement(PatientsDashboard);
	}

	// Locator RDV
	By RDV = By.xpath("//span[normalize-space()='Rendez-vous']");

	public WebElement getRDV() {
		return driver.findElement(RDV);
	}

	// Locator Notifications
	By Notifications = By.xpath("//span[normalize-space()='Notifications']");

	public WebElement getNotifications() {
		return driver.findElement(Notifications);
	}

	// Locator Parameters
	By Parameters = By.xpath("//span[normalize-space()='Paramètres']");

	public WebElement getParameters() {
		return driver.findElement(Parameters);
	}

	// Locator Deconnexion
	By Deconnexion = By.xpath("//span[normalize-space()='Déconnexion']");

	public WebElement getDeconnexion() {
		return driver.findElement(Deconnexion);
	}

	// Locator ExportPatients
	By ExportPatients = By.xpath("//span[@class='export_btn_label']");

	public WebElement getExportPatients() {
		return driver.findElement(ExportPatients);
	}

	// Locator NewPatient
	By NewPatient = By.xpath("//span[@class='label_add_btn']");

	// tagName[@attribute='value']
	public WebElement getNewPatient() {
		return driver.findElement(NewPatient);
	}

}