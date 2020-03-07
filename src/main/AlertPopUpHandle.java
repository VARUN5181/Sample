package main;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]")).click();
		//will create alert API
		Alert alert  = driver.switchTo().alert();
		System.out.println(alert.getText());
		String s = alert.getText();
		if(s.equals("Please enter a valid user name"))
		{
			System.out.println("T");
		}
		else
		{
			System.out.println("F");
		}
		alert.accept(); // click on ok butten
		//alert.dismiss(); //click on cancle butten
		
	}
}
