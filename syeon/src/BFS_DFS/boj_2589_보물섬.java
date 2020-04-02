package BFS_DFS;

import java.util.*;

class Node {
	int x;
	int y;
	int cnt = 0;

	Node(int x, int y, int cnt) {
		this.x = x;
		this.y = y;
		this.cnt = cnt;

	}
}

public class boj_2589_보물섬 {
	// 2020.04.02 16:20 start

	static char[][] arr;
	static boolean[][] visit;
	static int n;
	static int m;

	static int ans = Integer.MIN_VALUE;

	private static int bfs(int a, int b) {
		visit = new boolean[n][m];

		int answer = 0;
		Queue<Node> qu = new LinkedList<>();

		qu.add(new Node(a, b, 0)); // L이들어간 값 a, b

//		//상하좌우로 돌기
		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, 1, -1 };

		while (!qu.isEmpty()) {
			Node n = qu.poll();
			int x = n.x;
			int y = n.y;
			int cnt = n.cnt;

			visit[x][y] = true;

			answer = cnt;

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[1].length && arr[nx][ny] == 'L'
						&& visit[nx][ny] == false) {

					visit[nx][ny] = true;
					qu.add(new Node(nx, ny, n.cnt + 1));
					answer = Math.max(answer, cnt); // 얘를 해주어야 함. 왜? 일케 안해주면 answer 값이 크던 작던 계속 바뀌니까, 더 클때만 바꿔주기

				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();// 행
		m = sc.nextInt(); // 열

		arr = new char[n][m];

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < m; j++)
				arr[i][j] = s.charAt(j);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int cnt = 0;
				if (arr[i][j] == 'L') {
					cnt = bfs(i, j);

				}

				if (cnt > ans) {
					ans = cnt;// ans = Math.max(ans,cnt) 도 가능
				}
			}
		}
		System.out.println(ans);

	}

}
