package PomYahoo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import yahoo.AutoConstant;
import yahoo.BasePage;
import yahoo.ExcelLibrary;

public class PomYahoo extends BasePage implements AutoConstant 
{
	public WebDriver driver;
@FindBy(xpath="//input[@id='usernamereg-firstName']")
private WebElement fnfield;
@FindBy(xpath="//input[@id='usernamereg-lastName']")
private WebElement lnfield;
@FindBy(xpath="//input[@name='yid']")
private WebElement mail;
@FindBy(xpath="//input[@id='usernamereg-password']")
private WebElement password;
@FindBy(xpath="//input[@id='usernamereg-phone']")
private WebElement phone;
@FindBy(xpath="//select[@id='usernamereg-month']")
private WebElement month;
@FindBy(xpath="//input[@id='usernamereg-day']")
private WebElement date;
@FindBy(xpath="//input[@id='usernamereg-year']")
private WebElement year;
@FindBy(xpath="//input[@id='usernamereg-freeformGender']")
private WebElement gender;

public PomYahoo(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void signup() throws IOException
{
	fnfield.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 0));
	lnfield.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 1));
	mail.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 2));
	password.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 3));
	phone.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 4));
	month.click();
	selectbyvisibletext(month, "February");
	date.sendKeys("10");
	year.sendKeys("1996");
	gender.sendKeys("male");
}
}
