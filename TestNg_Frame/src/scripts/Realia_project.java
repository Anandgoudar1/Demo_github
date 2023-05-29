package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Realia_project extends Generic_Script 
{
@Test
public void search()
{
	//driver.findElement(By.id("edit-search-block-form--2")).sendKeys("Rajajinagar");
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	WebElement ele = driver.findElement(By.xpath("//span[.='Listing']"));
	Actions t=new Actions(driver);
	t.moveToElement(ele).perform();
	driver.findElement(By.xpath("//a[.='Listing grid']")).click();
	driver.findElement(By.xpath("//span[.='Price']")).click();
}
}
