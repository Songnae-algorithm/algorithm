package DP;

import java.util.*;

public class boj_11048_이동하기2 {
	static int arr[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		arr = new int[n][m]; // 배열

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		//런타임에러 이유... arr.length 랑 arr[1].length 를 사용했더니 런타임에러. n m 으로 해야함 
		for (int i = 1; i < n; i++) { // 0열은 아래로밖에 못감
			arr[i][0] = arr[i][0] + arr[i - 1][0];
		}
		for (int i = 1; i < m; i++) { // 0행은 왼쪽꺼랑 밖에 비교 못함
			arr[0][i] = arr[0][i] + arr[0][i - 1];
		}
		for (int i = 1; i < n; i++) {

			for (int j = 1; j < m; j++) {

				arr[i][j] = Math.max(arr[i - 1][j], Math.max(arr[i - 1][j - 1], arr[i][j - 1])) + arr[i][j];
				// 다른애들은 왼, 대각선위, 바로 위 꺼 중에 최댓값을 받아와야함
			}
		}

		System.out.println(arr[n - 1][m - 1]);
	}

}
