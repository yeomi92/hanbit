package com.hanbit.loop_while;
import java.util.Scanner;
/**
@FILE  : ReportCard.java
@DATE  : 2016. 12. 26.
@AUTHOR: Yeom Hye-Seon
@STORY :
 */
public class ReportCard {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "";
		int score = 0, total = 0, average = 0, subjectNum=0;
		char grade = 0;
		//System.out.println("If you want to stop, Type -1");
		System.out.printf("Name:");
		name = s.next();
		while(subjectNum<6){
		subjectNum++;
		System.out.printf("Score:");
		score = s.nextInt();
		total+=score;
		}
		average = total / subjectNum;
		if(average >=90){
			grade = 'A';
		}else if(average >=80){
			grade = 'B';
		}else if(average >=70){
			grade = 'C';
		} else{
			grade = 'D';
		}
		System.out.printf("Name: %s\n",name);
		System.out.printf("The Number of Subject: %d\n",subjectNum);
		System.out.printf("Total: %d\n",total);
		System.out.printf("Average: %d\n",average);
		System.out.printf("Grade: %c",grade);
	}
}