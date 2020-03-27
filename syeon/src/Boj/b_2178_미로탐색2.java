package Boj;

import java.util.*;

public class b_2178_미로탐색2{
	// 17:21 시작 17:45 안풀려서  다시 

	static int cnt = 1;

	public static int bfs(int arr[][], int x, int y) {

		arr[x][y] = 0; // 방문 0으로

		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, 1, -1 };

		for (int i = 0; i < 4; i++) {

			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx == arr.length - 1 && ny == arr[1].length) {
				break;
			}
			if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[1].length && arr[nx][ny] == 1) {
				cnt++;
				bfs(arr, nx, ny);

			}

		}
		return cnt;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();// 4
		int b = sc.nextInt();// 6

		int arr[][] = new int[a][b];

		for (int i = 0; i < a; i++) {
			String s = sc.next();
			for (int j = 0; j < b; j++) {
				arr[i][j] = s.charAt(j) - '0';

			}
		}
		// 첨 방문할때도 cnt를 세야하니까 1로

		bfs(arr, 0, 0);

		System.out.println(cnt);
	}

}
