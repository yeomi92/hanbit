package com.hanbit.branch_if;
import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int firstNum=0, secondNum=0, result=0;;
		String opcode="";
		System.out.println("=== Calculator ===");
		System.out.print("First Number:");
		firstNum=s.nextInt();		
		System.out.print("Opcode:");
		opcode=s.next();
		System.out.print("Second Number:");
		secondNum=s.nextInt();
		if(opcode.equals("+")){
			result=firstNum+secondNum;
		}else if(opcode.equals("-")){
			result=firstNum-secondNum;
		}else if(opcode.equals("*")){
			result=firstNum*secondNum;
		}else if(opcode.equals("/")){
			result=firstNum/secondNum;
		}else if(opcode.equals("%")){
			result=firstNum%secondNum;
		}else{
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		System.out.print("Result: "+result);
	}
}