package BFS_DFS;

import java.util.*;

public class boj_2589_보물섬2 {

	static class Node {
		int x;
		int y;
		int cnt = 0;

		Node(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;

		}

	}

	static Character arr[][];
	static Queue<Node> qu = new LinkedList<>();

	static boolean visit[][];

	// 최소값을 구할때는 BFS!!!!!DFS안돼

	private static int bfs(int a, int b) {

		visit = new boolean[arr.length][arr[1].length]; // visit 선언을 main 에서 해서 틀렸다...! 돌때마다 계속 바꿔야하니까 bfs 함수안에 !

		int ans = 0;

		qu.add(new Node(a, b, 0));
		visit[a][b] = true;// 갔으면 true

		while (!qu.isEmpty()) {
			Node q = qu.poll();
			int x = q.x;
			int y = q.y;

			int dx[] = { -1, 1, 0, 0 };
			int dy[] = { 0, 0, 1, -1 };

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[1].length && !visit[nx][ny]
						&& arr[nx][ny] == 'L') {

					qu.add(new Node(nx, ny, q.cnt + 1));

					ans = Math.max(q.cnt + 1, ans);// 최댓값을 저장 !!
					visit[nx][ny] = true;

				}
			}
		}
		return ans;
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

					max = Math.max(bfs(i, j), max);

				}
			}
		}
		System.out.println(max);

	}

}
