package com.hanbit.loop_while;
import java.util.Scanner;
/**
@FILE  : SeriesInput.java
@DATE  : 2016. 12. 23.
@AUTHOR: Yeom Hye-Seon
@STORY : 숫자를 입력받아서 -1를 입력할 때 까지 계속 더한다.
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
