package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();

		for(int i=num; i>0; i--) {
			
			for(int y=0; y<i; y++) {
			System.out.print("*");
			}
			
		System.out.println();
		
		}
		
		sc.close();

	}

}