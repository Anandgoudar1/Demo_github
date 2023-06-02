package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrefvalueoflinkusingforeachloop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	Thread.sleep(1000);
	List<WebElement> href = driver.findElements(By.xpath("//a"));
	int count = href.size();
	System.out.println(count);
	for (WebElement we : href) 
	{
		String href1 = we.getAttribute("href");
		System.out.println(href1);
	}
}
}
