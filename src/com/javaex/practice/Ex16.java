package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt, sts, sum, result;
		cnt = 0;
		sts = 0;
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			sum = i / 5;
			result = i - sum*5;
			
			if(result == 0) {
				cnt++;
				sts += i;
			}
			
		sc.close();
		
		}
		
		System.out.println("5�� ����� ����: " + cnt);
		System.out.println("5�� ����� ��: " + sts);
		
	}
}
