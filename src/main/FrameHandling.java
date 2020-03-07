package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		
		//fail
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Switch to main frame and find the element
		driver.switchTo().frame("mailpanel");
		driver.findElement(By.xpath("//a[contains(text(),'Contacts']")).click();
	}
}
