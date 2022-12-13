import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class HashMap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties p=new Properties();
		FileInputStream fs=new FileInputStream("C:\\Users\\Tringapps\\eclipse-workspace\\java Practice\\src\\demo.properties");
		p.load(fs);
		System.out.println(p);
		
		System.out.println(p.getProperty("Vishal"));
		
		p.setProperty("Vishal","100");
		
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\Tringapps\\\\eclipse-workspace\\\\java Practice\\\\src\\\\demo.properties");
		p.store(fos, "Updated student marks");
		System.out.println(p);
		
		                         //refer demo.properties in stack implementation package
	
		


	}

}
