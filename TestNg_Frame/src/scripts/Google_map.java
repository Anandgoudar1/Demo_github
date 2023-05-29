package scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Google_map extends Generic_Script {
@Test
public void googlemap() throws InterruptedException
{
	driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']"))
	.sendKeys("Bangaluru,Karnataka");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@data-tooltip='Search']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']"))
	.sendKeys("Mysore, Karnataka");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@data-tooltip='Search'])[2]")).click();
     	String title = driver.getTitle();
     	System.out.println(title);
     	Assert.assertEquals(title, "Google Maps");
     	System.out.println("1");
}
}

