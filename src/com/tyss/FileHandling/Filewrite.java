package com.tyss.FileHandling;

import java.io.FileWriter;

public class Filewrite {

	public static void main(String[] args) {
		try{
			FileWriter f=new  FileWriter("E:\\file\\sachin.txt");
			f.write("sachin ciggi.");
			f.flush();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
