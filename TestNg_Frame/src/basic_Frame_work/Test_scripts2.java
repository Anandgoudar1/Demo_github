package basic_Frame_work;

import org.testng.annotations.Test;

public class Test_scripts2 extends Generic_Script1{
	@Test
	public void validlogin1() throws InterruptedException
	{
		Pom1 p1=new Pom1(driver);
		p1.emaildata("anandgoudar679@gmail.com");
		Thread.sleep(2000);
		p1.pwddata("Anand@123");
		Thread.sleep(2000);
		p1.loginbtn();
	}
}