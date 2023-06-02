package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usinggetcssvaluemethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.id("search"));
	Thread.sleep(2000);
	String fs=ele.getCssValue("font-size");
	System.out.println(fs);
}
}
