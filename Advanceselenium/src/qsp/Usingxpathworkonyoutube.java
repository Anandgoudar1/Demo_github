package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingxpathworkonyoutube {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kgf trailer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-icon[@icon='yt-icons:search' and @class='topbar-icons style-scope ytd-masthead']")).click();
		Thread.sleep(2000);
}
}

