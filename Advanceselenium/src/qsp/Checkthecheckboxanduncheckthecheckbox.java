package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkthecheckboxanduncheckthecheckbox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/A7.html");
	Thread.sleep(1000);
	List<WebElement> links = driver.findElements(By.xpath("//input"));
	int count = links.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		 WebElement we = links.get(i);
		 we.click();
	}
	for(int i=count-1;i>=0;i--)
	{
	    WebElement we = links.get(i);
	    we.click();
	}
}
}
