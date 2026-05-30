package com.maven.com.maven_projrct;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_maven_program {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("Title : "+driver.getTitle());
		Thread.sleep(2000);
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Sample Maven Web driver Program");
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}

}
