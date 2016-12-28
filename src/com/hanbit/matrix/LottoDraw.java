package com.hanbit.matrix;
/**
@FILE  : LottoDraw.java
@DATE  : 2016. 12. 27.
@AUTHOR: Yeom Hye-Seon
@STORY : �ζǺ� ��÷
1~45���� ��������
�������� �� 6��
�̹� ��÷�� ���ڴ� ����.
����� []
 */
public class LottoDraw {
	public static void main(String[] args) {
		int lottoNum = 0, count=0;
		int ball1=0,ball2=0,ball3=0,ball4=0,ball5=0,ball6=0;
		while(count<6){
			lottoNum = (int)(Math.random()*45+1);
			count++;
			switch(count){
			case 1:
				ball1=lottoNum;
				break;
			case 2:
				/*if(lottoNum==ball1){
					count--;
				}*/
				ball2=lottoNum;
				count=(lottoNum==ball1)?count--:count;
				break;
			case 3:
				/*if(lottoNum==ball2||lottoNum==ball1){
					count--;
				}*/
				ball3=lottoNum;
				count=(lottoNum==ball2||lottoNum==ball1)?count--:count;
				break;
			case 4:
				/*if(lottoNum==ball3||lottoNum==ball2||lottoNum==ball1){
					count--;
				}*/
				ball4=lottoNum;
				count=(lottoNum==ball3||lottoNum==ball2||lottoNum==ball1)?count--:count;
				break;
			case 5:
				/*if(lottoNum==ball4||lottoNum==ball3||lottoNum==ball2||lottoNum==ball1){
					count--;
				}*/
				ball5=lottoNum;
				count=(lottoNum==ball4||lottoNum==ball3||lottoNum==ball2||lottoNum==ball1)?count--:count;
				break;
			case 6:
				/*if(lottoNum==ball5||lottoNum==ball4||lottoNum==ball3||lottoNum==ball2||lottoNum==ball1){
					count--;
				}*/
				ball6=lottoNum;
				count=(lottoNum==ball5||lottoNum==ball4||lottoNum==ball3||lottoNum==ball2||lottoNum==ball1)?count--:count;
				break;
			}
		}
		System.out.printf("[%d %d %d %d %d %d]",ball1,ball2,ball3,ball4,ball5,ball6);
	}
	
}
