package com.techelevator.ssg;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.techelevator.ssg.pageobject.DriveTimeCalculatorInputPage;
import com.techelevator.ssg.pageobject.DriveTimeCalculatorResultsPage;
import com.techelevator.ssg.pageobject.HomePage;

public class AlienDriveTimeCalculatorTest {

	private static WebDriver webDriver;
	private HomePage homePage;

	@BeforeClass
	public static void createWebDriver(){
		String homeDir = System.getProperty("user.home");
		System.setProperty("webdriver.chrome.driver", homeDir+"/dev-tools/chromedriver/chromedriver");
		webDriver = new ChromeDriver();
	}
	
	@Before
	public void goHome() {
		webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair/");
		homePage = new HomePage(webDriver);

	}
	
	@AfterClass
	public static void closeWebDriver(){
		webDriver.close();
	}
	
	@Test
	public void test_home_page_link_exist(){
		DriveTimeCalculatorInputPage driveTimeInput = homePage.clickDriveTimeCalculatorLink();
		driveTimeInput.selectPlanet("Mars");
		driveTimeInput.selectTransportation("Concorde");
		driveTimeInput.inputAge("25");
		
		DriveTimeCalculatorResultsPage result = driveTimeInput.submit();
		Assert.assertTrue(result.verifyDriveTime("4.12"));
		Assert.assertTrue(result.verifyAge("29.12"));
	}
}