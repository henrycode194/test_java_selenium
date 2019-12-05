package com.henry.lunes_selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.henry.lunes_selenium_obj_model.page1_mierco;

public class miercoles_selenium {
	private WebDriver driver;
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.close();		
	}

	@Test
	public void test() throws InterruptedException {
		page1_mierco pag1 = new page1_mierco(driver);
		pag1.write_text();
		pag1.click_submit();
		Thread.sleep(2000);
		System.out.println(pag1.get_text_alert());
		pag1.ok_alerta();
		Thread.sleep(2000);
		assertEquals(pag1.get_text_alert(), "Customer Successfully Delete!");
		System.out.println(pag1.get_text_alert());
		pag1.ok_alerta();
		Thread.sleep(5000);
		
	}

}
