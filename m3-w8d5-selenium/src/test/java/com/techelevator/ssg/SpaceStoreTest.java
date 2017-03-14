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
import com.techelevator.ssg.pageobject.SpaceStore;
import com.techelevator.ssg.pageobject.SpaceStoreInputPage;

public class SpaceStoreTest {

	private static WebDriver webDriver;
	private HomePage homePage;
	private SpaceStore spaceStore;

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
	public void test_space_store(){
		SpaceStore spaceStore = homePage.clickSpaceStoreLink();
		SpaceStoreInputPage inputPage = spaceStore.selectItemToPurchase("1");
		inputPage.addQuantityToPurchase("2");
		inputPage.submit();
		Assert.assertTrue(spaceStore.verifyPurchase("2", "Coffee Mug"));
	}

	
}
