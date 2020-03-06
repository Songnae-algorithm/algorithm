package BOJ;

import java.util.*;

class Store {
	int x;
	int y;
	int cnt = 0;

	Store(int x, int y, int cnt) {
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
}

public class boj_2178_미로탐색 {

	static int answer = 0;

	private static void bfs(int[][] arr, int a, int b, int count) {

		Queue<Store> qu = new LinkedList<Store>();

		qu.add(new Store(a, b, 1));// 0,0,1
		arr[0][0] = 0;// 방문한곳은 0으로

		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, 1, -1 };

		while (!qu.isEmpty()) {
			Store s = qu.poll();

			int x = s.x;// x
			int y = s.y;// y
			int cnt = s.cnt;
			answer = cnt;

			if (x == arr.length - 1 && y == arr[1].length - 1) {
			
				break;

			}

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[1].length && arr[nx][ny] == 1) {

					arr[nx][ny] = 0;// 방문한곳 0으로
					qu.add(new Store(nx, ny, cnt + 1));// 다시 qu에 새로운 값 저장
				}
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();// 행
		int b = sc.nextInt();// 열

		int arr[][] = new int[a][b];

		for (int i = 0; i < a; i++) {
			String s = sc.next();
			for (int j = 0; j < b; j++) {
				arr[i][j] = s.charAt(j) - '0';
				// 붙여서 입력할때 이렇게 넣는거 알아두기

			}
		}

		bfs(arr, 0, 0, 1);// cnt는 (0,0일때는 무조건 1이기 때문에 1)

		System.out.println(answer);
	}

}
