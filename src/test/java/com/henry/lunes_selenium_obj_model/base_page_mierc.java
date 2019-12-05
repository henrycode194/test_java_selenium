package com.henry.lunes_selenium_obj_model;

import org.openqa.selenium.WebDriver;

public class base_page_mierc {
	WebDriver driver;
	
	public  base_page_mierc (WebDriver driver) {
		this.driver =driver;}
	
	public void ok_alerta() {
		driver.switchTo().alert().accept();
	}
	
	public String get_text_alert() {
		return driver.switchTo().alert().getText();
	}
	
	

}
