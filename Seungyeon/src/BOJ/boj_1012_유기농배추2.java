package BOJ;

import java.util.*;

public class boj_1012_유기농배추2 {

	public static void dfs(int arr[][], int x, int y) {
	
		arr[x][y] = 0;//dfs에 들어가면 나를 0으로 바꿔주기 

		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, -1, 1 };
		//상하좌우를 돌아줌(순서는 관계없음! 매칭만 잘되게)

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];//새로운 좌표 nx에 기존의 좌표 + 상하좌우 돌아줌
			int ny = y + dy[i];

			if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr.length && arr[nx][ny] != 0) {
				dfs(arr, nx, ny);
				//상하좌우가 범위를 초과하지 않고 0이 아닐때만 다시 dfs를 돌기
				//배열의 크기는 arr.length보다 작고 0보다 크거나 같아야함
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		for (int i = 0; i < input; i++) {

			int m = sc.nextInt();
			int n = sc.nextInt();
			int c = sc.nextInt();

			int arr[][] = new int[m][n];

			for (int j = 0; j < c; j++) {

				int x = sc.nextInt();
				int y = sc.nextInt();

				arr[x][y] = 1;

			}

			int answer = 0;// dfs를 돌고 나온 결과를 리턴

			for (int k = 0; k < m; k++) {
				for (int l = 0; l < n; l++) {
					if (arr[k][l] == 1) { //배열값이 1일 때 dfs로 가기 
						dfs(arr, k, l);
						answer++;//돌고 다시 왔을때 ++ 

					}

				}
			}
		}

	}

}
