package Prog;

import java.util.*;

public class pr3_야근지수 {

	public static long solution(int n, int[] works) {

		int sum = 0;
		for (int i = 0; i < works.length; i++) {

			sum += works[i];
		}
		if (sum <= n) {
			return 0;
		}

		long answer = 0;

		Arrays.sort(works);
		int a = works.length - 1;
		while (n != 0) {

			if (works[a] >= works[a - 1]) {
				works[a] = works[a] - 1;
				n--;

			}

		}

		for (int i = 0; i < works.length; i++) {
			answer += Math.pow(works[i], 2);
		}

		return answer;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1 };
		solution(3, arr);
	}
}
