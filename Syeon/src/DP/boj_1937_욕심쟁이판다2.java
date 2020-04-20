package DP;

import java.util.*;

public class boj_1937_욕심쟁이판다2 {
	static int arr[][];
	static int map[][];

	private static int dfs(int x, int y) {

		if (map[x][y] != 0)
			return map[x][y];

		// 이미 한번 갔었으면 그냥 리턴해줌

		map[x][y] = 1; // 한번 갈때 1로. 가는 경로가 없더라도, 경로를 셀때는 자기 자신도 세줘야하기때문에 1로

		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { -0, 0, -1, 1 };

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr.length && arr[nx][ny] > arr[x][y]) {

				map[x][y] = Math.max(map[x][y], dfs(nx, ny) + 1);
				// 계속해서 dfs 하면서 +1 해줌
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
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < in; i++) {
			for (int j = 0; j < in; j++) {

				max = Math.max(max, dfs(i, j));
			}
		}
		System.out.println(max);

	}

}
