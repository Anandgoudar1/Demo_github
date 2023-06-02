package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Preform_hover_action_faction_element_in_flipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class=_2kpZ61 _2doB4z']")).click();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//img[@loading='lazy']"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
}
}
