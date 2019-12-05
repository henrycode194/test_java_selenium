package com.henry.lunes_selenium_obj_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class google_home extends BasePage{
	By searchbox = By.name("q");
	
	public google_home(WebDriver driver) {
		super(driver);
	}
	
	public void write_search(String text_searchable ) {
		write_search(searchbox, text_searchable);
		enter(searchbox);
		
	}

}
