package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property_file {
@Test
public void data() throws FileNotFoundException, IOException
{
Properties p=new Properties();
p.load(new FileInputStream("./p.properties"));
String value = p.getProperty("name");
String anu = p.getProperty("id");
System.out.println(anu);
System.out.println(value);
}
}

