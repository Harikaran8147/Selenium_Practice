package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Commands {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Navigation navigate = driver.navigate();
		navigate.to("https://www.flipkart.com/");
		navigate.to("https://www.amazon.in/");
		navigate.to("https://www.irctc.co.in/nget/train-search");
		
		navigate.back();
		navigate.forward();
	}

}
