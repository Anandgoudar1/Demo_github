package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usinggetsize_getheight_getwidth_method {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://ssc.nic.in/");
	WebElement ele = driver.findElement(By.xpath("//input[@class='form-control']"));
	Thread.sleep(2000);
	int h = ele.getSize().getHeight();
	System.out.println(h);
	int w = ele.getSize().getWidth();
	System.out.println(w);
}
}
