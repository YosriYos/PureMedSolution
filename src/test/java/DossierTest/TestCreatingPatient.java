package DossierTest;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import PageObjectModel.HomePage;
import PageObjectModel.LogPage;
import PageObjectModel.NewPatientPage;
import PageObjectModel.QuestionnairePage;
import Reports.ExtentManager;

@Listeners(ListenersMethods.class)

public class TestCreatingPatient extends Base {

	ExtentReports extent = ExtentManager.getInstance();
	ExtentTest test;

	@Test
	void CreatePatient() {
		// Déclarer les POM
		LogPage L = new LogPage(driver);
		HomePage H = new HomePage(driver);
		NewPatientPage N = new NewPatientPage(driver);
		QuestionnairePage QP = new QuestionnairePage(driver);

		WebElement Mail = L.getMail();
		Mail.clear();
		Mail.sendKeys("mhamdi.yosrii@gmail.com");

		WebElement MPS = L.getMps();
		MPS.clear();
		MPS.sendKeys("Project*Puremed1");

		WebElement CnxButton = L.getCnxButton();
		CnxButton.click();

		WebElement NP = H.getNewPatient();
		NP.click();

		WebElement Prénom = N.getPrénom();
		Prénom.sendKeys("Yosri");

		WebElement Nom = N.getNom();
		Nom.sendKeys("Mhamdi");

		WebElement BirthdDate = N.getBirthDate();
		BirthdDate.click();

		WebElement YearList = N.getYearList();
		Select Year = new Select(YearList);
		Year.selectByVisibleText("1992");

		WebElement MonthList = N.getMonthList();
		Select Month = new Select(MonthList);
		Month.selectByValue("3");

		WebElement Day14 = N.getDay();
		Actions Mouse = new Actions(driver);
		Mouse.moveToElement(Day14).perform();
		Day14.click();
		// Select Day = new Select(Day14); Day.selectByIndex(14);

		WebElement Male = N.getSexMale();
		Male.click();

		// essayer avec Scroll avant WebElement pour localiser le button Check
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < 10; i++) {
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		}

		WebElement Check = N.getCHeckBocConsontment();
		Check.click();

		WebElement Next = N.getNextButton();
		Next.click();

		WebElement ScorePatient = QP.getScorePatient();
		ScorePatient.sendKeys("2");

		WebElement NextButtonSP = QP.getNextButtonSP();
		NextButtonSP.click();

		WebElement Scoredn4 = QP.getScoreDN4();
		Scoredn4.click();

		WebElement DNOD = QP.getDNOD();
		DNOD.click();

		WebElement Next2 = QP.getNext2();
		Next2.click();

		WebElement Continue = QP.getContinue();
		Continue.click();

		WebElement Lungs = QP.getLungs();
		Lungs.click();

		WebElement Next3 = QP.getNext3();
		Next3.click();

		WebElement MonthDropdown = QP.getMonth();
		MonthDropdown.click();
		WebElement Mai = driver.findElement(By.xpath("//span[text()='Mai']"));
		Mai.click();

		WebElement YearDropdown = QP.getYear();
		YearDropdown.click();
		WebElement Year2022 = driver.findElement(By.xpath("//span[text()='2022']"));
		Year2022.click();

		WebElement Next4 = QP.getNext4();
		Next4.click();

		WebElement Antidép1 = QP.getTcon();
		Antidép1.click();

		WebElement Next5 = QP.getNext5();
		Next5.click();

		WebElement Antidép2 = QP.getTant();
		Antidép2.click();

		WebElement Next6 = QP.getNext6();
		Next6.click();

		WebElement Color = QP.getGreen();
		Color.click();

		WebElement Confirm = QP.getConfirm();
		Confirm.click();

		String Expected = "Votre nouveau dossier patient a été créé avec succès.";
		String Actual = QP.getConfirmed().getText();

		Assert.assertTrue(Actual.contains(Expected), "Votre nouveau dossier patient a été créé avec succès.");

	}
}
