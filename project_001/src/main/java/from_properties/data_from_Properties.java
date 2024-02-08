package from_properties;

import java.io.FileInputStream;

import java.util.Properties;

public class data_from_Properties {
	
	public  String getdata_from_properties(String key_name) throws Throwable {
		FileInputStream fis=new FileInputStream("src\\test\\resources\\sampleee.txt");
	    Properties po = new Properties();	
	    po.load(fis);
	   String data = po.getProperty(key_name);
	   return data;
	}

}
