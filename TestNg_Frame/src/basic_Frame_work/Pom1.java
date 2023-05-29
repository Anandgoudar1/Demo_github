package basic_Frame_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
		@FindBy(name="user")
		private WebElement email;
		@FindBy(id="pass")
		private WebElement pass;
		@FindBy(xpath = "//button[.='Log in']")
		private WebElement login;
		public Pom1(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		public void emaildata(String data) {
			email.sendKeys(data);
		}
		 public void pwddata(String data1) {
			  pass.sendKeys(data1);
			}
		 public void loginbtn() {
				login.click();
			}
	}

