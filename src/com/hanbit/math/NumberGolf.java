package com.hanbit.math;

import java.util.Scanner;

/**
@FILE  : NumberGolf.java
@DATE  : 2016. 12. 27.
@AUTHOR: Yeom Hye-Seon
@STORY : �ִ�Ƚ���� ���ߴ� ����� �¸��ϴ� ����
 -1 stop
 You can Enter Integer 1~100
 */
public class NumberGolf {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int target=(int)(Math.random()*100+1), bet=0, count=0;
		System.out.printf("%d\n",target);
		while(true){
			count++;
			System.out.printf("Enter Integer(1~100): ");
			bet=s.nextInt();
			if(target==bet){
				System.out.printf("%dȸ���� �����Դϴ�.\n",count);
				return;
			}else{
				System.out.println((target>bet)?"�� ū �� �Դϴ�.":"�� ���� �� �Դϴ�.");
			}
		}
	}
}
