package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
 @Test(priority = 1)
 public void data1()
 {
	 Reporter.log("1",true);
 }
 @Test
 public void data2()
 {
	 Reporter.log("2",true);
 }
 @Test
 public void data3()
 {
	 Reporter.log("3",true);
 }
 @Test
 public void data4()
 {
	 Reporter.log("4",true);
 }
 @Test
 public void data5()
 {
	 Reporter.log("5",true);
 }
 @Test
 public void data6()
 {
	 Reporter.log("6",true);
 }
}
