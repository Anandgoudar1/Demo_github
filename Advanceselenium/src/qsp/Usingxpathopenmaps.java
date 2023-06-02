package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingxpathopenmaps {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.googlemaps.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']"))
		.sendKeys("Bangaluru,Karnataka");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-tooltip='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']"))
		.sendKeys("Mysore, Karnataka");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@data-tooltip='Search'])[2]")).click();
	     	
}
}
