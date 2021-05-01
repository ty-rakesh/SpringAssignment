package com.tyss.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File f1=new File("E:\\file\\sachin.txt");
		boolean b=f1.exists();
		if(b!=true){
			
			try {
				b = f1.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(b!=true){
				try{
					boolean b1=f1.createNewFile();
				 if(b1==true){
					 System.out.println("file created successful");
				 }else{
					 System.out.println("file creation failed");
				 }
				}
				catch(IOException e){
					e.printStackTrace();
				}
				
			}
		}else{
			System.out.println("file created successfully");
		}

	}

}
