package 탐색;

import java.util.*;

public class pr3_예산 {

	public static int solution(int[] budgets, int M) {

		Arrays.sort(budgets);

		long sum = 0;
		for (int i = 0; i < budgets.length; i++) {
			sum += budgets[i];
		}
		if (sum <= M) {
			return budgets[budgets.length - 1];//
		}
		
		
		while (true) {
			for (int i = 0; i < budgets.length; i++) {
				if (budgets[i] * (budgets.length - i) <= M) {
					M = M - budgets[i];
					System.out.println(i + " " + M);

				} else {

					return M / (budgets.length - i);
				}
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 120, 110, 140, 150 };
		solution(arr, 485);

	}

}
