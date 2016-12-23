package com.hanbit.loop_while;
import java.util.Scanner;
/**
@FILE  : ReportCard.java
@DATE  : 2016. 12. 23.
@AUTHOR: Yeom Hye-Seon
@STORY :
 */
public class ReportCard {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "";
		int score = 0, total = 0, average = 0, subjectNum=0;
		char grade = 0;
		System.out.println("If you want to stop, Type -1");
		System.out.print("Name:");
		name = s.next();
		while(true){
		System.out.print("Score:");
		score = s.nextInt();
		if(score==-1){
			break;
		}
		total=total+score;
		subjectNum++;
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
		System.out.println("Name:" + name);
		System.out.println("The Number of Subject:"+subjectNum);
		System.out.println("Total:" + total);
		System.out.println("Average:" + average);
		System.out.println("Grade: " + grade);
	}
}