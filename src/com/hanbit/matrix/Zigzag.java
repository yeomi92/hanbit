package com.hanbit.matrix;
<<<<<<< HEAD
import java.util.Scanner;
=======

import java.util.Scanner;

>>>>>>> c217c0c555f429e6f7ba8009f2006f6bae36f6f6
/**
@FILE  : Zigzag.java
@DATE  : 2016. 12. 29.
@AUTHOR: Yeom Hye-Seon
@STORY : 숫자를 입력받아서 지그재그로 숫자 출력
 1   2   3   4   5
10   9   8   7   6
11  12  13  14  15
20  19  18  17  16
21  22  23  24  25
**/
public class Zigzag {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
<<<<<<< HEAD
        int length = 0; // 배열 길이
=======
        int length = 5; // 배열 길이
>>>>>>> c217c0c555f429e6f7ba8009f2006f6bae36f6f6
        System.out.print("Num: ");
        length=s.nextInt();
        System.out.printf("%d X %d\n",length,length);
        int[][] arr = new int[length][length];
        int k = 1; // 넣을 값
        int flag = 1; // 스위치변수
        int i = 0; // 행
        int j = 0; // 열
        for(i=0;i<arr.length;i++){
        	for(j=0;j<arr[i].length;j++){
        		if(i==0&&j==0){
        			arr[i][j]=1;
        		}else{
        			arr[i][j]=k+=1*((i%2==0)?flag:-flag);
        		}
        		System.out.printf("%2d ",arr[i][j]);
        	}
        	k+=(i%2==0)?length+1:length-1;
        	System.out.println("");
        }
    }
}
