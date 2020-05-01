package Programmers;

import java.util.*;

public class pr1_예산 {
	public static int solution(int[] d, int budget) {
		// 5/1 15:05-10
		int answer = 0;
		int sum = 0;

		Arrays.sort(d);

		for (int i = 0; i < d.length; i++) {

			sum += d[i];

			if (sum > budget) {
				break;
			}
			answer++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 5, 4 };
		solution(arr, 9);

	}

}
