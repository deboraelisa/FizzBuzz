package com.techelevator.ssg;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.techelevator.ssg.pageobject.HomePage;
import com.techelevator.ssg.pageobject.SpaceForum;
import com.techelevator.ssg.pageobject.SpaceForumInputPage;

import com.techelevator.ssg.pageobject.WeightCalculatorInputPage;
import com.techelevator.ssg.pageobject.WeightCalculatorResultsPage;

public class SpaceForumTest {
	private static WebDriver webDriver;
	private HomePage homePage;
	private SpaceForum spaceForum;

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
	public static void closeWebDriver() {
		webDriver.close();
	}
	
	@Test
	public void test_forum_post(){
		SpaceForum spaceForum = homePage.clickSpaceForumLink();
		SpaceForumInputPage inputPage = spaceForum.clickNewMessageLink();
		inputPage.inputUserName("alien");
		inputPage.inputSubject("travel to Mars");
		inputPage.inputMessage("leaving tomorrow");
		spaceForum = inputPage.submit();
		Assert.assertTrue(spaceForum.VerifyPost("alien", "travel to Mars", "leaving tomorrow"));
	}

	
	

}
