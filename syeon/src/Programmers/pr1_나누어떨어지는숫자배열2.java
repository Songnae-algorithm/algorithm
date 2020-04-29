package Programmers;

import java.util.*;

public class pr1_나누어떨어지는숫자배열2 {

	// 4/27 1:10 start 1: 15 fin 
	public static int[] solution(int[] arr, int divisor) {

		PriorityQueue<Integer> q = new PriorityQueue<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				q.add(arr[i]);
			}
		}

		if (q.isEmpty()) {
			q.add(-1);
		}
		int[] answer = new int[q.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = q.poll();

		}
		return answer;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 9, 7, 10 };

		solution(arr, 5);

		int arr1[] = { 3,2,6};
		solution(arr1, 20);

	}

}
