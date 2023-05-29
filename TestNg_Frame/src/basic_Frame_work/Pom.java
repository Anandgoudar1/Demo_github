package basic_Frame_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
@FindBy(id="email")
private WebElement usname;
@FindBy(name="pass")
private WebElement pass;
@FindBy(name="login")
private WebElement loginbtn;
 public Pom(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 public void usname(String data) {
	usname.sendKeys(data);
}
 public void pwd(String data) {
	  pass.sendKeys(data);
	}
 public void loginbtn() {
		loginbtn.click();
	}
}
