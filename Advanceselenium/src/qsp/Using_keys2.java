package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_keys2  {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/HP/Desktop/A5.html");
	WebElement ele=driver.findElement(By.id("a1"));
	boolean b = ele.isDisplayed();
	if(b)
	{
		System.out.println("Element displayed");
	}
	else
	{
		System.out.println("Element not displayed");
	}
}
}