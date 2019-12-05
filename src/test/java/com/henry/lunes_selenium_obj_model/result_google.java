package com.henry.lunes_selenium_obj_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class result_google extends BasePage{
	public By element_link = By.tagName("a");
	public result_google(WebDriver driver){
		super(driver);
	}
	
	public void print_links() {
		search_links_print(element_link);
	}

}
