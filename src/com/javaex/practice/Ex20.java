package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = (int)(Math.random()*100);
		int num;
		String choice;
		
		System.out.println("==============================");
		System.out.println("      [���ڸ��߱���� ����]");
		System.out.println("==============================");
		
		while(true) {
			
			System.out.print(">>");
			num = sc.nextInt();
			
			if(num>result) {
				System.out.println("�� ����");
			}
			else if(num<result) {
				System.out.println("�� ����");
			}
			else if(num==result) {
				System.out.println("�¾ҽ��ϴ�.");
				System.out.print("������ �����Ͻðڽ��ϱ�? (y/n)>>");
				choice = sc.next(); 
				
				if(choice.equals("y")) {
					System.out.println("==============================");
					System.out.println("      [���ڸ��߱���� ����]");
					System.out.println("==============================");
					break;
				}
			}
		}
		sc.close();
	}

}
