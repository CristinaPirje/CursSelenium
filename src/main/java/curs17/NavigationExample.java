package curs17;

import org.testng.annotations.Test;

import seleniumutils.BaseTest;

public class NavigationExample extends BaseTest {
	@Test
	
	public void navigationTest() throws InterruptedException{
		
		Thread.sleep(3000);
		driver.get("http://emag.ro");
		Thread.sleep(3000);
		driver.navigate().to("http://altex.ro");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
	}
	
	
	

}
