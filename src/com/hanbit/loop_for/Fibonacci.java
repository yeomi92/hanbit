package com.hanbit.loop_for;
import java.util.Scanner;
/**
@FILE  : Fibonacci.java
@DATE  : 2016. 12. 26.
@AUTHOR: Yeom Hye-Seon
@STORY :
 */
public class Fibonacci{
	public static void main(String[] args) {
		//1, 1, 2, 3, 5, 8, 13, 21, 34, 55ÀÇ ÇÕ
		int a=1, b=1, c=2, sum=2;
		for(int i=3;i<=10;i++){
			c=a+b;
			a=b;
			b=c;
			sum+=c;
		}
		System.out.println(sum);
	}
}
