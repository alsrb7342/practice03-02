package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		
		int num = sc.nextInt();
		int first = num%2;
		int sum = 0;
		
		for(int i=first; i<=num; i+=2) {
			if(i>first) {
				System.out.println(i);
				sum += i;
			}
		}
		sc.close();
		
		System.out.println(sum);
	}

}
