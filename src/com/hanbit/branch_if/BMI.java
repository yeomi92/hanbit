package com.hanbit.branch_if;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		double height = 0, weight = 0, bmi = 0;
		int age = 0;
		Scanner s = new Scanner(System.in);
		String result = "";

		System.out.print("����: ");
		age = s.nextInt();
		if (age <= 1) {
			System.out.println("BMI ����ġ ������ 2�� �̻���� �����˴ϴ�.");
			System.out.println("��Ȯ�� ��ġ�� �Է����ּ���.");
			return; // exit, ���α׷� ����
		}

		System.out.print("����: ");
		height = (s.nextDouble()) / 100;
		System.out.print("������: ");
		weight = s.nextDouble();
		bmi = weight / (height * height);

		if (bmi > 30.0) {
			result = "����";
		} else if (bmi > 25.0) {
			result = "��";
		} else if (bmi > 23.0) {
			result = "��ü��";
		} else if (bmi > 18.5) {
			result = "����";
		} else {
			result = "��ü��";
		}
		System.out.printf("BMI ����: %f\n",bmi);
		System.out.println(result);
	}
}
