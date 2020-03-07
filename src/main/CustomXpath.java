package main;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("java");
		
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("java");
		
		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("java");
		
		driver.findElement(By.xpath("//input[starts-with(@id,'test-')]")).sendKeys("java");
		
		driver.findElement(By.xpath("//input[ends-with(@id,'test-')]")).sendKeys("java");
		
		//for links 
		driver.findElement(By.linkText("//a[contains(text(),'Advanced']")).click();
		
		
	}
}
