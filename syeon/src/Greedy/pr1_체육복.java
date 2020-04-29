package Greedy;

import java.util.*;

public class pr1_체육복 {

	// 4/24 01:34 & 17:06

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length; // 체육복 안잃어버린 애들 수

		ArrayList<Integer> lo = new ArrayList<>();
		ArrayList<Integer> re = new ArrayList<>();

		for (int i = 0; i < lost.length; i++) {
			lo.add(lost[i]);
		}
		for (int i = 0; i < reserve.length; i++) {
			re.add(reserve[i]);
		}

		for (int i = 0; i < lo.size(); i++) {
			for (int j = 0; j < re.size(); j++) {
				if (lo.get(i) == re.get(j)) {
					answer++;
					lo.remove(i);
					re.remove(j);
				}
			}
		}

		// 잃어버린애가 여분이 있을 경우 제거해 줌

		for (int i = 0; i < lo.size(); i++) {

			int los = lo.get(i);
			System.out.println(los);
			for (int j = 0; j < re.size(); j++) {
				int res = re.get(j);
				System.out.println(res);
				if (res - 1 > 0 && res + 1 <= n && los == res - 1 || los == res + 1) {
					answer++;
					lo.remove(i);
					re.remove(j);
					i = -1;
					j = -1;
				}

			}
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {

		int lost1[] = { 2, 4 };
		int re1[] = { 1, 3, 5 };
		solution(5, lost1, re1);

	}

}
