package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	

    public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	
	  System.out.println("���ڸ� �Է��ϼ���.");
	
	  int num = sc.nextInt();
	  int sum = 1;
	  
	  for(int i=num; i>0; i--) {
		  sum = sum * i;
	    }
	    
	  sc.close();
	    
	  System.out.println("�����: " + sum);

}
	

}
