package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_keys1 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/HP/Documents/A4.html");
        WebElement ele=driver.findElement(By.id("a1"));
        Thread.sleep(2000);
        ele.sendKeys(Keys.CONTROL+"a"+"x");
        Thread.sleep(2000);
        WebElement ele1=driver.findElement(By.id("c1"));
        Thread.sleep(2000);
        ele1.sendKeys(Keys.CONTROL+"v");
        Thread.sleep(2000);
        WebElement ele2=driver.findElement(By.id("b1"));
        Thread.sleep(2000);
        ele2.sendKeys(Keys.CONTROL+"a"+"x");
        Thread.sleep(2000);
        WebElement ele3=driver.findElement(By.id("a1"));
        Thread.sleep(2000);
        ele3.sendKeys(Keys.CONTROL+"v");
        Thread.sleep(2000);
        WebElement ele4=driver.findElement(By.id("c1"));
        Thread.sleep(2000);
        ele4.sendKeys(Keys.CONTROL+"a"+"x");
        Thread.sleep(2000);
        ele2.sendKeys(Keys.CONTROL+"v");
        Thread.sleep(2000);
       
}
}

