package com.henry.lunes_selenium;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class martes_selenium {
	
	private WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/web-table-element.php");
	}

	@After
	public void tearDown() throws Exception {
		driver.close();	
	}

	@Test
	public void test() throws InterruptedException {
		WebElement table = driver.findElement(By.xpath("//tbody[1]"));
		List<WebElement> filas = table.findElements(By.tagName("tr"));
		Thread.sleep(2000);
		List<WebElement> columnas = filas.get(1).findElements(By.tagName("td"));
		filas.size();
		System.out.println("El numero de filas es :" + filas.size()+
				"\nEl numero de columnas es :"+ columnas.size());
		int contador =0;
		for (WebElement fila:filas) {
			contador = contador+1 ;
			String texto = fila.findElement(By.xpath("td[1]")).getText();
			System.out.println("\n "+contador+" -"+texto);
		}
		
	}

}
