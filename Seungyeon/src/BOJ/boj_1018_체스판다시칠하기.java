package BOJ;

import java.util.*;

public class boj_1018_체스판다시칠하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int arr[][] = new int[m][n];
		int map[][] = new int[m][n];

		for (int i = 0; i < arr.length; i++) {
			String s = sc.next();
			for (int j = 0; j < arr[1].length; j++) {

				if ((s.charAt(j) == 'W')) {
					arr[i][j] = 1;
					map[i][j] = 1;
				} else {
					arr[i][j] = 0;
					map[i][j] = 1;
				}
			}
		}

		boolean chk = true;

		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[1].length; j++) {

				while (true) { // 위+아래 더해서 1될때
					if (arr[i][j - 1] + arr[i - 1][j - 1] != 1) {

						if (arr[i][j - 1] == 1) {
							arr[i - 1][j - 1] = 0;
							arr[i][j] = 0;

						} else {
							arr[i - 1][j - 1] = 1;
							arr[i][j - 1] = 0;
							arr[i][j] = 0;
						}

					}

				}

			}
		}

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				if (arr[i][j] != map[i][j]) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}

}
