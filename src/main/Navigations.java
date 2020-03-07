package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.in/ref=nav_logo");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.quit();
	}
}
