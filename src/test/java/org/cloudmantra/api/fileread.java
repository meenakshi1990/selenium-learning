package org.cloudmantra.api;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;
 
public class fileread
{
    Properties configProp = new Properties();
    
   public fileread()
   {
      //Private constructor to restrict new instances
      FileInputStream in=null;
	try {
		 in = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\api\\util\\datafile.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      System.out.println("Read all properties from file");
      try {
          configProp.load(in);
      } catch (IOException e) {
          e.printStackTrace();
      }
      FileOutputStream fileOut = null;
	try {
		fileOut = new FileOutputStream("C:\\Users\\Administrator\\eclipse-workspace\\api\\util\\output.properties");
	} catch (FileNotFoundException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
		//properties.store(fileOut, "Favorite Things");
		
      
   }
   
   
}
 
   
