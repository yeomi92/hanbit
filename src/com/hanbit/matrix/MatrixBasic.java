package com.hanbit.matrix;

public class MatrixBasic {
	public static void main(String[] args) {
		int[][]mtx=new int[5][5];
		for(int i=0;i<mtx.length;i++){ //mtx.length�� mtx �� ����
			for(int j=0;j<mtx[i].length;j++){ //mtx[i].length�� mtx �� ����
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println("");
		}
	}
}
