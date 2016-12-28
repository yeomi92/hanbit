package com.hanbit.matrix;
import java.util.Scanner;
/**
@FILE  : ArrayDemo.java
@DATE  : 2016. 12. 28.
@AUTHOR: Yeom Hye-Seon
@STORY : 입력받은 5개 숫자 더한 값 구하기
 */
public class ArrayDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("덧셈하려는 숫자를 입력하세요. 단, 5개까지만 가능");
		int[]arr=new int[5];
		int sum=0, i=0;
		String str="";
		for(i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
			sum+=arr[i];
			str+=(i==(arr.length-1))?arr[i]+"= ":arr[i]+"+";
		}
		System.out.printf("%s",str+sum);
	}
}
