package com.evergent.CoreJAVA.arrays;

public class DdArray4 {
	public static void main(String args[]) {
	int a[][]= new int[5][5];
	for(int i=0;i<5;i++) {
		for(int j =0;j<5;j++) {
			if(i==0 || j==0 || i==4 || j==4  ) {
				System.out.print("7");
			}
			else
			{
				System.out.print("1");
			}
		}
		System.out.println();
	}
	}

}