package SWEA;

import java.util.*;

public class sw_1976_시각덧셈 {

	public static void main(String[] args) {
		// 7/7 17:13

		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();

		for (int a = 1; a <= in; a++) {

			int hour = 0;
			int min = 0;
			for (int i = 0; i < 2; i++) {
				hour += sc.nextInt(); // 시간 더함
				min += sc.nextInt(); // 분을 더함
			}

			if(min>=60) {
			
				hour+=min/60;//분이 60 초과한만큼  더해줌. 시간에 먼저 더해주는 것이 중 요 ! ! ! ! !
				min=min%60;
			}
			//60분  초과된걸 체크해줘야해서 분 먼저 
			if (hour > 12) {
				//12보다 크면 12로 나눈몫으로 바꿔주고 0이면 12로 
				hour = hour % 12;
				if (hour == 0) {
					hour = 12;
				}
			}

			System.out.println("#"+a +" "+ hour+ " "+ min);
		} // input
	}// main

}
