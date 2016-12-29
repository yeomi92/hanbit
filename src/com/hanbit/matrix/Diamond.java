package com.hanbit.matrix;
/**
@FILE  : Diamond.java
@DATE  : 2016. 12. 29.
@AUTHOR: Yeom Hye-Seon
@STORY :
0    0    1    0    0   
0    2    3    4    0   
5    6    7    8    9   
0   10   11   12    0   
0    0   13    0    0
**/
public class Diamond {
	public static void main(String[] args) {
        int len=5, col= len, row= len, val=0, start=0, end=0; //배열에 저장할 변수
        int[][] arr = new int[ col][ row];
        start=3; //열의 시작 위치
        end=3; //열의 끝 위치
        for(col=0;col<arr.length;col++){
        	for(row=0;row<arr[col].length;row++){
        		arr[col][row]=0;
        		if(){
        			arr[col][row]=(val+=1);
        		}
        		System.out.print(arr[col][row]);
        	}
        	System.out.println("");
        }
    }
}
