package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Empty_chrome_browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		String b = "https://www.facebook.com/";
		String d = "Facebook - log in or sign up";
		String a = driver.getCurrentUrl();
		System.out.println(a);
		String c = driver.getTitle();
		System.out.println(c);
		if (a.equals(b)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		if (c.equals(d)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
