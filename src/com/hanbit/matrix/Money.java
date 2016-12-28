package com.hanbit.matrix;
import java.util.Scanner;
/**
@FILE  : Money.java
@DATE  : 2016. 12. 28.
@AUTHOR: Yeom Hye-Seon
@STORY :
	 * �ݾ��� �Է¹��� �� �츮���� ȭ���������� �ش� ������ ǥ���ϴ� ���α׷�
	 * [�䱸����] �������� �ϴ� ����κ��� ���α׷� ���߿�û�� ���Խ��ϴ�.
	 * �ݾ��� �Է¹��� �� �츮���� ȭ���������� �ش� ������ ǥ���ϴ� ���α׷��Դϴ�.
	 * �������, 125,520 ���� �Է��ϸ� ȭ�鿡 �̷��� ���̰� �ϸ� �˴ϴ�.
	 * ǥ���ϰ� 10���̸��� ����
	   ******************************************************
	      ��û�ݾ� : 126520 ��
	      5���� : 2��
	      1���� : 2��
	      5õ�� : 1��
	      1õ�� : 1��
	      5��� : 1��
	         ��� : 0��
	         ���ʿ� : 0��
	         �ʿ� : 2��
	   ********************************************************
*/
public class Money {
	      public static void main(String[] args) {
	        System. out.println( "�ݾ��� �Է��ϼ���" );
	        Scanner s=new Scanner(System. in);
	        int money=s.nextInt();
	        int[] moneyUnit={50000,10000,5000,1000,500,100,50,10};
	        int mok=0;
	        int nmg=0;
	        String won="";
	        System. out.printf("��û�ݾ� : %d��\n",money);
	        for(int i=0;i<moneyUnit.length;i++){
	        	mok=money/moneyUnit[i];
	        	nmg=money%moneyUnit[i];
	        	money=nmg;
	        	switch(i){
	        	case 0:case 1: won=moneyUnit[i]/10000+"����"; break;
	        	case 2:case 3: won=moneyUnit[i]/1000+"õ��"; break;
	        	case 4: won=moneyUnit[i]/100+"���"; break;
	        	case 5: won="���"; break;
	        	case 6: won="���ʿ�"; break;
	        	case 7: won="�ʿ�"; break;
	        	}
	        	System.out.printf("%s : %d%s\n",won,mok,(i<4)?"��":"��");
	        }
	    }
}
