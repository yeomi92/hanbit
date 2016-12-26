package com.hanbit.loop_for;
/**
@FILE  : Series1To10.java
@DATE  : 2016. 12. 26.
@AUTHOR: Yeom Hye-Seon
@STORY :
 */
public class Series1To10 {
	public static void main(String[] args) {
		int sum=0;
		for(int num=1;num<11;num++){
			System.out.println("num:"+num);
			sum+=num;
		}
		System.out.println("sum:"+sum);
	}
}
