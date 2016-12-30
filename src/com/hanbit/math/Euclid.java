package com.hanbit.math;
import java.util.Scanner;
/**
@FILE  : Euclid.java
@DATE  : 2016. 12. 27.
@AUTHOR: Yeom Hye-Seon
@STORY : 최대공약수, 최소공배수 구하기
다른 예는 15와 12의 최대공약수/최소공배수 구하는 것이다.
두 수 중 큰 수를 결정하여 큰 수를 작은 수로 나눈다.
15/12 -> mok 1 nmg 3
nmg 가 0 이 아니므로 작은 수를 큰 수로 하고,
nmg 를 작은 수로 하여 다시 나눈다.
12/3 -> mok 4 nmg 0
nmg 가 0 이므로 이때 작은 수인 3인 최대공약수 이다.
원래의 두수를 곱한 후 최대공약수로 나누어 최소공배수를 구한다.
3 ->  최대공약수
(12*15)/3 = 60 -> 최소공배수
 */
public class Euclid {
	public static void main(String[] args) {
        int a, b, big, small=0, nmg=0, gcd=0, lcm=0;
             System. out.println( "최대공약수, 최소공배수를 구하는 두 수 입력 ");
             Scanner sc = new Scanner(System. in);
              a = sc.nextInt();
              b = sc.nextInt();
              if ( a > b) {
                    big = a;
                    small = b;
             } else {
                    big = b;
                    small = a;
             }
              while(true){
            	  nmg=big%small;
            	  if(nmg==0){
            		  break;
            	  }
            	  big=small;
            	  small=nmg;
             }
             gcd=small;
             lcm=(a*b)/gcd;
             System.out.printf("최대공약수: %d 최소공배수: %d",gcd,lcm);
       }
}
