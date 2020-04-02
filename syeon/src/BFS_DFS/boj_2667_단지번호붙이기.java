package BFS_DFS;

import java.util.*;

public class boj_2667_단지번호붙이기 {

	static int cnt = 0;//cnt를 전역변수로 선언 

	public static int dfs(int arr[][], int x, int y) {

		arr[x][y] = 0;
		cnt++;//cnt를 ++

		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, -1, 1 };

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr.length && arr[nx][ny] != 0) {
				dfs(arr, nx, ny);

			}

		}
		return cnt;//붙어있는 cnt 리턴

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();

		int n = sc.nextInt();
		int arr[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			String s = sc.next();

			for (int j = 0; j < n; j++) {
				arr[i][j] = s.charAt(j) - '0'; // string으로 받아서 짤라서 넣기
			}
		}

		int answer = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (arr[i][j] == 1) {

					dfs(arr, i, j);
					answer++;

					list.add(cnt);//cnt 저장 
					cnt = 0;//다음 dfs를 위해 cnt 초기화

				}

			}
		}

		//Collections.sort(list);
		//list.sort(null);

		System.out.println(answer);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
