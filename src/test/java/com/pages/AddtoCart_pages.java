package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart_pages {
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
	}

	public void selectitem() {
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		
	}
	public void Addelement() {
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
	}
}
