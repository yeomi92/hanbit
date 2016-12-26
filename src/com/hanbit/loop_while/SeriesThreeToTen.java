package com.hanbit.loop_while;
/**
@FILE  : SeriesThreeToTen.java
@DATE  : 2016. 12. 23.
@AUTHOR: Yeom Hye-Seon
@STORY :
 */
public class SeriesThreeToTen {
	public static void main(String[] args) {
		int sum=0;
		int num=3;
		while(true){
			sum=sum+num;
			if(num==10){
				break;
			}
			num=num+1;
		}
		System.out.printf("%d",sum);
	}
}
