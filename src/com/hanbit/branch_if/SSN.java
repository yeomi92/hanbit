package com.hanbit.branch_if;

import java.util.Scanner;

public class SSN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String gender = "", ssn = "";
		char ch = 0;

		System.out.println("주민등록번호를 입력하세요.");
		ssn = s.next();
		ch = ssn.charAt(7);
		if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			System.out.println("다시 입력하세요.");
			return;
		}else if (ch == '1' || ch == '3') {
			gender = "남자";
		} else if (ch == '2' || ch == '4') {
			gender = "여자";
		} else if (ch == '5' || ch == '6') {
			gender = "외국인";
		}else{
			System.out.println("다시 입력하세요.");
		}
		
		System.out.printf("%s%s",gender,"입니다.");
	}
}
