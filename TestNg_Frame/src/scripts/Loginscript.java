package scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Loginscript {
@Test
public void validlogin() throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Pom_script p=new Pom_script(driver);
	p.emaildata();
	Thread.sleep(2000);
	p.pswdata();
	Thread.sleep(2000);
	p.clicklogin();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\HP\\Desktop\\Facebook src\\Photos.jpeg");
	FileHandler.copy(src, des);
}
}