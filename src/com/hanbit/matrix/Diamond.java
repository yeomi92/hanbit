package com.hanbit.matrix;
import java.util.Scanner;
/**
@FILE  : Diamond.java
@DATE  : 2016. 12. 29.
@AUTHOR: Yeom Hye-Seon
@STORY : ���� �Է� �޾Ƽ� ���̾Ƹ��� ���� ���
0    0    1    0    0   
0    2    3    4    0   
5    6    7    8    9   
0   10   11   12    0   
0    0   13    0    0
**/
public class Diamond {
	public static void main(String[] args) {
        int len=0, val=0, start=0, end=0; //�迭�� ������ ����int[][] arr = new int[col][row];
        Scanner s = new Scanner(System.in);
        System.out.println("Num: ");
        len=s.nextInt();
        int col= len, row= len;
        int[][] arr = new int[col][row];
        start=len/2; //���� ���� ��ġ
        end=len/2; //���� �� ��ġ
        for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[i].length;j++){
        	 arr[i][j]=(j>=start&&j<=end)?++val:0;
        	 if(i<(len/2)&&j==arr[i].length-1){
    			 start--;
    			 end++;
    		 }else if(i>=(len/2)&&j==arr[i].length-1){
    			 start++;
    			 end--;
    		 }
          System.out.printf("%2d\t",arr[i][j]);
         }
         System.out.println("");
        }
        //daimond
    }
}
