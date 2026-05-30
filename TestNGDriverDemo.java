package com.maven.com.maven_projrct;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDriverDemo {
	WebDriver driver;
	
@BeforeClass
public void setup()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
}

@Test(priority=1)
public void getData()
{
System.out.println("Current URL : "+driver.getCurrentUrl());
	
	System.out.println("Page Title : "+driver.getTitle());
}
@Test(priority=2)
public void searchTest() throws InterruptedException
{
	WebElement searchbox=driver.findElement(By.name("q"));
	searchbox.sendKeys("Sample Maven Web driver Program");
	searchbox.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
}
@AfterClass
public void close()
{
	driver.quit();
}
}
