package com.hanbit.basic;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		//Variable Declaration
		Scanner scanner = new Scanner(System.in); //reference type
		int price=0, count=0, total=0, rate=0, dc=0; //primitive type
		//Value Assignment
		System.out.println("�󸶿���?");
		price = scanner.nextInt();
		System.out.println(price+"�� �Դϴ�.");
		System.out.println("�� �� �帱���?");
		count = scanner.nextInt();
		System.out.println(count+"�� �ּ���.");
		total = price * count;
		System.out.println("�� �ݾ��� "+total+"�� �Դϴ�.");
		System.out.println("��ο�, ����ּ���.");
		System.out.println("�󸶳� ��� �帱���?");
		rate= scanner.nextInt();
		System.out.println(rate+" % ����ּ���!");
		//Operation
		if(rate<=10){
			dc= total-(total*rate)/100;
			System.out.println(dc+"�� �Դϴ�.");
		}else{
			System.out.println("�� ���ƿ�. �� �˴ϴ�.");
		}
	}
}