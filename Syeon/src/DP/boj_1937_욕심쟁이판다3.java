package DP;

import java.util.*;

public class boj_1937_욕심쟁이판다3 {
	static int arr[][];
	static int map[][];

	private static int dfs(int x, int y) {
		if (map[x][y] != 0)
			return map[x][y];
		
		//

		map[x][y] = 1;
		// 내가 가진거만 먹어도 1로

		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, 1, -1 };

		for (int i = 0; i < 4; i++) {

			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[1].length && arr[nx][ny] > arr[x][y]) {
				// 범위초과안하고 새로 들어가는게 자기보다 클 때.

				map[x][y] = Math.max(map[x][y], dfs(nx, ny) + 1);
				// dfs로 끝까지 돌면서 올라올때 +1 해줌

			}

		}

		return map[x][y];

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();
		arr = new int[in][in];
		map = new int[in][in];

		for (int i = 0; i < in; i++) {
			for (int j = 0; j < in; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		int max = 0;
		for (int i = 0; i < in; i++) {
			for (int j = 0; j < in; j++) {
				max = Math.max(max, dfs(i, j));
			}
		}
		System.out.println(max);

	}

}
