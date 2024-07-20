package org.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Practice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tinyme.com/personalized-bags");
		driver.manage().window().maximize();
		WebElement namelabel = driver.findElement(By.xpath("//span[text()='Name Labels']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(namelabel).perform();
		WebElement tap = driver.findElement(By.xpath("(//span[text()='×'])[1]"));
		tap.click();
		Thread.sleep(3000);
		
		
		WebElement shoe = driver.findElement(By.xpath("//span[text()='Shoe Labels']"));
		actions.moveToElement(namelabel).perform();
		//actions.moveToElement(shoe).perform();
		shoe.click();
		WebElement classs = driver.findElement(By.className("base"));
		String text = classs.getText();
		System.out.println(text);
		Thread.sleep(2000);
		//actions.moveToElement(namelabel).perform();
		//WebElement hl = driver.findElement(By.xpath("//span[text()='Household Labels']"));
		
		//hl.click();
		
		
	}
	
}
