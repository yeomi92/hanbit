package com.hanbit.branch_if;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "";
		int koeanScore = 0, englishScore = 0, mathScore = 0, total = 0, average = 0;
		char grade = 0;
		System.out.print("Name:");
		name = s.next();
		System.out.print("Korean Score:");
		koeanScore = s.nextInt();
		System.out.print("English Score:");
		englishScore = s.nextInt();
		System.out.print("Math Score:");
		mathScore = s.nextInt();
		total = koeanScore + englishScore + mathScore;		
		average = total / 3;
		
		if(average >=90){
			grade = 'A';
		}else if(average >=80){
			grade = 'B';
		}else if(average >=70){
			grade = 'C';
		} else{
			grade = 'D';
		}
		
		System.out.println("Name:" + name);
		System.out.println("Total:" + total);
		System.out.println("Average:" + average);
		System.out.println("Grade: " + grade);
	}
}