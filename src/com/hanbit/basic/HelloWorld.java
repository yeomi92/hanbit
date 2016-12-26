package com.hanbit.basic;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("누구세요?");
		System.out.printf("내 이름은 %s입니다.",scanner.next());
	}
}
