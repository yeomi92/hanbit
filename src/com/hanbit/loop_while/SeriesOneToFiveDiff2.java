package com.hanbit.loop_while;
/**
@FILE  : SeriesOneToFiveDiff2.java
@DATE  : 2016. 12. 26.
@AUTHOR: Yeom Hye-Seon
@STORY :
 */
public class SeriesOneToFiveDiff2 {
	public static void main(String[] args) {
		int sum=0;
		int num=1;
		while(num<=20){
//			System.out.println(num);
			sum+=num;
			num+=2;
		}
		System.out.printf("합은 %s이다.",sum);
	}
}
