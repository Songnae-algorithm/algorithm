package 시뮬레이션;

import java.util.*;

public class boj_2563_색종이 {

	public static void main(String[] args) {
		// 5/15 12:08 -20

		int arr[][] = new int[100][100];
		int cnt = 0;

		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();

		for (int i = 0; i < in; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k <y + 10; k++) {

					if (j > 100 || k > 100) {
						continue;
					}
					else {
						arr[j][k] = 1;
					}
					
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				if (arr[i][j] == 1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);

	}
}
