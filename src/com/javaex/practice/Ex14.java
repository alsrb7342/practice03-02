package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			System.out.print(i + "+");
			sum += i;
			
		}
		System.out.println("");
		System.out.println("�հ�: " + sum);
		
		
		sc.close();
	}

}
