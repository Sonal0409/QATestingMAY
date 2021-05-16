package com.qa.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestCase2 {
	
	//use same pom file as given
	
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	/*	driver.findElement(By.xpath("copy past the xpth value")).click();
		driver.findElement(By.xpath("value")).sendKeys("myinput");*/
	}
	
	

}
