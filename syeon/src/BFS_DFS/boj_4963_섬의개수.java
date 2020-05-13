package BFS_DFS;

import java.util.*;

public class boj_4963_섬의개수 {

	static class Node {
		int x;
		int y;

		Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int[][] arr;
	static int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };
	
	public static void main(String[] args) {
		// 5/5 12:40-13:50
		//ㅎ ㅏ..............dx dy 를 잘못해줬는데 그걸 몰라서 계속 이상한데 수정하다가 시간이 다 가버렸....
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			int y = sc.nextInt();
			int x = sc.nextInt();

			if (y == 0 && x == 0) {
				break;
			} // 0 0 이 들어오면 끝냄

			if (y == 1 && x == 1) {
				int k = sc.nextInt();
				if (k == 0)
					System.out.println(0);
				else
					System.out.println(1);

				continue;
			}

			arr = new int[x][y];

			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++)
					arr[i][j] = sc.nextInt();
			} // 배열 입력

			int answer = 0;

			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					if (arr[i][j] != 0) {
						bfs(i, j);
						answer++;
					}
				}
			}
			System.out.println(answer);

		} // while 안에서 계속

	}

	private static void bfs(int a, int b) {
		Queue<Node> qu = new LinkedList<>();

		qu.add(new Node(a, b));// 1일 때 큐에 넣기
		arr[a][b] = 0;// 방문한건 0으로 바꿔주기

		while (!qu.isEmpty()) {
			Node n = qu.poll();
			int x = n.x;
			int y = n.y;

			for (int i = 0; i < 8; i++) {

				int nx = x + dx[i];
				int ny = y + dy[i];
				// 변수 제발....

				if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[1].length && arr[nx][ny] == 1) {
					// 범위초과안하고 1 이면
					qu.add(new Node(nx, ny));
					arr[nx][ny] = 0;
				}
			}
		}

	}

}
