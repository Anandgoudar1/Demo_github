package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownismultiselectdropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/A10.html");
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.id("Tindi mane"));
	Select s=new Select(ele);
	boolean b = s.isMultiple();
	if(b)
	{
		System.out.println("multiple select dropdown");
	}
	else
	{
		System.out.println("not a multiple select dropdown");
	}
}
}
