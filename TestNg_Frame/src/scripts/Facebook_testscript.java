package scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook_testscript extends Generic_Script{
@Test
public void validlogin() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("pass")).sendKeys("manager");
	driver.findElement(By.name("login")).click();
	Thread.sleep(1000);
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Log in to Facebook");
	System.out.println("1");
}
@Test
public void validlogin1() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("pass")).sendKeys("admin");
	driver.findElement(By.name("login")).click();
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
}
}

