package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_pop_up {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/A1.html");
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.name("upload file"));
	ele.sendKeys("C:\\Users\\HP\\Desktop\\A5 - Shortcut.lnk");
}
}
