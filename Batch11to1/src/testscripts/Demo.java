package testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void openBrowser() {
		Reporter.log("Hello", true);
	}
}
