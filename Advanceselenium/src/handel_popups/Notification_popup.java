package handel_popups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup 
{
    public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com");
		Thread.sleep(2000);
		driver.get("https://admin:admin@the-internet.herokuapp.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Basic Auth']")).click();
		Thread.sleep(2000);
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Select PDF file']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\Anand resume_organized_organized.pdf");
	}
}
