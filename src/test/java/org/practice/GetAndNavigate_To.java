package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate_To {
	
	private void methodsuma() {
		System.out.println("yes");

	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.amazon.in/");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		//driver.quit();
		
		
		
	}

}
