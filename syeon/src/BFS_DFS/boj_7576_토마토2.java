package BFS_DFS;

import java.util.*;

public class boj_7576_토마토2 {

	static class Node {
		int x;
		int y;
		int cnt;

		public Node(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;

		}
	}

	static int arr[][];

	public static void main(String[] args) {
		int answer = 0;
		Scanner sc = new Scanner(System.in);

		int y = sc.nextInt();
		int x = sc.nextInt();

		arr = new int[x][y];
		Queue<Node> qu = new LinkedList<>();

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (arr[i][j] == 1) {
					qu.add(new Node(i, j, 0));

				}
			}
		}
		while (!qu.isEmpty()) {

			Node p = qu.poll();
			int px = p.x;
			int py = p.y;
			answer = Math.max(p.cnt, answer);

			int dx[] = { -1, 1, 0, 0 };
			int dy[] = { 0, 0, 1, -1 };

			for (int k = 0; k < 4; k++) {
				int nx = px + dx[k];
				int ny = py + dy[k];

				if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[1].length && arr[nx][ny] == 0) {
					qu.add(new Node(nx, ny, p.cnt + 1));
					// 새로 방문한곳 qu에 저장
					arr[nx][ny] = 1;
					// 방문한곳 1로 바꿔주기
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				if (arr[i][j] == 0) {
					answer = -1;
				}
			}
		}
		System.out.println(answer);

	}
}
