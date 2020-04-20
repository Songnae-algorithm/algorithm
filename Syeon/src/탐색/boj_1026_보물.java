package 탐색;

import java.util.*;

public class boj_1026_보물 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();
		int A[] = new int[in];
		int B[] = new int[in];

		for (int i = 0; i < in; i++) {
			A[i] = sc.nextInt();

		}
		for (int i = 0; i < in; i++) {
			B[i] = sc.nextInt();

		}
		Arrays.sort(A);
		Arrays.sort(B);

		int ans = 0;
		for (int i = 0; i < in; i++) {
			ans += A[i] * B[in - 1 - i];
		}

		System.out.println(ans);

	}

}
