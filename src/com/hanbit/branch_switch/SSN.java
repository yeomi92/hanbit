package com.hanbit.branch_switch;
import java.util.Scanner;

public class SSN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String gender = "", ssn = "";
		char ch = 0;
		System.out.println("주민등록번호를 입력하세요.");
		ssn = s.next();
		ch = ssn.charAt(7);
		switch(ch){
		case '1':case '3':
			gender = "남자";
			break;
		case '2':case '4':
			gender = "여자";
			break;
		case '5':case '6':
			gender = "외국인";
			break;
		default:
			System.out.println("잘못된 값을 입력했습니다.");
		}
		System.out.println(gender + "입니다.");
	}
}
