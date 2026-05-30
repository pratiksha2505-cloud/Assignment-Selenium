//same program but using junit as in search box type search data
package com.maven.com.maven_projrct;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JUnitWebdriverProgram {
	 static WebDriver driver;
@BeforeAll
public static void setup()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
}

@Order(1)
@Test
public void getPageData()
{
	System.out.println("Current URL : "+driver.getCurrentUrl());
	
	System.out.println("Page Title : "+driver.getTitle());
}
@Order(2)
@Test
public void searchTest() throws InterruptedException
{
	WebElement searchbox=driver.findElement(By.name("q"));
	searchbox.sendKeys("Sample Maven Web driver Program");
	searchbox.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
}

@AfterAll
public static void closeBrowser()
{
	driver.close();
}
}
