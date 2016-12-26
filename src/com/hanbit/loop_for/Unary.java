package com.hanbit.loop_for;
/**
@FILE  : Unary.java
@DATE  : 2016. 12. 26.
@AUTHOR: Yeom Hye-Seon
@STORY :
 */
public class Unary {
	public static void main(String[] args) {
		int sum=0;
		for(int num=0;num<5;num++){ //for(init;limit;step)
			System.out.println("num:"+num);
			sum+=num;
		}
		System.out.println("합은 "+sum+"이다.");
	}
}
