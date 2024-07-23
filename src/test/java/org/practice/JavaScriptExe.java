package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class JavaScriptExe {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
//	WebElement element = driver.findElement(By.xpath("//span[text()='Up to 60% off | Kitchen essentials | From local stores nearby']"));
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("arguments[0].scrollIntoView(true)", element);
	
	WebElement clk = driver.findElement(By.xpath("//img[@alt='Tata Sampann Unpolished Toor Dal/Arhar Dal, 1kg']"));
	String data="Tata Sampann Unpolished Toor Dal/Arhar Dal, 1kg";
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','"+data+"')", clk);
	clk.click();
	
	
	}
}
