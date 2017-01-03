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
        int[][] arr = new int[col][row];
        start=3; //열의 시작 위치
        end=3; //열의 끝 위치
        for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[i].length;j++){
        	 arr[i][j]=(j>=start-1&&j<=end-1)?++val:0;
        	 if(i<2&&j==arr[i].length-1){
    			 start--;
    			 end++;
    		 }else if(i>1&&j==arr[i].length-1){
    			 start++;
    			 end--;
    		 }
          System.out.printf("%2d\t",arr[i][j]);
         }
         // 123456
         System.out.println("");
        }
    }
}
