package BFS_DFS;

import java.util.*;

public class boj_1261_알고스팟 {

	static class Node implements Comparable<Node> {
		// PQ에서 값이 여러개일 때 comparator 사용하는 방법.
		int x;
		int y;
		int cnt;

		public Node(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;

		}

		public int compareTo(Node o) {
			System.out.println(this.x + " " + this.y + " " + this.cnt + " this");
			System.out.println(o.x + " " + o.y + " " + o.cnt + " o");

			return this.cnt < o.cnt ? -1 : 1;
			// this : 원래 가지고있던 값. o 는 매개변수로 들어온 값.
			// this < o 면, 위치 안바꿈. this > o 일 때 바꿈
		}

	}

	static int arr[][];

	static boolean visited[][];

	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		arr = new int[b][a];
		visited = new boolean[b][a];

		PriorityQueue<Node> qu = new PriorityQueue<>();

		for (int i = 0; i < arr.length; i++) {
			String s = sc.next();

			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = s.charAt(j) - '0';

			}
		}

		qu.add(new Node(0, 0, 0));

		visited[0][0] = true;

		while (!qu.isEmpty()) {

			Node q = qu.poll();
			int x = q.x;
			int y = q.y;

			System.out.println();

			System.out.println(q.x + " " + q.y + " " + q.cnt + " poll 한거  ");

			if (x == arr.length - 1 && y == arr[0].length - 1) { //arr[1].length 말고 0으로 하는것 습관 들이기 . 1 1 0 들어올때 에러 
				System.out.println(q.cnt);
				break;
			}

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[0].length && !visited[nx][ny]
						&& arr[nx][ny] == 0) { // 범위초과 X, 0 일 때
					visited[nx][ny] = true; // 방문한곳 true 로

					qu.add(new Node(nx, ny, q.cnt));

				}
				else if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[0].length && !visited[nx][ny]
						&& arr[nx][ny] == 1) {
					visited[nx][ny] = true;

					qu.add(new Node(nx, ny, q.cnt + 1));

				}

			}

		}

	}
}
