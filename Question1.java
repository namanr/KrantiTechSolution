package com.krantitech;

import java.util.Iterator;
import java.util.Scanner;

public class Question1 {
	
//	Problem Statement
//	Question1 - Write a program that creates a triangle of stars
//	   *
//	  ***
//	 *****
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("no of rows to be printed");
		int rows= scanner.nextInt();
		for(int i=1; i<=rows;i++) {
			for(int j=rows; j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
		
		

	}
	
	

}
