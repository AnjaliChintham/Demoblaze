package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_pages {
WebDriver driver;
WebElement textbox;
 public void url() {
	 System.setProperty("webdriver.chrome.driver", "D:/SeleniumJars/ChromeDriver/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 driver.get("https://www.google.com/");
	 System.out.println(driver.getTitle());
	 
 }
 
 public void website() {
	driver.get("https://www.demoblaze.com/");
	//System.out.println(driver.getTitle());
	
 }
 
 public void login()
 {
	 driver.findElement(By.id("login2")).click();
	 driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("Anjali");
	 driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("anjali12");
	
 }
 public void click() {
	 driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
 }
 

}
