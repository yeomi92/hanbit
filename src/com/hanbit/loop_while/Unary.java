package com.hanbit.loop_while;
/**
@FILE  : SeriesOneToFive2.java
@DATE  : 2016. 12. 26.
@AUTHOR: Yeom Hye-Seon
@STORY :
 */
public class Unary {
	public static void main(String[] args) {
		int sum=0;
		int num=0;
		while(num<5){
			System.out.printf("num: %d",num);
			num++;  
			sum+=num;
		}
		System.out.printf("합은 %d이다.",sum);
	}
}
