package curs12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	@Test
	
	public void testOpenBrowser() {
		WebDriver driver= new EdgeDriver();
		driver.get("https://keybooks.ro/");
	}

}
