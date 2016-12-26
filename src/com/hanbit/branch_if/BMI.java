package com.hanbit.branch_if;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		double height = 0, weight = 0, bmi = 0;
		int age = 0;
		Scanner s = new Scanner(System.in);
		String result = "";

		System.out.print("나이: ");
		age = s.nextInt();
		if (age <= 1) {
			System.out.println("BMI 참고치 정보는 2세 이상부터 제공됩니다.");
			System.out.println("정확한 수치를 입력해주세요.");
			return; // exit, 프로그램 종료
		}

		System.out.print("신장: ");
		height = (s.nextDouble()) / 100;
		System.out.print("몸무게: ");
		weight = s.nextDouble();
		bmi = weight / (height * height);

		if (bmi > 30.0) {
			result = "고도비만";
		} else if (bmi > 25.0) {
			result = "비만";
		} else if (bmi > 23.0) {
			result = "과체중";
		} else if (bmi > 18.5) {
			result = "정상";
		} else {
			result = "저체중";
		}
		System.out.printf("BMI 지수: %f\n",bmi);
		System.out.println(result);
	}
}
