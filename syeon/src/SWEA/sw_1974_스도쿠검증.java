package SWEA;

import java.util.*;

public class sw_1974_스도쿠검증 {

	public static void main(String[] args) {
		// 7/7 17:51-

		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();

		for (int a = 1; a <= in; a++) {
			boolean anschk = true;
			int ans = 1;

			int arr[][] = new int[9][9];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[1].length; j++) {
					arr[i][j] = sc.nextInt();

				}
			} // 입력

			// 가로로 봐주기
			for (int i = 0; i < arr.length; i++) {
				boolean chk[] = new boolean[10];

				for (int j = 0; j < arr.length; j++) {
					chk[arr[i][j]] = true;
				} // arr[i][j]의 값을 chk 에 넣음

				for (int j = 1; j < 10; j++) {// 1~9중에 chk가 false인게 있는지 체크
					if (!chk[j]) {
						anschk = false;
						break;

					}
				}
				if (!anschk) {
					ans = 0;

					break;
				}
			}
			// 세로로 봐주기

			for (int i = 0; i < arr.length; i++) {
				boolean chk[] = new boolean[10];

				for (int j = 0; j < arr.length; j++) {
					chk[arr[j][i]] = true;
				} // arr[i][j]의 값을 chk 에 넣음

				for (int j = 1; j < 10; j++) {// 1~9중에 chk가 false인게 있는지 체크
					if (!chk[j]) {
						anschk = false;
						break;

					}
				}
				if (!anschk) {
					ans = 0;

					break;
				}
			}

			// 작은네모 오떻게봐주지
			for (int i = 0; i <= 6; i = i + 3) {
				for (int j = 0; j <= 6; j = j + 3) {
					// 0,0 -> 0,3 -> 0,6 -> 3,0 -> 3,3 ->....
					anschk = CheckNemo(i, j, arr);
					// System.out.println(anschk);

					if (!anschk) {
						ans = 0;

						break;

					}

				}

			}

			System.out.println("#" + a + " " + ans);

		} // in
	}

	private static boolean CheckNemo(int x, int y, int[][] arr) {
		boolean chk[] = new boolean[10];

		for (int i = x; i < x + 3; i++) {
			for (int j = y; j < y + 3; j++) {
				chk[arr[i][j]] = true;
			}
		}
		for (int i = 1; i < 10; i++) {// 1~9중에 chk가 false인게 있는지 체크
			if (!chk[i]) {

				return false;
			} else {
				continue;
			}

		}
		return true;
	}// check

}
