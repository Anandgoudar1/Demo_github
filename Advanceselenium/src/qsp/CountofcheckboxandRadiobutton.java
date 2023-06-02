package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountofcheckboxandRadiobutton {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(1000);
	List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']|//input[@type='radio']"));
	int count = check.size();
	System.out.println(count);
}
}
