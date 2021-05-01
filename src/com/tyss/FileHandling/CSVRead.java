package com.tyss.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CSVRead {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader f2=new FileReader("E:\\file\\detail.csv");
		Scanner sc=new Scanner(f2);
		sc.useDelimiter(" , ");
		while(sc.hasNext()){
			System.out.print(sc.next());
		}
		sc.close();
	}

}
