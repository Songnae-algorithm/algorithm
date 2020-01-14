package sy;

import java.util.*;

public class pr_2_더맵게 {
	public static int solution(int[] scoville, int K) {
		int answer = 0;

		PriorityQueue<Integer> list = new PriorityQueue<Integer>();

		for (int i = 0; i < scoville.length; i++) {
			list.add(scoville[i]);
		}

		while (list.peek() < K) {

			int a = list.poll();
			// System.out.println(a);
			int b = list.poll();
			// System.out.println(b);
			int c = a + (b * 2);
			// System.out.println(c);
			list.add(c);
			// System.out.println(list);

			answer++;

			// System.out.println(list);
			if (list.size() == 1) {
				return -1;
			}

		}

		// System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 9, 10, 12 };

		solution(arr, 7);
	}
}
