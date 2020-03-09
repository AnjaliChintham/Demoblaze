package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact_pages {
	WebDriver driver;
	WebElement textbox;
	
	public void url() {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\ChromeDriver\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
	
	public void application() {
		driver.get("https://www.demoblaze.com/");
	}
	public void contact() {
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys("anjali@gamil.com");
		driver.findElement(By.id("recipient-name")).sendKeys("Anjali");
		driver.findElement(By.id("id=\"message-text\"")).sendKeys("hello");
		
	}
	public void send() {
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
	}
	

}
