package com.hanbit.math;

import java.util.Scanner;

/**
@FILE  : NumberGolf.java
@DATE  : 2016. 12. 27.
@AUTHOR: Yeom Hye-Seon
@STORY : 최단횟수로 맞추는 사람이 승리하는 게임
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
				System.out.printf("%d회만에 정답입니다.\n",count);
				return;
			}else{
				System.out.println((target>bet)?"더 큰 수 입니다.":"더 작은 수 입니다.");
			}
		}
	}
}
