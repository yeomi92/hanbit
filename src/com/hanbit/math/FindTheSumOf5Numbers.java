package com.hanbit.math;
import java.util.Scanner;
/**
@FILE  : FindTheSumOf5Numbers.java
@DATE  : 2016. 12. 27.
@AUTHOR: Yeom Hye-Seon
@STORY :
 */
public class FindTheSumOf5Numbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum=0, count=0;
		while(count<5){
		System.out.println("Enter n");
		sum+=s.nextInt();
		count+=1;
		}
		System.out.println(sum);
	}
}
