package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.http.factory", "jdk-http-client");

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000);
		WebElement Username = driver.findElement(By.xpath("//*[@name='username']"));
		Username.sendKeys("Admin");

		Thread.sleep(2000);
		WebElement Password = driver.findElement(By.xpath("//*[@name='password']"));
		Password.sendKeys("admin123");

		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();


	}

}
