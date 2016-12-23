package com.hanbit.branch_switch;
import java.util.Scanner;
/**
@FILE  : ShowMonth.java
@DATE  : 2016. 12. 23.
@AUTHOR: Yeom Hye-Seon
@STORY : 
 */
public class ShowMonth {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year=0, month=0, day=0;
		System.out.println("Year:");
		year=s.nextInt();
		System.out.println("Month:");
		month=s.nextInt();
		switch(month){
		case 1:case 3:case 5:case 7:case 8:case 10: case 12:
			day=31;
			break;
		case 4:case 6:case 9:case 11:
			day=30;
			break;
		case 2:
			if(year%4==0&&year%100!=0){
				day=29;
			}else if(year%4==0&&year%100==0&&year%400==0){
				day=29;
			}else{
				day=28;
			}
			/*if(year%400==0){
				day=29;
			}else if(year%100==0){
				day=28;
			}else if(year%4==0){
				day=29;
			}else{
				day=28;
			}*/
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
		System.out.println(year+"년의 "+month+"월은 "+day+"일까지 입니다.");
	}
}
