package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchthesrcvalueofimage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(1500);
	List<WebElement> image = driver.findElements(By.xpath("//img"));
	int count = image.size();
	System.out.println(count);
	for (WebElement we : image) {
		String src1 = we.getAttribute("src");
		System.out.println(src1);
	}
}
}
