package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertAll_method extends Generic_Script{
@Test
public void validlogin() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("pass")).sendKeys("admin");
	driver.findElement(By.name("login")).click();
	Thread.sleep(1000);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(url, "http://www.facebook");
	System.out.println("hh");
	sa.assertAll();
}
}
