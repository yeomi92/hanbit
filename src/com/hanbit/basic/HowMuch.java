package com.hanbit.basic;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		//Variable Declaration
		Scanner scanner = new Scanner(System.in); //reference type
		int price=0, count=0, total=0, rate=0, dc=0; //primitive type
		//Value Assignment
		System.out.printf("�󸶿���?");
		price = scanner.nextInt();
		System.out.printf("%d�� �Դϴ�.\n",price);
		System.out.printf("�� �� �帱���?");
		count = scanner.nextInt();
		System.out.printf("%d�� �ּ���.\n",count);
		total = price * count;
		System.out.printf("�� �ݾ��� %d���Դϴ�.\n",total);
		System.out.printf("��ο�, ����ּ���.\n");
		System.out.printf("�󸶳� ��� �帱���?");
		rate= scanner.nextInt();
		System.out.printf("%d%����ּ���!\n",rate);
		//Operation
		if(rate<=10){
			dc= total-(total*rate)/100;
			System.out.printf("%d�� �Դϴ�.",dc);
		}else{
			System.out.printf("�� ���ƿ�. �� �˴ϴ�.");
		}
	}
}