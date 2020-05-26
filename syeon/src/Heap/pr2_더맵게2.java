package Heap;

import java.util.*;

public class pr2_더맵게2 {

	public static int solution(int[] scoville, int K) {

		// 5/26 17:54-18:05

		int answer = 0;

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < scoville.length; i++) {
			pq.add(scoville[i]);

		}

		while (pq.peek() < K) {

			int p = pq.poll() + pq.poll() * 2;
			pq.add(p);
			answer++;

			if (pq.size() == 1 && pq.peek() < K) {
				answer = -1;
				return answer;

			}

		}

		
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
//		int arr[] = { 1, 2, 3, 9, 10, 12 };
//		solution(arr, 7);// 2

		int arr[] = { 1, 2, 3 };
		solution(arr, 11);

	}

}
