package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		String s = driver.getTitle();
		if(s.equals("Google"))
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Not");

		}
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}
