package com.hanbit.loop_for;
/**
@FILE  : Fibonacci.java
@DATE  : 2016. 12. 26.
@AUTHOR: Yeom Hye-Seon
@STORY :
 */
public class Fibonacci {
	public static void main(String[] args) {
		//1, 1, 2, 3, 5, 8, 13, 21, 34, 55ÀÇ ÇÕ
		int a=1, b=1, c=2, sum=2;
		for(int i=3;i<6;i++){
			c=a+b;
			a=b+c;
			b=c+a;
			System.out.println(c+" "+a+" "+b);
			sum+=a+b+c;
		}
		System.out.println(sum-b);
	}
}
