package Prog;

import java.util.*;

public class pr2_야근지수2 {
	public static long solution(int n, int[] works) {

		int sum = 0;
		for (int i = 0; i < works.length; i++) {

			sum += works[i];
		}
		if (sum <= n) {
			return 0;
		}
//더 클 때 

		long answer = 0;

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < works.length; i++) {
			pq.add(works[i]);

		}

		while (n != 0) {
			int poll = pq.poll(); // 맨 위값 빼쥼//4
			int peek = pq.peek();

			System.out.println(poll);
			System.out.println(peek);
			if (poll >= peek) {
				poll = poll - 1;
				pq.add(poll);
				n--;

			}

		}

		int a = pq.size();
		for (int i = 0; i < a; i++) {
			answer += Math.pow(pq.poll(), 2);

		}

		return answer;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 3 };
		solution(4, arr);
	}
}
