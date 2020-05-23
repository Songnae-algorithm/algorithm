package Programmers;

import java.util.*;

public class pr2_프렌즈4블록 {

	public static int solution(int m, int n, String[] board) {
		// 5/15 10:52 ,11:07(코딩)

		int answer = 0;

		Character arr[][] = new Character[m][n];

		for (int i = 0; i < m; i++) {
			String s = board[i];
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.charAt(j);
			}
		}

		int cnt = 0;

		boolean visit[][] = new boolean[m][n];
		// boolean chk = false;

		while (cnt < 10) {

			for (int i = 0; i < m - 1; i++) {

				for (int j = 0; j < n - 1; j++) {
					if (arr[i][j] == arr[i][j + 1] && arr[i + 1][j] == arr[i + 1][j + 1]
							&& arr[i][j] == arr[i + 1][j]) { // 4개가 같으면,visit을 다 true로 바꿔줌

						visit[i][j] = true;
						visit[i][j + 1] = true;
						visit[i + 1][j] = true;
						visit[i + 1][j + 1] = true;

					}

				}

			}
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (visit[i][j] == true) {

						arr[i][j] = '0';// 0으로 바꿔줌

						if (i > 0 && arr[i - 1][j] != '0') {
							arr[i][j] = arr[i - 1][j];
							arr[i - 1][j] = '0';
						}
						visit[i][j] = false;

					}

				}
			}
//			for (int i = 0; i < m; i++) {
//				for (int j = 0; j < n; j++) {
//					System.out.print(arr[i][j]);
//
//				}
//				System.out.println();
//
//			}
			cnt++;

		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]);

			}
			System.out.println();

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				if (arr[i][j] == '0') {
					answer++;
				}
			}
		}
		// System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {

		String arr[] = { "CCBDE", "AAADE", "AAABF", "CCBBF" };
		String arr1[] = { "TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ" };

		// solution(4, 5, arr);
		solution(6, 6, arr1);
		//solution(6,2, String a[]={"AA", "AA", "CC", "AA", "AA", "DD"};);
		
	}
}
