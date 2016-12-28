package com.hanbit.math;
import java.util.Scanner;
/**
@FILE  : Euclid.java
@DATE  : 2016. 12. 27.
@AUTHOR: Yeom Hye-Seon
@STORY :�ٸ� ���� 15�� 12�� �ִ�����/�ּҰ���� ���ϴ� ���̴�.
            �� �� �� ū ���� �����Ͽ� ū ���� ���� ���� ������.
            15/12 -> mok 1 nmg 3
             nmg �� 0 �� �ƴϹǷ� ���� ���� ū ���� �ϰ�,
             nmg �� ���� ���� �Ͽ� �ٽ� ������.
            12/3 -> mok 4 nmg 0
             nmg �� 0 �̹Ƿ� �̶� ���� ���� 3�� �ִ����� �̴�.
            ������ �μ��� ���� �� �ִ������� ������ �ּҰ������ ���Ѵ�.
            3 ->  �ִ�����
            (12*15)/3 = 60 -> �ּҰ����
 */
public class Euclid {
	public static void main(String[] args) {
        int a, b, big, small=0, nmg=0, gcd=0, lcm=0;
             System. out.println( "�ִ�����, �ּҰ������ ���ϴ� �� �� �Է� ");
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
             System.out.printf("�ִ�����: %d �ּҰ����: %d",gcd,lcm);
       }
}
