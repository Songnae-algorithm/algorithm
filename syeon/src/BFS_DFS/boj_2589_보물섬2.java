package BFS_DFS;

import java.util.*;

public class boj_2589_보물섬2 {
	static Character arr[][];
	//최소값을 구할때는 BFS

	private static int dfs(boolean[][] visit, int x, int y, int cnt) {
		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, 1, -1 };

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[1].length && !visit[nx][ny] && arr[nx][ny] == 'L') {
				visit[nx][ny] = true;
			//	System.out.println(nx + " " + ny);

				dfs(visit, nx, ny, cnt + 1);
			}
		}
		System.out.println(cnt);
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		arr = new Character[n][m];

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(j);
			}

		}

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 'L') {
					boolean visit[][] = new boolean[n][m];

					visit[i][j] = true;

					max = Math.max(dfs(visit, i, j, 0), max);
				}
			}
		}
		System.out.println(max);

	}

}
