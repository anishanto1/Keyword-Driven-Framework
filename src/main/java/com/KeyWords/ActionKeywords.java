package com.KeyWords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionKeywords {
	
	WebDriver driver;

	public void Configuration() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.http.factory", "jdk-http-client");

	}

	public void GoToURL() {

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	public void UserNmae() {
		
		WebElement Username = driver.findElement(By.xpath("//*[@name='username']"));
		Username.sendKeys("Admin");

	}

	public void Password() {

		WebElement Password = driver.findElement(By.xpath("//*[@name='password']"));
		Password.sendKeys("admin123");
	}

	public void ClickSummit() {
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		
	}

}



