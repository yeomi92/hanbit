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
if input -1 end
 */
public class FindTheSumOfMulti5 {
	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		int i=1,num=0,count=0,sum=0;
		while(true){
			i=1;
			sum=0;
			count=0;
			System.out.printf("Enter Num: ");
			num=s.nextInt();
			if(num==-1){
				System.out.println("End");
				return;
			}else if(num!=-1&&num<5){
				System.out.printf("please input again!\n\n");
				num=0;
			}else{
				while(i<=num){
					if(i%5==0){
						sum+=i;
						count++;
					}
					i++;
					if(i==(num+1)){
						System.out.printf("Integer From 1 To %d\n",num);
						System.out.printf("The Number of Multi 5: %d\n",count);
						System.out.printf("The Sum: %d\n\n",sum);
					}
				}
			}
		}*/
		Scanner s = new Scanner(System.in);
		int target=0,sum=0,count=0,i=0;
		while(true){
			System.out.printf("Enter Integer  ");
			target=s.nextInt();
			if(target<5){
				/*if(target==-1){
					System.out.println("End");
					return;
				}else{
					System.out.printf("please input again!\n\n");
					target=0;
				}*/
				//삼항연산자
				/*String result = (target==-1)?"End":"please input again!";
				System.out.printf("%s\n",result);*/
				System.out.printf((target==-1)?"End":"please input again!");
			}else{
				sum=0;
				count=0;
				for(i=1;i<=target;i++){
					if(i%5==0){
						sum+=i;
						count++;
					}
				}
				System.out.printf("Integer From 1 To %d\n"
						+ "The Number of Multi 5: %d\n"
						+ "The Sum: %d\n\n",target,count,sum);
			}
		}
	}
}
