package com.techelevator.ssg;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.techelevator.ssg.pageobject.HomePage;
import com.techelevator.ssg.pageobject.WeightCalculatorInputPage;
import com.techelevator.ssg.pageobject.WeightCalculatorResultsPage;

public class HomePageTest {

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
		WeightCalculatorInputPage weightInput = homePage.clickWeightCalculatorLink();
		weightInput.selectPlanet("Mercury");
		weightInput.inputWeight("100");
		
		WeightCalculatorResultsPage result = weightInput.submit();
		Assert.assertTrue(result.verifyWeight("37.0"));
	}
}


