package com.henry.lunes_selenium_obj_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page1_mierco extends base_page_mierc{

	public page1_mierco(WebDriver driver) {
		super(driver);
	}
	
	public void write_text() {
		WebElement box;
		box = driver.findElement(By.cssSelector("input[name='cusid']"));
		box.sendKeys("Hola 11");
	}
	
	public void click_submit() {
		WebElement submit_btn;
		submit_btn = driver.findElement(By.cssSelector("input[name='submit']"));
		submit_btn.click();
	}
	
	
	

}
