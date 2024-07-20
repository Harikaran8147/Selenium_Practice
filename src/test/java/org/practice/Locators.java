package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Locators using ID
		WebElement id = driver.findElement(By.id("email"));
			                                                        //tagname[@attributename='attributevalue']
		
			//WebElement findElement = driver.findElement(By.xpath("//input[@id='email']"));
		id.sendKeys("harikaran");
		//Locators using Name
		WebElement name = driver.findElement(By.name("pass"));
			//WebElement findElement = driver.findElement(By.xpath("//input[@id='pass']"));
		name.sendKeys("4567890ihhgfytu53");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Log in']"));
		button.click();
		System.out.println("success");
		
		
		//button[contains(text(),'Log')]
		
	}

}
