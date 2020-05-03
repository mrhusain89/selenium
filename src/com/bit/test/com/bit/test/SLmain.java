package com.bit.test;


import org.openqa.selenium.By;

public class SLmain {
	public static void main(String[] args) throws InterruptedException {
		Selenium1 a = new Selenium1();
		a.openBrowser();
	
		a.getWeb("https://www.walmart.com/");
		a.clickOnElement(By.id("global-search-input"));
		a.typeOnit(By.id("global-search-input"),"window AC");
		
		a.closebrowser();
	}
}
