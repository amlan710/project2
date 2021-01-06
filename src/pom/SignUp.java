package pom;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actitime.AutoCanstant;
import Actitime.BasePage;
import Actitime.ExcelLibrary;

public class SignUp extends BasePage  implements AutoCanstant
{
	public WebDriver driver;
@FindBy(name="firstname")
private WebElement fnfield;
@FindBy(name="lastname")
private WebElement lnfield;
@FindBy(xpath="//input[@name='reg_email__']")
private WebElement mobilenumber;
@FindBy(xpath="//input[@name='reg_passwd__']")
private WebElement password;
@FindBy(xpath="//select[@name='birthday_day']")
private WebElement date;
@FindBy(xpath="//select[@name='birthday_month']")
private WebElement month;
@FindBy(xpath="//select[@name='birthday_year']")
private WebElement year;
@FindBy(xpath="(//input[@type='radio'])[2]")
private WebElement radiobutton;

public SignUp(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void signup() throws IOException 
{
	fnfield.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 0));
	lnfield.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 1));
	mobilenumber.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 2));
	password.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 1, 3));
	selectbyvisibletext(date, "5");
	selectbyvisibletext(month, "Mar");
	radiobutton.click();
}

	
}

