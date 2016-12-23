package com.hanbit.basic;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("누구세요?");
		System.out.println("내 이름은 "+scanner.next()+"입니다.");
	}
}
