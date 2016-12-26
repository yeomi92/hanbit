package com.hanbit.branch_if;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year=0;
		String result="";
		System.out.print("년도를 입력하세요: ");
		year = s.nextInt();
		
		/*if(year%4==0){
			if(year%100==0){			
				if(year%400==0){
				result="윤년";
				}else{
					result="평년";
				}
			}else{
				result="윤년";
			}
		}else{
			result="평년";
		}
		*/
		if(year%400==0){
			result="윤년";
		}else if(year%100==0){
			result="평년";
		}else if(year%4==0){
			result="윤년";
		}else{
			result="평년";
		}
		System.out.printf("%d년은 %s입니다.",year,result);
	}
}
