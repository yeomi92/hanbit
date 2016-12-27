package com.hanbit.series;
import java.util.Scanner;
/**
@FILE  : Fibonacci2.java
@DATE  : 2016. 12. 26.
@AUTHOR: Yeom Hye-Seon
@STORY : 피보나치 수열(내가 풀이한 방법)
 */
public class Fibonacci2{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=1, b=1, c=2, sum=2;
		int num=0;
		System.out.println("num:");
		num=s.nextInt();
		for(int i=0;i<(num/3);i++){
			c=a+b;
			a=b+c;
			b=c+a;
			sum+=c+a+b;
		}
		if((num-2)%3==1){
			sum-=(a+b);
		}else if((num-2)%3==2){
			sum-=b;
		}else{
			sum=sum;
		}
		System.out.println(sum);
	}
}
