package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class TC2 extends BaseTest
{
	@Test
	public void test2()
	{
		//Reporter.log(driver.getTitle(),true);
		test.info(driver.getTitle());
		System.out.println("TC2");
	}
}
