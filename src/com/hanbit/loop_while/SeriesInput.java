package com.hanbit.loop_while;
import java.util.Scanner;
/**
@FILE  : SeriesInput.java
@DATE  : 2016. 12. 23.
@AUTHOR: Yeom Hye-Seon
@STORY : ���ڸ� �Է¹޾Ƽ� -1�� �Է��� �� ���� ��� ���Ѵ�.
 */
public class SeriesInput {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num=0, sum=0;
		System.out.printf("If you want to stop, Type -1\n");
		while(true){
			System.out.printf("Type Number:");
			num=s.nextInt();
			if(num==-1){break;}
			sum=sum+num;
		}
		System.out.printf("%d",sum);
	}
}
