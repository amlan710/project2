package TestNGyahoo;

import java.io.IOException;

import org.testng.annotations.Test;

import PomYahoo.PomYahoo;
import yahoo.BaseTest;

public class TestYahoo extends BaseTest
{
@Test
public void yahoo() throws IOException
{
	PomYahoo p=new PomYahoo(driver);
	p.signup();
}
}
