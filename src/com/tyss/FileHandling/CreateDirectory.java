package com.tyss.FileHandling;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		File f=new File("E:\\file\\sachin.txt");
		boolean b=f.exists();
		if(b!=true){
			boolean b1=f.mkdirs();
			if(b1==true){
				System.out.println("directory is created successful");
			}else{
				System.out.println("diewctory is failed");
			}
		}

	}

}
