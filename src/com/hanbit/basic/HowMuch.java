package com.hanbit.basic;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		//Variable Declaration
		Scanner scanner = new Scanner(System.in); //reference type
		int price=0, count=0, total=0, rate=0, dc=0; //primitive type
		//Value Assignment
		System.out.printf("얼마에요?");
		price = scanner.nextInt();
		System.out.printf("%d원 입니다.\n",price);
		System.out.printf("몇 개 드릴까요?");
		count = scanner.nextInt();
		System.out.printf("%d개 주세요.\n",count);
		total = price * count;
		System.out.printf("총 금액은 %d원입니다.\n",total);
		System.out.printf("비싸요, 깎아주세요.\n");
		System.out.printf("얼마나 깎아 드릴까요?");
		rate= scanner.nextInt();
		System.out.printf("%d%깎아주세요!\n",rate);
		//Operation
		if(rate<=10){
			dc= total-(total*rate)/100;
			System.out.printf("%d원 입니다.",dc);
		}else{
			System.out.printf("안 남아요. 안 팝니다.");
		}
	}
}