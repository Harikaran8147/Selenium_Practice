package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("www.starsports.com");
		driver.manage().window().maximize();
		
	}

}
