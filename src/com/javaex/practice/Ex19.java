package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, won;
		
		
		while(true) {
			
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			
			System.out.print("선택>");
			num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("예금액>");
				won = sc.nextInt();
			}
			
			else if(num == 2) {
				System.out.print("출금액>");
				won = sc.nextInt();
			}
			
			else if(num == 3) {
				System.out.print("잔고액>" + "800");
				System.out.println("");
			}
			
			else if(num == 4) {
				System.out.print("프로그램 종료");
				break;
			}
			else {
				System.out.println("다시입력해주세요.");
			}
		}
		
		
		
		
		
	
	}
	


}
