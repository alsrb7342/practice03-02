package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, won;
		
		
		while(true) {
			
			System.out.println("----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			
			System.out.print("����>");
			num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("���ݾ�>");
				won = sc.nextInt();
			}
			
			else if(num == 2) {
				System.out.print("��ݾ�>");
				won = sc.nextInt();
			}
			
			else if(num == 3) {
				System.out.print("�ܰ��>" + "800");
				System.out.println("");
			}
			
			else if(num == 4) {
				System.out.print("���α׷� ����");
				break;
			}
			else {
				System.out.println("�ٽ��Է����ּ���.");
			}
		}
		
		
		
		
		
	
	}
	


}
