package com.hanbit.loop_while;
/**
@FILE  : SeriesOneToFive.java
@DATE  : 2016. 12. 23.
@AUTHOR: Yeom Hye-Seon
@STORY : 1���� 5������ �� ���ϱ�(diff=1))
 */
public class SeriesOneToFive {
	public static void main(String[] args) {
		int sum=0;
		int num=1;
		while(true){
			sum=sum+num;
			if(num==5){break;}
			num=num+1;  
		}
		//sum=1+2+3+4+5;
		System.out.printf("���� %d�̴�.",sum);
	}
}
