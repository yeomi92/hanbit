package com.hanbit.branch_if;

import java.util.Scanner;

/*
To.개발자님께
초단위로 알려주는 시험이 있는데
이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 
만들어 줄 수 있을까요?
그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.
*/
public class TimeCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sec = 0;
		int h = 0, m = 0, s = 0;
		System.out.println("초를 시간과 분으로 바꾸어주는 프로그램입니다.");
		System.out.println("초를 입력해주세요.");
		sec = scanner.nextInt();

		if (sec >= 3600) {
			h = sec / 3600;
			sec = sec % 3600;
			if (sec >= 60) {
				m = sec / 60;
				sec = sec % 60;
				s = sec;
				System.out.printf("%d시간 %d분 %d초",h,m,s);
			}else{
				s= sec;
				System.out.printf("%d시간 %d초",h,s);
			}
		} else if (sec >= 60) {
			m = sec / 60;
			sec = sec % 60;
			s = sec;
			System.out.printf("%d분 %d초",m,s);
		} else {
			System.out.printf("%d초",s);
		}

		// 나머지를 완성하세요
		// 여기에서 추가로 필요한 문법은
		// 나눗셈 기호에서 / 는 몫을 % 는 나머지를 구합니다.
		// 예를들어 63/6 = 10 이고 63%6 = 3 입니다.
	}
}
