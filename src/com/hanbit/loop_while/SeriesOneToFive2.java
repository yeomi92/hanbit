package com.hanbit.loop_while;
/**
@FILE  : SeriesOneToFive2.java
@DATE  : 2016. 12. 26.
@AUTHOR: Yeom Hye-Seon
@STORY :
 */
public class SeriesOneToFive2 {
	public static void main(String[] args) {
		int sum=0;
		int num=1;
		while(num<=5){
			sum+=num;
			num++;  
		}
		System.out.printf("합은 %s이다.",sum);
	}
}
