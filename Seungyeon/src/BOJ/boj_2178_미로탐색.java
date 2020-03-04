package BOJ;

import java.util.*;

class Store {
	int x;
	int y;
	int cnt;

	Store(int x, int y, int cnt) {
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
}

public class boj_2178_미로탐색 {
	static int answer;

	private static void bfs(int[][] arr, int x, int y, int count) {

		Queue<Store> qu = new LinkedList<>();

		qu.add(new Store(x, y, count));
		arr[x][y] = 0;// 방문한곳은 0으로

		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, 1, -1 };

		while (!qu.isEmpty()) {
			Store s = qu.poll();

			int a = s.x;// x
			int b = s.y;// y
			int cnt = s.cnt;
			answer = cnt;

			for (int i = 0; i < 4; i++) {
				int nx = a + dx[i];
				int ny = b + dy[i];

				if (nx >= 0 && nx < b && ny >= 0 && ny < a && arr[nx][ny] == 1) {

					qu.add(new Store(nx, ny, cnt + 1));// 다시 qu에 새로운 값 저장
					arr[nx][ny] = 0;
				}
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();// 행
		int y = sc.nextInt();// 열

		int arr[][] = new int[x][y];

		for (int i = 0; i < x; i++) {
			String s = sc.next();
			for (int j = 0; j < y; j++) {
				arr[i][j] = s.charAt(j) - '0';
				// 붙여서 입력할때 이렇게 넣는거 알아두기

			}
		}

		bfs(arr, 0, 0, 1);// cnt는 (0,0일때는 무조건 1이기 때문에 1)

		System.out.println(answer);
	}

}
