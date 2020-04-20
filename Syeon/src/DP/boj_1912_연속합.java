package DP;

import java.util.*;

public class boj_1912_연속합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();
		int arr[] = new int[in];
		int dp[] = new int[in];
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < in; i++) {
			arr[i] = sc.nextInt();

		}
		dp[0] = arr[0];

		for (int i = 1; i < dp.length; i++) {
			if (dp[i - 1] > 0) {
				dp[i] = dp[i - 1] + arr[i];
			} else {
				dp[i] = arr[i];
			}
		}
		for (int i = 0; i < dp.length; i++) {
			max = Math.max(max, dp[i]);
		}

		System.out.println(max);
	}

}
