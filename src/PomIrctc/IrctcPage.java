package PomIrctc;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Irctc.Autoconstant;
import Irctc.BasePage;
import Irctc.ExcelLibrary;

public class IrctcPage extends BasePage implements Autoconstant
{
	public WebDriver driver;
@FindBy(xpath="//input[@placeholder='Enter Full name']")
private WebElement name;
@FindBy(xpath="//input[@placeholder='DD / MM / YYYY']")
private WebElement dob;
@FindBy(xpath="//input[@placeholder='Enter Mobile']")
private WebElement phone;
@FindBy(xpath="//input[@placeholder='mailme@email.com']")
private WebElement mail;
@FindBy(xpath="//input[@placeholder='Choose Profession']")
private WebElement profession;

@FindBy(xpath="//p[.='Private']")
private WebElement p;
@FindBy(xpath="//input[@placeholder='Indian']")
private WebElement nationality;
@FindBy(xpath="//input[@placeholder='English']")
private WebElement language;
@FindBy(xpath="//input[@placeholder='What is your pet name?']")
private WebElement security;
@FindBy(xpath="//input[@ placeholder='Dog']")
private WebElement heroname;
@FindBy(xpath="//input[@ placeholder='600099']")
private WebElement pin;
@FindBy(xpath="//input[@ placeholder='Karnataka']")
private WebElement state;
@FindBy(xpath="//input[@ placeholder='Select City']")
private WebElement city;
@FindBy(xpath="//input[@ placeholder='Kolathur S.O']")
private WebElement locality;
@FindBy(xpath="//input[@ placeholder='Landline number']")
private WebElement alternative;

public IrctcPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void registration() throws IOException
{
	name.sendKeys(ExcelLibrary.xyz(excelpath, sheetname, 1, 0));
	dob.sendKeys(ExcelLibrary.xyz(excelpath, sheetname, 1, 1));
	phone.sendKeys(ExcelLibrary.xyz(excelpath, sheetname, 1, 2));
	mail.sendKeys(ExcelLibrary.xyz(excelpath, sheetname, 1, 3));
	profession.click();
	movetoelement(driver, p);
	p.click();
}
}
