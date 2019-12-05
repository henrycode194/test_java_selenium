package com.henry.lunes_selenium;

import com.henry.lunes_selenium_obj_model.google_home;
import com.henry.lunes_selenium_obj_model.result_google;

import static org.junit.Assert.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class lunes_selenium {
	private WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.es/");
	}

	@After
	public void tearDown() throws Exception {
		driver.close();		
	}

	@Test
	public void test() throws InterruptedException {
		google_home page1 = new google_home(driver);  
		page1.write_search("gfi");
		Thread.sleep(3000);
		result_google page2 = new result_google(driver);
		page2.print_links();
		
	
	}

}
