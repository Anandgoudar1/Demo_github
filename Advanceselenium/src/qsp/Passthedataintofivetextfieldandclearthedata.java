package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passthedataintofivetextfieldandclearthedata {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/A8.html");
	List<WebElement> text = driver.findElements(By.xpath("//input"));
	int count = text.size();
	System.out.println(count);
	for (WebElement we : text) {
		we.sendKeys("Anand");
	}
	Thread.sleep(1000);
	for(int i=count-1;i>=0;i--)
	{
		WebElement we = text.get(i);
		we.clear();
	}
}
}
