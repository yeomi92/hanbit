package com.hanbit.loop_while;

public class SeriesDiffChange {
	public static void main(String[] args) {
		int i=1, d=1, sum=1;
		while(true){
			i+=d;
			sum+=i;
			System.out.printf("i: %2d, d:%3d, sum: %4d\n",i,d,sum);
			d++;
			if(d==20){
			break;
			}
		}
		/*int i=0, d=1, sum=1; //i�� �ε���, d�� ����
		while(true){
			System.out.printf("i: %2d, d:%3d, sum: %4d\n",i,d,sum);
			if(i==19){
			break;
			}
			i++;
			d+=i;
			sum+=d;
		}*/
		System.out.printf("=====================================================\n"
				+"1+2+4+7+11+16+22+... �����ϴ� ������ 20��° �ױ��� ��\n"
				+"=====================================================\n"
				+"%d \n"
				+"=====================================================\n",
				sum);
	}

	}
