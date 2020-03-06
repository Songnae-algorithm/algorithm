package BOJ;

import java.util.*;

public class boj_14501_퇴사 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();// day.입력 수

		int time[] = new int[s + 1];
		int pay[] = new int[s + 1];
		// boolean chk[] = new boolean[s + 1];

		for (int i = 1; i <= s; i++) {
			time[i] = sc.nextInt();
			pay[i] = sc.nextInt();

			if (time[i] + i > s) { // 입력한 날짜 범위초과하면 못가게
				// chk[i] = true;
				pay[i] = 0;
			}
			System.out.println(time[i] + " " + pay[i]);

		}
		int answer = 0;

		int index = time[1] + 1; // 1

		for (int i = 2; i < s; i++) {// 초깃값 정했음
			if (time[i] + i <= index) {
				if (pay[i] > pay[1]) {
					index = i;
					answer += pay[i];
					index = i + time[i];// 다음 인덱스값 지정
				} else {
					answer += pay[1];
					index = 1 + time[1];//
					break;

				}

			}
		}
		while (true) {
			if (pay[index + time[index]] != 0) {
				index = time[index + time[index]];
				answer += pay[index];
			} else {
				int a = 0;
				for (int i = index; i < s + 1; i++) {

					if (a < pay[i]) {
						a = pay[i];
					}

				}
				answer += a;
			}
		}

		
	}

}
