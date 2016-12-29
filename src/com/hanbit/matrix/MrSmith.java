package com.hanbit.matrix;

public class MrSmith {
	public static void main(String[] args) {
		String[][]name={
				{"Good Moring","Good Afternoon","Good Evening","Good Bye"},
				{"Mr.","Mrs.","Miss"},
				{"Smith","Alex","Johnson"}};
		String people="";
		people=name[0][0];
		people+=name[1][0];
		people+=name[2][1];
		System.out.printf("Hello, %s",people);
	}
}
