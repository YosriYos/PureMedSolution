package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionnairePage {

	WebDriver driver;

	public QuestionnairePage(WebDriver driver) {
		this.driver = driver;
	}

	// Locator ScorePatient
	By ScorePatient = By.xpath("//input[@id='score_entry']");

	public WebElement getScorePatient() {
		return driver.findElement(ScorePatient);
	}

	// Locator NextButton
	By NextButtonSP = By.xpath("//button[@class='next_btn ng-star-inserted']");

	public WebElement getNextButtonSP() {
		return driver.findElement(NextButtonSP);
	}

	// Locator ScoreDN4
	By ScoreDN4 = By.xpath("//button[@type='button']");

	public WebElement getScoreDN4() {
		return driver.findElement(ScoreDN4);
	}

	// Locator DNOD
	By DNOD = By.xpath("//button[contains(text(),'DNOD : Douleurs neuropathiques d’origine diabétiqu')]");

	public WebElement getDNOD() {
		return driver.findElement(DNOD);
	}

	// Locator NextEtiologie
	By Next2 = By.xpath("//button[@class='next_btn ng-star-inserted']");

	public WebElement getNext2() {
		return driver.findElement(Next2);
	}

	// Locator Continue
	By Continue = By.xpath("//button[@type='button']");

	public WebElement getContinue() {
		return driver.findElement(Continue);
	}

	// Locator Lungs
	By Lungs = By.xpath("//div[@id='bodymapfront1']//*[name()='svg']//*[name()='path'][24]");

	public WebElement getLungs() {
		return driver.findElement(Lungs);
	}

	// Locator Next3
	By Next3 = By.xpath("//button[@class='next_btn ng-star-inserted']");

	public WebElement getNext3() {
		return driver.findElement(Next3);
	}

	// Locator Month
	By Month = By.xpath(
			"/html/body/app-root/app-add-patient/div/div[3]/div[1]/div/app-pnp-body-pains/div/app-pnp-body-pain/app-body-pain-area/button/div[2]/div[1]/button/span[1]");

	public WebElement getMonth() {
		return driver.findElement(Month);
	}

	// Locator Year
	By Year = By.xpath(
			"/html/body/app-root/app-add-patient/div/div[3]/div[1]/div/app-pnp-body-pains/div/app-pnp-body-pain/app-body-pain-area/button/div[2]/div[2]/button/span[1]");

	public WebElement getYear() {
		return driver.findElement(Year);
	}

	// Locator Next4
	By Next4 = By.xpath("//button[@class='next_btn ng-star-inserted']");

	public WebElement getNext4() {
		return driver.findElement(Next4);
	}

	// Locator Traitement concomitant
	By Tcon = By.xpath("//div[contains(text(),'Antidépresseurs')]");

	public WebElement getTcon() {
		return driver.findElement(Tcon);
	}

	// Locator Next5
	By Next5 = By.xpath("//button[@class='next_btn ng-star-inserted']");

	public WebElement getNext5() {
		return driver.findElement(Next5);
	}

	// Locator Traitement ANtérieur
	By Tant = By.xpath("//div[@class='align_left'][normalize-space()='Antidépresseurs']");

	public WebElement getTant() {
		return driver.findElement(Tant);
	}

	// Locator Next6
	By Next6 = By.xpath("//button[@class='next_btn ng-star-inserted']");

	public WebElement getNext6() {
		return driver.findElement(Next6);
	}

	// Locator Green
	By Green = By.xpath(
			"//app-color-box[3]//button[1]");
	
	public WebElement getGreen() {
		return driver.findElement(Green);
	}

	// Locator Confirm
	By Confirm = By.xpath("//button[@class='next_btn loader-inline-right loader-white loader ng-star-inserted']");
	
	public WebElement getConfirm() {
		return driver.findElement(Confirm);
	}

	// Locator Confirmed
	By Confirmed = By.xpath("//p[@class='notifier__notification-message ng-star-inserted']");

	public WebElement getConfirmed() {
		return driver.findElement(Confirmed);
	}

}
