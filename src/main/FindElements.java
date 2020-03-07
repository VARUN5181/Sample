package main;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		//get the count of links on page
		//get the text of each link on the page
		
		//List <WebElement>  linklist = driver.findElements(By.tagName("input"));
		List <WebElement>  linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		for(int i=0;i<linklist.size();i++)
		{
			String text = linklist.get(i).getText();
			System.out.println(text);
		}
		//blank links
	}
}
