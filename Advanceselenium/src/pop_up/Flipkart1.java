package pop_up;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	//driver.findElement(By.xpath("//a[.='Login']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='✕']")).click();
	driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	for (int i = 0; i < 10; i++) {
		js.executeScript("window.scrollBy(0,560)");
		Thread.sleep(1000);
	}
	     WebElement p = driver.findElement(By.xpath("//div[.='4. vivo T2x 5G (Aurora Gold, 1...']"));
	     Point str = p.getLocation();
	     System.out.println(str);
	     p.click();
	      Set<String> t = driver.getWindowHandles();
	     for (String string1 : t) {
			driver.switchTo().window(string1);
			//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		}		
	     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
}
}
	


