package Greedy;

import java.util.*;

public class pr1_체육복 {

	// 4/24 01:34

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length; // 체육복 안잃어버린 애들 수
		boolean chk[] = new boolean[reserve.length];
		boolean lochk[] = new boolean[lost.length];

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					answer++;
					chk[j] = true;
					lochk[i] = true;
				}
			}
		}

		for (int i = 0; i < lost.length; i++) {
			int a = 0;
			if (lochk[i] == false) {
				a = lost[i];
			}
			for (int j = 0; j < reserve.length; j++) {
//				if (a - 1 > 0 && a + 1 <= n && !chk[j] && a == reserve[j]) {
//					answer++;
//					chk[j] = true;
//					break; // 내가 잃어버렸을 경우
//				}

				if (a - 1 > 0 && a + 1 <= n && !chk[j] && a - 1 == reserve[j] || a + 1 == reserve[j]) {
					answer++;
					chk[j] = true;
					break; // 한번만 더해주면 그냥 끝냄
				}

			}
		}

		return answer;
	}

	public static void main(String[] args) {

		int lost1[] = { 2, 4 };
		int re1[] = { 1, 3, 5 };
		solution(5, lost1, re1);

	}

}
