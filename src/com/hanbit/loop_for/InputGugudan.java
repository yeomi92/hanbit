package com.hanbit.loop_for;

import java.util.Scanner;

public class InputGugudan {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int dan=0;
		while(true){
		System.out.println("����� ���� �Է��ϼ���");
		dan=s.nextInt();
		/*if(dan<0){
			System.out.println("�ٽ��Է��ϼ���");
			continue;
		}*/
		/*for(int i=1;i<10;i++){
			if(dan<0){
				System.out.println("�ٽ��Է��ϼ���");
				break;
			}
			System.out.println(dan+"*"+i+"="+(dan*i));
		}*/
		if(dan<0){
			System.out.println("�ٽ��Է��ϼ���");
		}else{
			for(int i=1;i<10;i++){
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
		}
		}
	}
}
