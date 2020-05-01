package Programmers;

import java.util.*;

public class pr2_가장먼노드2 {
	static int arr[][];
	static int cnt[];
	static boolean chk[];

	public static int solution(int n, int[][] edge) {

		// 5/1 11;01-
		int answer = 0;

		arr = new int[n + 1][n + 1];

		for (int i = 0; i < edge.length; i++) {
			int x = edge[i][0];
			int y = edge[i][1];

			arr[x][y] = 1;
			arr[y][x] = 1;

		}
		cnt = new int[n + 1];
		chk = new boolean[n + 1];
		int max = 0;

		Queue<Integer> qu = new LinkedList<>();

		qu.add(1);
		chk[1] = true;

		while (!qu.isEmpty()) {
			int p = qu.poll();

			for (int i = 1; i < n + 1; i++) {
				if (arr[p][i] == 1 && !chk[i]) {
					cnt[i] = cnt[p] + 1;
					qu.add(i);

					chk[i] = true;
					if (max < cnt[i]) {
						max = cnt[i];
					}
				}
			}

		}

		for (int i = 1; i < n + 1; i++) {

			if (cnt[i] == max) {
				answer++;
			}
		}

		return answer;

	}

	public static void main(String[] args) {

		int arr[][] = { { 3, 6 }, { 4, 3 }, { 3, 2 }, { 1, 3 }, { 1, 2 }, { 2, 4 }, { 5, 2 } };

		solution(6, arr);

	}

}
