package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
	public static void main(String[] args) throws InterruptedException {
		//we always need to tell
			//1. what driver we will be using
			//2.where that driver
		
		
		
		// set system properties
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\Halil\\Documents\\selenium dependencies\\drivers\\geckodriver.exe");
//		// create driver object
//		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Halil\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		// create driver object
		//webdriver  = class that is used to control a browser
		WebDriver driver = new ChromeDriver();
		// get - goes to a certain website
		//driver.get("https://google.com");
		
		
		//=====================================================
		
		/**
		 * Test Case 1: Google Title Verification
		 * 1.Open a chrome browser
		 * 2.Go to http://google.com
		 * 3.Verify title:
		 *  Expected: Google
		 */
		
//		String expected= "Google";
//		String actual=driver.getTitle();
//		System.out.println(actual);
//		if(expected.equals(actual)) {
//			System.out.println("Test 1 Pass!");
//		}else {
//			System.out.println("Test 1 Failed!");
//			System.out.println("Expected: "+expected);
//			System.out.println("Actual: "+actual);
//		}
		
		
		//=====================================================
		
		/**
		 * Test Case 2: Cybertek Url Verification
		 * 1.Open a chrome browser
		 * 2.Go to http://cybertek.com
		 * 3.Verify title contains:
		 *  Expected: cybertekschool
		 */
		
		//navigate().to() = driver.get()
//		driver.navigate().to("https://cybertekschool.com");
//		String expected2="cybertekschool";
//		String actual2 = driver.getCurrentUrl();
//		System.out.println(actual2);
//		
//		if(actual2.contains(expected2)) {
//			System.out.println("Test 2 pass");
//		}else {
//			System.out.println("Test 2 failed.");
//			System.out.println("Expected: "+expected2);
//			System.out.println("Actual: "+actual2);
//		}
		
		//=====================================================
		
		/**
		 * Test Case 3: Back and forth navigation 
		 * 1.Open a chrome browser
		 * 2.Go to http://google.com
		 * 3.click on link "Gmail"
		 * 4.Verify title contains:
		 *  Expected: Gmail
		 * 5.go back to Google by using the Back button
		 * 6.Verify title contains:
		 * 	Expected: Google
		 * 7.Go back to Gmail using the Forward button
		 * 8.Verify title contains:
		 * 	Expected: Gmail
		 */
//		driver.get("https://google.com");
//		
//		driver.findElement(By.linkText("Gmail")).click();
//		String expected = "Gmail";
//		String actual = driver.getTitle();
//		System.out.println(actual);
//		if(actual.contains(expected)) {
//			System.out.println("Test 3.1 Pass");
//		}else {
//			System.out.println("Test 3.1 failed.");
//			System.out.println("Expected: "+expected);
//			System.out.println("Actual: "+actual);
//		}
//		
//		driver.navigate().back();
//		
//		String expected2 = "Google";
//		String actual2 = driver.getTitle();
//		System.out.println(actual2);
//		if(actual2.contains(expected2)) {
//			System.out.println("Test 3.2 Pass");
//		}else {
//			System.out.println("Test 3.2 failed.");
//			System.out.println("Expected: "+expected2);
//			System.out.println("Actual: "+actual2);
//		}
//		
//		driver.navigate().forward();
//		String expected3 = "Gmail";
//		String actual3 = driver.getTitle();
//		System.out.println(actual3);
//		if(actual3.contains(expected3)) {
//			System.out.println("Test 3.3 Pass");
//		}else {
//			System.out.println("Test 3.3 failed.");
//			System.out.println("Expected: "+expected3);
//			System.out.println("Actual: "+actual3);
//		}
		
		//=====================================================
		
		/**
		 * Test Case 4: Basic Authentication Test
		 * 1.open browser chrome 
		 * 2. go to website http://newtours.demoaut.com/
		 * 3.enter username
		 * 4.enter password
		 * click Sign in button
		 * verify title contains:
		 * 	Expected: Find a Flight 
		 * 
		 */
		
//		driver.get("http://newtours.demoaut.com/");
//		driver.findElement(By.name("userName")).sendKeys("tutorial");
//		driver.findElement(By.name("password")).sendKeys("tutorial");
//		driver.findElement(By.name("login")).click();
//		String expected ="Find a Flight";
//		String actual  = driver.getTitle();
//		System.out.println(actual);
//		if(actual.contains(expected)) {
//			System.out.println("Test 4 Pass");
//		}else {
//			System.out.println("Test 4 failed");
//			System.out.println("Expected: "+expected);
//			System.out.println("Actual: "+actual);
//		}
		
		//=====================================================
		
		driver.navigate().to("https://google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Nicaragua");
		element.submit();
		driver.findElements(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a")).get(0).click();
		Thread.sleep(1000);
		driver.findElements(By.xpath("//*[@id=\"pane\"]/div/div[2]/div/div/div[1]/button[2]/div/div")).get(0).click();
		Thread.sleep(1000);
		driver.findElements(By.xpath("//*[@id=\"sb_ifc51\"]/input")).get(0).sendKeys("Columbus, OHIO");;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"sb_ifc51\"]/input")).click();
		Thread.sleep(2000);
		driver.findElements(By.xpath("//*[@id=\"omnibox-directions\"]/div/div[2]/div/div/div[1]/div[2]/button/div[1]")).get(0).click();
		Thread.sleep(15000);
		driver.close();

	}

}
