package com.hanbit.matrix;
/*
[0,0][0,1][0,2][0,3][0,4]
[1,0][1,1][1,2][1,3][1,4]
[2,0][2,1][2,2][2,3][2,4]
[3,0][3,1][3,2][3,3][3,4]
[4,0][4,1][4,2][4,3][4,4]
* */
public class MatrixDiff5 {
	public static void main(String[] args) {
		int[][]mtx=new int[5][5];
		int k=0;
		for(int i=0;i<mtx.length;i++){ //mtx.length는 mtx 행 개수
			for(int j=0;j<mtx[i].length;j++){ //mtx[i].length는 mtx 열 개수
				mtx[i][j]=(k+=5);
				System.out.printf("%3d\t",mtx[i][j]);
			}
			System.out.println("");
		}
	}
}
