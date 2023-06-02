package pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_assignment {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("goudar_anand");
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("anand@123.");
	driver.findElement(By.xpath("//div[.='Log in']")).click();
	driver.findElement(By.xpath("//div[.='Not Now']")).click();
	driver.findElement(By.xpath("//button[.='Not Now']")).click();
	driver.findElement(By.xpath("//svg[@class='_ab6-']")).click();
	driver.findElement(By.xpath("//div[.='Follow']")).click();
	driver.findElement(By.xpath("//div[@class='x78zum5 x2lah0s']")).click();
}
}
