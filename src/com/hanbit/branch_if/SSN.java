package com.hanbit.branch_if;

import java.util.Scanner;

public class SSN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String gender = "", ssn = "";
		char ch = 0;

		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���.");
		ssn = s.next();
		ch = ssn.charAt(7);
		if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			System.out.println("�ٽ� �Է��ϼ���.");
			return;
		}else if (ch == '1' || ch == '3') {
			gender = "����";
		} else if (ch == '2' || ch == '4') {
			gender = "����";
		} else if (ch == '5' || ch == '6') {
			gender = "�ܱ���";
		}else{
			System.out.println("�ٽ� �Է��ϼ���.");
		}
		
		System.out.println(gender + "�Դϴ�.");
	}
}
