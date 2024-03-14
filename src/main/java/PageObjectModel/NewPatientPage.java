package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewPatientPage {
	WebDriver driver;

	public NewPatientPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locator TitleNewPatient
	By TitleNewPatient = By.xpath("//div[@class='patient_title']");
	
	public WebElement getTitleNewPatient() {
		return driver.findElement(TitleNewPatient);
	}

	// Locator StepTitleNP
	By StepTitleNP = By.xpath("//span[@class='step_title ng-star-inserted']");

	public WebElement getStepTitleNP() {
		return driver.findElement(StepTitleNP);
	}

// Locator Prénom
	By Prénom = By.xpath("//input[@id='mat-input-2']");

	public WebElement getPrénom() {
		return driver.findElement(Prénom);
	}
	
	// Locator Nom
	By Nom = By.xpath("//input[@id='mat-input-3']");

	public WebElement getNom() {
		return driver.findElement(Nom);
	}

	// Locator BirthDate
	By BirthDate = By.xpath("//input[@id='mat-input-4']");
	
	public WebElement getBirthDate() {
		return driver.findElement(BirthDate);
	}
	// Locator SelectMonth
		By MonthList = By.xpath("//select[@title='Select month']");
		
		public WebElement getMonthList() {
			return driver.findElement(MonthList);
		}
	
		// Locator SelectYear
		By YearList = By.xpath("//select[@title='Select year']");
		
		public WebElement getYearList() {
			return driver.findElement(YearList);
		}
	
		// Locator SelectYear
		By Day = By.xpath("/html/body/app-root/app-add-patient/div/div[3]/div[1]/div/app-profile/div/form/div/div[2]/div[1]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[4]/div[1]/div");
		
		public WebElement getDay() {
			return driver.findElement(Day);
		}
	
		
	// Locator SexMale
	By SexMale = By.xpath("//button[normalize-space()='Homme']");

	public WebElement getSexMale() {
		return driver.findElement(SexMale);
	}

	// Locator SexFemale
	By SexFemale = By.xpath("//button[normalize-space()='Femme']");

	public WebElement getSexFemale() {
		return driver.findElement(SexFemale);
	}
	//tagName[@attribute='value']
	// Locator CHeckBocConsontment
	By CHeckBocConsontment = By.xpath("/html/body/app-root/app-add-patient/div/div[3]/div[1]/div/app-profile/div/div[3]/button");
	// Xpath personnalisé : //span[classe='consent_accepted_text_check_box']
	public WebElement getCHeckBocConsontment() {
		return driver.findElement(CHeckBocConsontment);
	}

	// Locator NextButton
	By NextButton = By.xpath("/html/body/app-root/app-add-patient/div/div[3]/div[2]/button[2]");

	public WebElement getNextButton() {
		return driver.findElement(NextButton);
	}

}
	
