package Greedy;

import java.util.*;

public class pr2_구명보트 {
	// 5/29 01:40-02:40


	public static int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);

		boolean chk[] = new boolean[people.length];

		for (int i = 0; i < people.length / 2 + 1; i++) {
			for (int j = people.length - 1; j >= 0; j--) {

				if (!chk[i] && !chk[j] && people[i] + people[j] <= limit) {
					chk[i] = true;
					chk[j] = true;
					answer++;
				} else if (!chk[i] && !chk[j] && people[i] + people[j] > limit) {
					chk[j] = true;
					answer++;

				}

			}
		}

		return answer;
	}
	//효율성 123 제외하고 다 맞긴 함..
	

	public static void main(String[] args) {
		int a[] = { 70, 50, 80, 50 };
		int aa[] = { 40, 40, 40 };

		solution(a, 100);

	}

}
