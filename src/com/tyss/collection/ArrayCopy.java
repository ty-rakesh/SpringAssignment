package com.tyss.collection;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] a={100,200,300,400,500,600,700,800,900,0001};
		int[] b=new int[10];
//       
//		for (int i = 0; i < a.length; i++) {
//           b[i]=a[i];			
//		}
//		
		System.arraycopy(a, 2, b, 3, 5);
	//	System.arraycopy(src, srcPos, dest, destPos, length);
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			
		}
	}

	
	
}
