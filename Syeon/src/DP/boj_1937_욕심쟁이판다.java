package DP;

import java.util.*;;

public class boj_1937_욕심쟁이판다 {
	static int arr[][];
	static int chk[][];
	static int cnt = 0;
	static int ans = Integer.MIN_VALUE;

	private static int dfs(int x, int y) {

		chk[x][y] = 1;

		int dx[] = { -1, -1, 1, 1 };
		int dy[] = { 0, -1, 1, 0 };

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr.length && arr[x][y] < arr[nx][ny]) {
				// 방문 안했을때만
				cnt = Math.max(chk[x][y], dfs(nx, ny) + 1);
			}
		}

		return cnt;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		arr = new int[a][a];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				int aa = dfs(i, j);
				if (aa > ans) {
					ans = aa;
				}
			}

		}
		System.out.println(ans);

	}
}
