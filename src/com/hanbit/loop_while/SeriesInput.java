package com.hanbit.loop_while;
import java.util.Scanner;
/**
@FILE  : SeriesInput.java
@DATE  : 2016. 12. 23.
@AUTHOR: Yeom Hye-Seon
@STORY :
 */
public class SeriesInput {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num=0, sum=0;
		System.out.println("If you want to stop, Type -1");
		while(true){
			System.out.print("Type Number:");
			num=s.nextInt();
			if(num==-1){break;}
			sum=sum+num;
		}
		System.out.println(sum);
	}
}
