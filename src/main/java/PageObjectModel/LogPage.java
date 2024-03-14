package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// we declare a public class
public class LogPage {
	// we declare also the driver
	WebDriver driver;

// we declare WebDriver Method to relate src main and src test
	public LogPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locator mail
	// This declares a method named getMail that returns a WebElement.
	// The public modifier indicates that this method can be accessed from outside the class.
	By Mail = By.xpath("//input[@id='mat-input-0']");

	public WebElement getMail() {
		return driver.findElement(Mail);
	}

	// locator MPS
	By MPS = By.xpath("//input[@id='mat-input-1']");

	public WebElement getMps() {
		return driver.findElement(MPS);
	}

	// Locator Title
	By TitleLogPage = By.xpath("div[@class='logo_name_container_title']");

	public WebElement getTitleLogPage() {
		return driver.findElement(TitleLogPage);
	}

	// Locator Sous-Titre
	By SubTitle = By.xpath("div[@class='logo_name_container_subtitle']");

	public WebElement getSubTitle() {
		return driver.findElement(SubTitle);
	}

	// Locator CnxButton
	By CnxButton = By.xpath("//button[@type='submit']");

	public WebElement getCnxButton() {
		return driver.findElement(CnxButton);
	}

	// Locator Forgotten Password
	By ForgottenPass = By.xpath("a[normalize-space()='Mot de passe oublié ?']");

	public WebElement getForgottenPass() {
		return driver.findElement(ForgottenPass);
	}

	// Locator Inscription
	By Inscription = By.xpath("a[normalize-space()='Inscription']");

	public WebElement getInscription() {
		return driver.findElement(Inscription);
	}

}
