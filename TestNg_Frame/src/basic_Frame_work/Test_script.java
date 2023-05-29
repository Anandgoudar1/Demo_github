package basic_Frame_work;

import org.testng.annotations.Test;

public class Test_script extends Generic_script_Facebook{
@Test
public void validlogin() throws InterruptedException
{
	Pom p=new Pom(driver);
	p.usname("anandgoudar679@gmail.com");
	Thread.sleep(2000);
	p.pwd("Anand@123");
	Thread.sleep(2000);
	p.loginbtn();
}
}
