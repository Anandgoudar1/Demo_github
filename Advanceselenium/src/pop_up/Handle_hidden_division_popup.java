package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_hidden_division_popup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='r-date']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[.='3'])[1]")).click();
	String r = driver.getCurrentUrl();
	System.out.println(r);
}
}
