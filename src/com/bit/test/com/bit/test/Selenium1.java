package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
	ChromeDriver dr;
	String a;

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Urmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		a = "java is hard";
	}

	public void closebrowser() throws InterruptedException {
		Thread.sleep(10000);
		dr.quit();
		a = "but managable";
	}

	public void getWeb(String url) {
		dr.get(url);
	}

	public void clickOnElement(By by) {
		dr.findElement(by).click();

	}

	public void typeOnit(By by, String textValue) {
		dr.findElement(by).sendKeys(textValue);

	}

}
