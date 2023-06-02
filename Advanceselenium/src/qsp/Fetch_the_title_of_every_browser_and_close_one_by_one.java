package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fetch_the_title_of_every_browser_and_close_one_by_one {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	WebElement ele = driver.findElement(By.id("navbarDropdown"));
	WebElement ele1 = driver.findElement(By.xpath("//a[.='Downloads']"));
	WebElement ele2 = driver.findElement(By.xpath("//a[.='Documentation']"));
	WebElement ele3 = driver.findElement(By.xpath("//a[.='Projects']"));
	WebElement ele4 = driver.findElement(By.xpath("//a[.='Support']"));
	WebElement ele5 = driver.findElement(By.xpath("//a[.='Blog']"));
	ArrayList<WebElement> t=new ArrayList<WebElement>();
	t.add(ele);
	t.add(ele1);
	t.add(ele2);
	t.add(ele3);
	t.add(ele4);
	t.add(ele5);
	int count = t.size();
	System.out.println(count);
	for (WebElement l : t) {
		Actions act=new Actions(driver);
		act.contextClick(l).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}
	Set<String> allwh = driver.getWindowHandles();
	int count1 = allwh.size();
	System.out.println(count1);
	int i=0;
	for (String r : allwh) {
               if(i==count1-6)
               {
            	   driver.switchTo().window(r);
            	   Thread.sleep(1000);
               }
               i++;
	}
}
}
