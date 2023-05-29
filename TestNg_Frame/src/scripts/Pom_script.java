package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_script {
//declaration
	@FindBy(name="email")
	private WebElement emailbox;
	@FindBy(name="pass")
	private WebElement passbox;
	@FindBy(xpath="//button[.='Log in']")
	private WebElement loginbtn;
	//initilation
	public Pom_script(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void emaildata()
	{
		emailbox.sendKeys("anandgoudar679@gmail.com");
	}
	public void pswdata()
	{
		passbox.sendKeys("Anand@123");
	}
	public void clicklogin()
	{
		loginbtn.click();
	}
}
