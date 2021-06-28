package page;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAndCashPage {

	WebDriver driver;

	public BankAndCashPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank & Cash')]")
	WebElement BankandCash;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Account')]")
	WebElement NewAcccount;

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement AccountTitle;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement Balance;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement Phone;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement Website;
	@FindBy(how = How.XPATH, using = "//button[@type='submit' and @class='btn btn-primary']")
	WebElement Submit;

	@Test
	public void enterAccountTitle(String accountTitle) {
		AccountTitle.sendKeys(accountTitle);
	}

	public void enterDescription(String description) {
		AccountTitle.sendKeys(description);
	}

	public void enterBalance(String balance) {
		AccountTitle.sendKeys(balance);
	}

	public void enterAccountNumber(String accountNumber) {
		AccountTitle.sendKeys(accountNumber);
	}

	public void enterContactPerson(String contactPerson) {
		AccountTitle.sendKeys(contactPerson);
	}

	public void enterPhoneNumber(String phone) {
		AccountTitle.sendKeys(phone);
	}

	public void enterWebsite(String website) {
		AccountTitle.sendKeys(website);
	}

	public void clickSubmit() {
		AccountTitle.click();
	}

}
