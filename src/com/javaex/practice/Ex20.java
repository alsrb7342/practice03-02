package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = (int)(Math.random()*100);
		int num;
		String choice;
		
		System.out.println("==============================");
		System.out.println("      [숫자맞추기게임 시작]");
		System.out.println("==============================");
		
		while(true) {
			
			System.out.print(">>");
			num = sc.nextInt();
			
			if(num>result) {
				System.out.println("더 낮게");
			}
			else if(num<result) {
				System.out.println("더 높게");
			}
			else if(num==result) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까? (y/n)>>");
				choice = sc.next(); 
				
				if(choice.equals("y")) {
					System.out.println("==============================");
					System.out.println("      [숫자맞추기게임 종료]");
					System.out.println("==============================");
					break;
				}
			}
		}
		sc.close();
	}

}
