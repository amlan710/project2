package TestIrctc;

import java.io.IOException;

import org.testng.annotations.Test;

import Irctc.BaseTest;
import PomIrctc.IrctcPage;

public class TestNG extends BaseTest
{
@Test
public void create() throws IOException
{
	IrctcPage i=new IrctcPage(driver);
	i.registration();
}
}
