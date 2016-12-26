package com.hanbit.branch_switch;
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
		switch(opcode){
		case "+":
			result=firstNum+secondNum;
			break;
		case "-":
			result=firstNum-secondNum;
			break;
		case "*":
			result=firstNum*secondNum;
			break;
		case "/":
			result=firstNum/secondNum;
			break;
		case "%":
			result=firstNum%secondNum;
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		System.out.printf("Result: %d",result);
	}
}