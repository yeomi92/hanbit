package com.hanbit.matrix;
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
		String name="";
		int[]arr=new int[5];
		String[]arrStr={"이름","국어","영어","수학","사회","과학","평균","학점"};
		String subjectStr="",scoreStr="";
		int score=0,total=0,average=0,i=0;
		char grade=0;
		System.out.printf("Name:");
		name=s.next();
		for(i=0;i<arrStr.length;i++){
			subjectStr+=(i==(arrStr.length-1))?arrStr[i]:arrStr[i]+"\t";
		}
		for(i=0;i<arr.length;i++){
			System.out.printf("%s Score:",arrStr[i+1]);
			arr[i]=s.nextInt();
			total+=arr[i];
			scoreStr+=arr[i]+"\t";
		}
		average=total/arr.length;
		switch(average/10){
		case 10:case 9:
			grade='A'; break;
		case 8:
			grade='B'; break;
		case 7:
			grade='C'; break;
		default:
			grade='D'; break;
		}
		System.out.printf("============================================================\n"
				+ "%s\n"
				+ "------------------------------------------------------------\n"
				+ "%s\t%s%d\t%c\n"
				+ "============================================================\n"
				,subjectStr,name,scoreStr,average,grade);
	}
}