package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		    System.out.print("숫자를 입력하세요: ");
		    int num = sc.nextInt();
				
			for(int i=num; i>0; i--) {
				
			for(int y=0; y<i; y++) {
			System.out.print("*");
		}
			System.out.println();
		}
			for(int y=1; y<=num-1; y++) {
				
			for(int x=0; x<y+1; x++) {
				
			System.out.print("*");
		}
			System.out.println();
		}
				
		sc.close();

	}

}
