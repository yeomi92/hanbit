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
		int i=0,x=0,equal=0;
		int[]balls=new int[6];
		String ballsStr="";
		for(;i<balls.length;i++){
			balls[i]=(int)(Math.random()*45+1);
			for(x=i;x>1;x--){
				if(balls[x]==balls[x-1]){
					i--;
					equal=1;
				}
			}
			if(equal==0){
				ballsStr+=(i==balls.length-1)?+balls[i]:+balls[i]+",";
			}
		}
		System.out.printf("[%s]",ballsStr);
	}
	
}
