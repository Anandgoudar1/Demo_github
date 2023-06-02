package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURLwithoutusinggetmathod {
public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.navigate().to("https://www.facebook.com/");
   driver.navigate().to("https://www.instagram.com/");
   Thread.sleep(1500);
   driver.navigate().back();//to perform backward action
   Thread.sleep(1000);
   driver.navigate().forward();//to perform forward action
   Thread.sleep(1000);
   driver.navigate().refresh();//To refresh the page
}
}
