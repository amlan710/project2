package TestNG;

import java.io.IOException;

import org.testng.annotations.Test;

import Actitime.BaseTest;
import pom.SignUp;

public class TestFacebook extends BaseTest
{
	@Test
	public void signup() throws IOException
	{
		SignUp s=new SignUp(driver);
		s.signup();
		
	}

}
