package Irctc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Autoconstant
{
	public WebDriver driver;
@BeforeMethod
public void openapp()
{
	System.setProperty(chrome_key, chrome_value);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.MILLISECONDS);
	driver.get(url);
	
}
@AfterMethod
public void close()
{
	System.out.println("close the browser");
}
}
