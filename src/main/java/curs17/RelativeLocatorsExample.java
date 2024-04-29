package curs17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import seleniumutils.BaseTest;

public class RelativeLocatorsExample extends BaseTest{
	
	@Test
	public void relativeLocatorsExample() {
		/*
		 * toleftOf
		 * toRightOf
		 * below
		 * near
		 * above
		 * 
		 */
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement price10_20 = driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title']")).toLeftOf(By.cssSelector("a[href='life-in-the-garden']")));
		
		
		jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:6px solid blue;')", price10_20);
		
	//toRightOf	
WebElement price15_99 = driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title']")).toRightOf(By.cssSelector("a[href='life-in-the-garden']")));
		
		
		jse.executeScript("arguments[0].setAttribute('style','background:blue; border:6px solid green;')", price15_99);
		
		
	//below 
WebElement price15_05 = driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title']")).below(By.cssSelector("div[class='wpb_wrapper']>p")));
		
		
		jse.executeScript("arguments[0].setAttribute('style','background:gray; border:6px solid black;')", price15_05);
		
	//above
WebElement authorAllanGreen = driver.findElement(RelativeLocator.with(By.cssSelector("div[class='wpb_wrapper']>p")).below(By.cssSelector("h5[class*='sc_title']")));
		
		
jse.executeScript("arguments[0].setAttribute('style','background:gray; border:6px solid black;')",authorAllanGreen );
		
	
	
	
	}

}
