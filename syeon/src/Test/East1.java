package Test;

import java.util.*;

public class East1 {
	
	public static int solution(int A[]) {

		int max = 0;

		Arrays.sort(A);

		int d[] = new int[A[A.length - 1] + 1];// 가장 마지막값보다 +1 해주기

		for (int i = 0; i < A.length; i++) {
			int num = A[i]; // 2

			d[num]++;
		}

		for (int i = 1; i < d.length; i++) {
			if (d[i] == i) {

				if (max < i) {
					max = i;
				}
	
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int arr1[] = { 3, 8, 2, 3, 3, 2 };

		int arr2[] = { 3, 1, 4, 1, 5 };
		int arr3[] = { 7, 1, 2, 8, 2 };
		int arr4[] = { 5, 5, 5, 5, 5 };
		solution(arr4);
	}
}
