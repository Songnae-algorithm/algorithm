package Prog;

import java.util.*;

public class pr3_가장먼노드 {

	// 인접리스트로 풀기 !

	public static int solution(int n, int[][] edge) {
		int answer = 0;

		boolean arr[][] = new boolean[n + 1][n + 1];
		boolean chk[] = new boolean[n + 1]; // 갔는지 판별
	

		int cnt[] = new int[n + 1];// 거리 계산

		for (int i = 0; i < edge.length; i++) {
//			int x = edge[i][0];
//			int y = edge[i][1];

			arr[edge[i][0]] [edge[i][1]] = true;
			arr[edge[i][1]][edge[i][0]] = true;

		}

		int max = 0;

		Queue<Integer> qu = new LinkedList<>();
		qu.add(1);
		chk[1] = true;

		while (!qu.isEmpty()) {
			int p = qu.poll();

			for (int i = 1; i < n + 1; i++) {

				if (arr[p][i] ==true && chk[i] == false) {

					//arr[p][i] = 0;
					chk[i] = true;
					qu.add(i);

					cnt[i] = cnt[p] + 1;
					
					if (max < cnt[i]) {
						max = cnt[i];
					}
				}
			}
		}

		for (int i = 1; i < n + 1; i++) {
			if (max == cnt[i]) {
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
