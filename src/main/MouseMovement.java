package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/Default.aspx");
		 
		Actions a = new Actions(driver);
		
		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		
		
		driver.findElement(By.linkText("Hot Meals")).click();
		
	}
}
