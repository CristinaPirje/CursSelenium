package curs13;

import org.testng.annotations.*;

public class BeforeAfterAnnotations {
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Before Suite");
		
	}
	
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("After Suite");
		
	}
	@BeforeClass
	
	public void beforeClass() {
		System.out.println("Before Class");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("After Class");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		
	}
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	@Test
	public void test3() {
		System.out.println("Test 3");
	}

}
