package com.tyss.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Properties;

public class PropertieDemo {

	public static void main(String[] args) throws Exception {
		
		File f=new File("E:\\file\\db1.txt");
		
	//	FileWriter f2=new FileWriter("E:\\file\\db1.txt");

		FileReader f21=new FileReader("E:\\file\\db1.txt");
		
		Properties p=new Properties();
		p.load(f21);
		
		p.setProperty("user", "oracel");
		p.setProperty("password", "system");
		p.setProperty("age", "hunderd");
		p.setProperty("test", "yantra");
	//p.store(f21, "hdhd");
		
		
		
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
		

	} 

}
