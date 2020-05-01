package Programmers;

import java.util.*;

public class pr2_야근지수3 {

	public static long solution(int n, int[] works) {

		// 5/1 10:37-56

		long answer = 0;
		int chk = 0;

		for (int i = 0; i < works.length; i++) {
			chk += works[i];

		}
		if (chk < n) {
			return 0;
		}

		// pq에 하나씩 입력했고

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < works.length; i++) {
			pq.add(works[i]);

		}
		// pq에 하나씩 입력했고

		while (n != 0) {
			int a = pq.poll() - 1;
			n--;
			pq.add(a);

		}

		int len = pq.size();
		for (int i = 0; i < len; i++) {
			answer += Math.pow(pq.poll(), 2);
		}
		return answer;
	}

	public static void main(String[] args) {

		int arr[] = { 4, 3, 3 };
		solution(4, arr);

	}

}
