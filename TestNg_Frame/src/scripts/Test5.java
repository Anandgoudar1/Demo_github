package scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5 extends Generic_Script
{
	@Test
	public void validLogin() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}
	@Test
	public void passward() throws InterruptedException
	{
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Assert.fail();	
	}
}
