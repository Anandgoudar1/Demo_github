package pop_up;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Practice_programme {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.uitestpractice.com/Students/Form");
	Thread.sleep(1000);
	driver.findElement(By.id("firstname")).sendKeys("Anand");
	driver.findElement(By.id("lastname")).sendKeys("Goudar");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='radio']/../../label[3]/input")).click();
	driver.findElement(By.xpath("//input[@type='checkbox']/../../label[2]/input")).click();
	WebElement ele = driver.findElement(By.id("sel1"));
	Select s=new Select(ele);
	s.selectByVisibleText("India");
	driver.findElement(By.id("datepicker")).click();
	driver.findElement(By.xpath("//a[.='9']")).click();
	driver.findElement(By.id("phonenumber")).sendKeys("7026164937");
	driver.findElement(By.id("username")).sendKeys("anandgoudar");
	driver.findElement(By.id("email")).sendKeys("anandgoudar679@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("comment")).sendKeys("i am anand i am from bagalkot district");
	driver.findElement(By.id("pwd")).sendKeys("Anand@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='Submit']")).click();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst=new File("C:\\Users\\HP\\Desktop\\scr\\photos.jpeg");
	FileHandler.copy(src, dst);
}
}
