package com.hanbit.matrix;
/**
@FILE  : Gugudan.java
@DATE  : 2016. 12. 29.
@AUTHOR: Yeom Hye-Seon
@STORY : 구구단 책자 만들기
 */
public class Gugudan {
	public static void main(String[] args) {
		int i=0,j=0;
			for(i=1;i<20;i++){
				for(j=2;j<6;j++){
					System.out.print((i>9)?(j+4)+"X"+(i-9)+"="+(i-9)*(j+4)+"\t":j+"X"+i+"="+i*j+"\t");
				}
				System.out.println("");
				if(i==9){
					System.out.println("");
				}
			}
	}
}
