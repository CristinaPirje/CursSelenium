package curs13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class WebElementExample {
	WebDriver browser;
	
	@BeforeClass
	public void setup() {
		
	browser= new EdgeDriver();
	browser.get("https://keybooks.ro/");
	browser.manage().window().maximize();
	
	}
	@Test
	public void testWebElement() throws InterruptedException {
		browser.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);//bad practice in a fi folosit
		
	}
	
	
	@AfterClass
	public void tearDown() {
		browser.quit();
		
	}
	
	

}
