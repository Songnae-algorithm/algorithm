package BOJ;

import java.util.*;

public class boj_1018_체스판다시칠하기 {
	static char WB[][] = { { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
			{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
			{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
			{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' } };

	static char BW[][] = { { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' } };

	static char arr[][];

	private static int check(int x, int y) {

		int min = Integer.MAX_VALUE;

		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (arr[x + i][y + j] != BW[i][j]) {
					count1++;
				}
				if (arr[x + i][y + j] != WB[i][j]) {
					count2++;
				}
			}

		}
		int min2 = Math.min(count1, count2);
		min = Math.min(min2, min);
		return min;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE; // 가장 최댓값으로 지정
		int n = sc.nextInt();
		int m = sc.nextInt();

		arr = new char[n][m];

		for (int i = 0; i < n; i++) {
			String s = sc.next();

			for (int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(j);
			}

		} // 체스판 입력

		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {

				min = Math.min(min, check(i, j));

			}
		}
		System.out.println(min);

	}
}
