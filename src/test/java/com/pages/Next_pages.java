package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Next_pages {
	WebDriver driver;
	WebElement textbox;
	public void url() {
		System.setProperty("webdriver.chrome.driver", "D:/SeleniumJars/ChromeDriver/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		
	}
	
	public void website() {
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());
	}

	public void scrollby() {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		driver.findElement(By.id("next2")).click();
	}
	public void click() {
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
	}

}
