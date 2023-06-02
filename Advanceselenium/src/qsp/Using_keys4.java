package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_keys4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/HP/Desktop/A6.html");
	WebElement ele=driver.findElement(By.id("a1"));
	boolean b = ele.isSelected();
	if(b)
	{
		System.out.println("Element checked");
	}
	else
	{
		System.out.println("Element not checked");
	}
}
}