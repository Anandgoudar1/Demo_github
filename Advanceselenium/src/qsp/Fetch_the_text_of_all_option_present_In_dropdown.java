package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fetch_the_text_of_all_option_present_In_dropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/r.php?locale=en_GB");
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.id("year"));
	Select s=new Select(ele);
	List<WebElement> opt = s.getOptions();
	int count = opt.size();
	System.out.println(count);
	for (WebElement we : opt) 
	{
		String t = we.getText();
		System.out.println(t);
	}
}
}
