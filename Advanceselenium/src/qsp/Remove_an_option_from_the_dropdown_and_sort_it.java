package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Remove_an_option_from_the_dropdown_and_sort_it {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		Thread.sleep(1000);
	     WebElement ele = driver.findElement(By.id("month"));
	     Select s=new Select(ele);
		ArrayList<String> l=new ArrayList<String>();
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		System.out.println(count);
		for (WebElement we : opt) 
		{
		   String t = we.getText();	
		   l.add(t);
		   l.remove("Sep");
		}
		Collections.sort(l);
		for (String l1 : l) 
		{
			System.out.println(l1);
		}
}
}
