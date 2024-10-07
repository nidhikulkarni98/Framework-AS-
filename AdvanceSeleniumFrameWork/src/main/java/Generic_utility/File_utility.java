package Generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * this method is used to read property file
 */

public class File_utility {
	
	public String getKeyandValuePair(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(ipathConstant.FilePath);
		Properties pro = new Properties();
		pro.load(fis);
		String KEY = pro.getProperty(key);
		return KEY;
		
	}
	

}
