package com.hanbit.branch_if;

import java.util.Scanner;

public class WhatisBigNumAmong3Numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("A 값을 입력하세요.");
		int a = scan.nextInt();
		System.out.println("B 값을 입력하세요");
		int b = scan.nextInt();
		System.out.println("C 값을 입력하세요");
		int c = scan.nextInt();
		int n1 = 0, n2 = 0, n3 = 0;	
		if(a>b&&a>c){
			n1=a;
			if(b>c){
				n2=b;
				n3=c;
			}else{
				n2=c;
				n3=b;
			}
		}else if(b>a&&b>c){
			n1=b;
			if(a>c){
				n2=a;
				n3=c;
			}else{
				n2=c;
				n3=a;
			}
		}else{
			n1=c;
			if(a>b){
				n2=a;
				n3=b;
			}else{
				n2=b;
				n3=a;
			}
		}	
		System.out.println("큰 값부터 작은 값 순으로 나열: " + n1+" "+n2+" "+n3);
	}
}
