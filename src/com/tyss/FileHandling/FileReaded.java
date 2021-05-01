package com.tyss.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaded {

	public static void main(String[] args) {
		try {
			FileReader f2=new FileReader("E:\\file\\sachin.txt");
			Scanner read=new Scanner(f2);
			while(read.hasNext()){
				String data=read.nextLine();
				System.out.println(data);
			}
            read.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
