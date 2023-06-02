package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_keys {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("C:/Users/HP/Desktop/A3.html");
        WebElement ele = driver.findElement(By.id("a1"));
        Thread.sleep(2000);
        ele.sendKeys(Keys.CONTROL+"a");
        Thread.sleep(2000);
        ele.sendKeys(Keys.DELETE);
}
}
