package com.henry.lunes_selenium_obj_model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	WebDriver driver;
	
	public  BasePage (WebDriver driver) {
		this.driver =driver;}
	
	
	public void write_search (By element,String text_searchable) {
		driver.findElement(element).sendKeys(text_searchable);}
	
	public void enter(By locator) {
		WebElement box = driver.findElement(locator);
		box.submit();
		System.out.println(" - nnmbnmbnm" );
	}
	
	public void search_links_print(By locator) {
		List<WebElement> allLinks = driver.findElements(locator);
		for(WebElement link:allLinks){
		System.out.println(link.getText() + " - " + link.getAttribute("href"));
		allLinks.size();}
	}
	
}
