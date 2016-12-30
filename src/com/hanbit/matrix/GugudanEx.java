package com.hanbit.matrix;

public class GugudanEx {
	public static void main(String[] args) {
		int[][]arr=new int[9][3];
		int x=0,y=1;
		for(int i=0;i<arr.length;i++){
			x++;
			for(int j=0;j<arr[i].length;j++){
				y++;
				System.out.printf(""
						+ "%dX%d=%d\t",y,x,(y*x));
			}
			System.out.println("");
			y=1;
		}
	}
}
