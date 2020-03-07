package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpLoadPopUp 
{
	public static void main(String[] args) 
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		//uploding the file
		//dont use click
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\user\\Desktop\\Important\\BDD.docx");
		
	}
}
