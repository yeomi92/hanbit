package com.hanbit.branch_if;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year=0;
		String result="";
		System.out.print("�⵵�� �Է��ϼ���: ");
		year = s.nextInt();
		
		/*if(year%4==0){
			if(year%100==0){			
				if(year%400==0){
				result="����";
				}else{
					result="���";
				}
			}else{
				result="����";
			}
		}else{
			result="���";
		}
		*/
		if(year%400==0){
			result="����";
		}else if(year%100==0){
			result="���";
		}else if(year%4==0){
			result="����";
		}else{
			result="���";
		}
		System.out.println(year+"���� "+result+"�Դϴ�.");
	}
}
