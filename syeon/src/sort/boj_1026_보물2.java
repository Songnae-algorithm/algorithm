package sort;

import java.util.*;

public class boj_1026_보물2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();

		int A[] = new int[in];
		int B[] = new int[in];

		for (int i = 0; i < in; i++)

			A[i] = sc.nextInt();

		for (int i = 0; i < in; i++) {
			B[i] = sc.nextInt();

		}

		Arrays.sort(A);
		Arrays.sort(B);

		int sum = 0;

		for (int i = 0; i < A.length; i++) {

			sum += A[i] * B[A.length - 1 - i];
		}
		System.out.println(sum);

	}

}
