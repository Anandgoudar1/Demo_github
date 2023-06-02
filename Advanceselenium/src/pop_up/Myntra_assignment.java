package pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_assignment {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com");
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("pumashirts");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	driver.findElement(By.xpath("//img[@src='https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/21888054/2023/2/9/7d002f81-9682-4e72-be2a-5775d41211181675933615910PumaWorldwideAOPMenPrintedShirt1.jpg']")).click();
	Set<String> hii = driver.getWindowHandles();
	for (String wh : hii) {
		driver.switchTo().window(wh);
	}
	driver.findElement(By.xpath("//p[.='40']")).click();
	driver.findElement(By.xpath("//div[.='ADD TO BAG']")).click();
}
}
