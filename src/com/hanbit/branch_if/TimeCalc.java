package com.hanbit.branch_if;

import java.util.Scanner;

/*
To.�����ڴԲ�
�ʴ����� �˷��ִ� ������ �ִµ�
�� ���� ��ð� ��� �������� ��� ����ؾ� �ؼ���.
Ȥ�� �ʰ��� �Է¹����� �ڵ����� ���Ǵ� ���α׷��� 
����� �� �� �������?
�׷��ϱ� 500�� �̸� �� ��ð� ��� ���ʶ�� �����ָ� ������.
*/
public class TimeCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sec = 0;
		int h = 0, m = 0, s = 0;
		System.out.println("�ʸ� �ð��� ������ �ٲپ��ִ� ���α׷��Դϴ�.");
		System.out.println("�ʸ� �Է����ּ���.");
		sec = scanner.nextInt();

		if (sec >= 3600) {
			h = sec / 3600;
			sec = sec % 3600;
			if (sec >= 60) {
				m = sec / 60;
				sec = sec % 60;
				s = sec;
				System.out.println(h + "�ð�" + m + "��" + s + "��");
			}else{
				s= sec;
				System.out.println(h + "�ð�"+ s + "��");
			}
		} else if (sec >= 60) {
			m = sec / 60;
			sec = sec % 60;
			s = sec;
			System.out.println(m + "��" + s + "��");
		} else {
			System.out.println(sec + "��");
		}

		// �������� �ϼ��ϼ���
		// ���⿡�� �߰��� �ʿ��� ������
		// ������ ��ȣ���� / �� ���� % �� �������� ���մϴ�.
		// ������� 63/6 = 10 �̰� 63%6 = 3 �Դϴ�.
	}
}
