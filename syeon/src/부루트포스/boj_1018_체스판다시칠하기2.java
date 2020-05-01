package 부루트포스;

import java.util.*;

public class boj_1018_체스판다시칠하기2 {
	static Character arr[][];
	static char WB[][] = { { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
			{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
			{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
			{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }

	};
	static char BW[][] = { { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }

	};

	public static void main(String[] args) {
		// 5/1 12:35 -13:13

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		arr = new Character[x][y];

		for (int i = 0; i < x; i++) {
			String s = sc.next();
			for (int j = 0; j < y; j++) {
				arr[i][j] = s.charAt(j);
			}
		}

		int answer = Integer.MAX_VALUE;

		for (int a = 0; a < x - 7; a++) { // 0 1 로 바꾸며서 돌기

			for (int b = 0; b < y - 7; b++) {

				answer = Math.min(chk(a, b), answer);

			}

		}
		System.out.println(answer);

	}

	private static int chk(int a, int b) {

		int min = 0;
		int wbcnt = 0;
		int bwcnt = 0;
		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8; j++) {
				if (BW[i][j] != arr[a + i][b + j]) {
					bwcnt++;

				}
				if (WB[i][j] != arr[a + i][b + j]) {
					wbcnt++;

				}
			}
			min = Math.min(bwcnt, wbcnt);
		}

		return min;
	}

}
