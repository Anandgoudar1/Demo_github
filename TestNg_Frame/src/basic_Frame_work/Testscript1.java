package basic_Frame_work;

import org.testng.annotations.Test;

public class Testscript1 extends Generic_Script1{
	@Test
	public void validlogin() throws InterruptedException
	{
		Pom1 p=new Pom1(driver);
		p.emaildata("anandgoudar679@gmail.com");
		Thread.sleep(2000);
		p.pwddata("Anand@123");
		Thread.sleep(2000);
		p.loginbtn();
	}
}