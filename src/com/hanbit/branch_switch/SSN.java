package com.hanbit.branch_switch;
import java.util.Scanner;

public class SSN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String gender = "", ssn = "";
		char ch = 0;
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���.");
		ssn = s.next();
		ch = ssn.charAt(7);
		switch(ch){
		case '1':case '3':
			gender = "����";
			break;
		case '2':case '4':
			gender = "����";
			break;
		case '5':case '6':
			gender = "�ܱ���";
			break;
		default:
			System.out.println("�߸��� ���� �Է��߽��ϴ�.");
		}
		System.out.println(gender + "�Դϴ�.");
	}
}
