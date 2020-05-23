package 시뮬레이션;

import java.util.Scanner;

public class boj_2571_색종이3 {
	public static void main(String[] args) {
		// 5/15 13:29
		int arr[][] = new int[101][101];
		int dp[] = new int[101];
		int minx = Integer.MAX_VALUE;
		int maxx = Integer.MIN_VALUE;
		int miny = Integer.MAX_VALUE;
		int maxy = Integer.MIN_VALUE;

		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();

		for (int i = 0; i < in; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			minx = Math.min(minx, x);
			maxx = Math.max(maxx, x);

			miny = Math.min(miny, y);
			maxy = Math.max(maxy, y);

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {

					arr[j][k] += 1;

				}

			}
		} // in

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				if (arr[i][j] > 1) { // 1보다 클 때
					dp[arr[i][j]]++;

				}
			}
		}
//		System.out.println(minx);
//		System.out.println(maxx);
//		System.out.println(miny);
//		System.out.println(maxy);

		int max = 0;
		int maxidx = 0;
		for (int i = 2; i < dp.length; i++) {
			if (max < dp[i]) {
				max = dp[i];
				maxidx = i;
			}
		}

		int idxx = 0;
		int idxy = 0;
		for (int i = 0; i < arr.length; i++) {
			int startx = 0;
			for (int j = 0; j < arr[1].length; j++) {
				if (arr[i][j] == maxidx) {
					startx++;
				}
				System.out.println(startx);
			}
			

		}

	}

}
