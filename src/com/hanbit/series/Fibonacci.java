package com.hanbit.series;
import java.util.Scanner;
/**
@FILE  : Fibonacci.java
@DATE  : 2016. 12. 26.
@AUTHOR: Yeom Hye-Seon
@STORY : 피보나치 수열(정답)
 */
public class Fibonacci{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=1, b=1, c=2, sum=2;
		int num=0;
		System.out.println("num:");
		num=s.nextInt();
		for(int i=3;i<=num;i++){
			c=a+b;
			a=b;
			b=c;
			sum+=c;
		}
		System.out.println(sum);
	}
}
