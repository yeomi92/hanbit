package com.hanbit.loop_for;

import java.util.Scanner;

public class InputGugudan {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int dan=0;
		while(true){
		System.out.println("출력할 단을 입력하세요");
		dan=s.nextInt();
		/*if(dan<0){
			System.out.println("다시입력하세요");
			continue;
		}*/
		/*for(int i=1;i<10;i++){
			if(dan<0){
				System.out.println("다시입력하세요");
				break;
			}
			System.out.println(dan+"*"+i+"="+(dan*i));
		}*/
		if(dan<0){
			System.out.println("다시입력하세요");
		}else{
			for(int i=1;i<10;i++){
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
		}
		}
	}
}
