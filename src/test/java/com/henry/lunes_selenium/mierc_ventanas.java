package com.henry.lunes_selenium;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mierc_ventanas {
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/popup.php");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		String MainWindow=driver.getWindowHandle();
		System.out.println(MainWindow);
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.name("emailid")).sendKeys("dfj@gmail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Set<String> s2=driver.getWindowHandles();
		System.out.println(s2.size());
		driver.switchTo().window(MainWindow);
		
	}

}
