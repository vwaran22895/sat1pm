package com.intro;

import org.openqa.selenium.By;
  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Array {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigneshwaran\\eclipse-workspace\\Intrduction\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input"));
		login.sendKeys("vicky");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("7897809");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Log In']"));
		button.click();
	}

}
