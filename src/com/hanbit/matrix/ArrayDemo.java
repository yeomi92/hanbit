package com.hanbit.matrix;
import java.util.Scanner;
/**
@FILE  : ArrayDemo.java
@DATE  : 2016. 12. 28.
@AUTHOR: Yeom Hye-Seon
@STORY : �Է¹��� 5�� ���� ���� �� ���ϱ�
 */
public class ArrayDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�����Ϸ��� ���ڸ� �Է��ϼ���. ��, 5�������� ����");
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
