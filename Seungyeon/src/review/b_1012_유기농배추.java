package review;

import java.util.*;

public class b_1012_유기농배추 {

	// 16:47 시작 17:08 끝 

	public static void bfs(int arr[][], int x, int y) {

		arr[x][y] = 0; // 방문한 곳 0으로

		int dx[] = { 0, 0, -1, 1 };
		int dy[] = { 1, -1, 0, 0 };

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[1].length && arr[nx][ny] != 0) {
				bfs(arr, nx, ny);
				
				
				//범위 초과 안되면 bfs로 돌기
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt(); // 입력받을 테케 수

		for (int i = 0; i < in; i++) {

			int b = sc.nextInt(); // 열의 수
			int a = sc.nextInt(); // 행의 수
			int c = sc.nextInt(); // 1입력하는 위치의 수

			int arr[][] = new int[a][b];

			for (int j = 0; j < c; j++) {
				int y = sc.nextInt(); // 열
				int x = sc.nextInt(); // 행

				arr[x][y] = 1;
			}
//
			int cnt = 0;

			for (int k = 0; k < a; k++) { 
				for (int j = 0; j < b; j++) {
					if (arr[k][j] == 1) {
						bfs(arr, k, j);
						cnt++;
						//한 덩어리 끝나면 그때 cnt를 ++해줌 !! 
					}
				}

			}

			System.out.println(cnt);
		} // 입력테케

	}

}
