package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//isDisplayed is for all webelement returns t/f
		
		//boolean b = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).isDisplayed();
		//System.out.println(b);
		
		//if we accept the terms and conditions it will true if not false
		//boolean b =driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).isEnabled();
		//System.out.println(b);
		
		//isSelected() is only for dropdown, checkbox, radiobutten
		//to check whether the radio butten is selected or not
	}
}
