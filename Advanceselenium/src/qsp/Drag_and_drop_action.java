package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop_action {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html ");
	Thread.sleep(1000);
	WebElement src = driver.findElement(By.id("box4"));
	WebElement des = driver.findElement(By.id("box103"));
	Actions act=new Actions(driver);
	act.dragAndDrop(src, des).perform();
}
}
