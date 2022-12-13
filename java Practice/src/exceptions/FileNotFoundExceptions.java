package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 
      FileReader fileReader = new FileReader("Test.txt");
      
   
      BufferedReader bufferReader = new BufferedReader(fileReader);  
 
      String fileData = null;  
   
      while ((fileData = bufferReader.readLine()) != null)   
      {  
          System.out.println(fileData);  
      }  

      try {  
         bufferReader.close();  
     } catch (IOException e) {  
         e.printStackTrace();                              //java.io.FileNotFoundException: Test.txt (The system cannot find the file specified)
     }  

	}

}
