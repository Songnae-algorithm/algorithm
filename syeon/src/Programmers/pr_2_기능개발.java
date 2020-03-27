package Programmers;

import java.util.*;

public class pr_2_기능개발 {

	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};

		Queue<Integer> qu = new LinkedList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < progresses.length; i++) {
			qu.offer(progresses[i]);
		}

		int idx = 0;
		int day = 0;
		
		while (!qu.isEmpty()) {
			int n = qu.peek();
			if (n + day * speeds[idx] >= 100) {
				qu.poll();
				idx++;
				if (!qu.isEmpty()) {

				}

			}

			day++;
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] pro = { 93, 30, 55 };
		int[] speed = { 1, 30, 5 };

		solution(pro, speed);

	}

}
