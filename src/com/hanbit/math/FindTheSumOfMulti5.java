package com.hanbit.math;
import java.util.Scanner;
/**
@FILE  : FindTheSumOfMulti5.java
@DATE  : 2016. 12. 27.
@AUTHOR: Yeom Hye-Seon
@STORY : 5의 배수의 합
[결과]
Integer From 1 To [input]
The Number of Multi 5: ?
The Sum: ?
※ If Input less than 4, please input again!
 */
public class FindTheSumOfMulti5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//int i=1,num=0,count=0,sum=0;
		int num=0,count=0,sum=0;
		while(true){
			System.out.printf("Num: ");
			num=s.nextInt();
			//i=1;
			count=0;
			sum=0;
			if(num==-1){
				System.out.println("End");
				return;
			}else if(num!=-1&&num<5){
				System.out.printf("please input again!\n\n");
				num=0;
			}else{
				for(int i=0;i<=num;i++){
				//while(i<=num){
					if(i%5==0){
						sum+=i;
						count++;
					}
					//i++;
					if(i==(num+1)){
						System.out.printf("Integer From 1 To %d\n",num);
						System.out.printf("The Number of Multi 5: %d\n",count);
						System.out.printf("The Sum: %d\n\n",sum);
					}
				}
			}
		}
	}
}
