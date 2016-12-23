package com.hanbit.basic;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		//Variable Declaration
		Scanner scanner = new Scanner(System.in); //reference type
		int price=0, count=0, total=0, rate=0, dc=0; //primitive type
		//Value Assignment
		System.out.println("얼마에요?");
		price = scanner.nextInt();
		System.out.println(price+"원 입니다.");
		System.out.println("몇 개 드릴까요?");
		count = scanner.nextInt();
		System.out.println(count+"개 주세요.");
		total = price * count;
		System.out.println("총 금액은 "+total+"원 입니다.");
		System.out.println("비싸요, 깎아주세요.");
		System.out.println("얼마나 깎아 드릴까요?");
		rate= scanner.nextInt();
		System.out.println(rate+" % 깎아주세요!");
		//Operation
		if(rate<=10){
			dc= total-(total*rate)/100;
			System.out.println(dc+"원 입니다.");
		}else{
			System.out.println("안 남아요. 안 팝니다.");
		}
	}
}