package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sort_the_option_by_using_Treeset {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(1000);
	driver.get("https://www.facebook.com/r.php?locale=en_GB");
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.id("month"));
	Select s=new Select(ele);
	TreeSet<String> t1=new TreeSet<String>();
	List<WebElement> opt = s.getOptions();
	int count = opt.size();
	System.out.println(count);
	for (WebElement we : opt) 
	{
		String t = we.getText();
		t1.add(t);//add the text into treeset
	}
	for (String t2 : t1) 
	{
	   System.out.println(t2);	
	}
}
}
