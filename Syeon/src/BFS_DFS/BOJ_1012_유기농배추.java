package BFS_DFS;

import java.util.*;

public class BOJ_1012_유기농배추 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();

		for (int i = 0; i < in; i++) {
			int answer = 0;
			int hang = sc.nextInt();
			int yul = sc.nextInt();
			int input = sc.nextInt();
			int arr[][] = new int[hang][yul];

			for (int j = 0; j < input; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();

				arr[a][b] = 1;
			}

			for (int k = 0; k < arr.length; k++) {
				for (int l = 0; l < arr[0].length; l++) {
					if (arr[k][l] == 1) {
						dfs(arr, k, l);
						answer++;//dfs를 갔다가 나오면 연결된 i,j를 0으로 만들고 나온당...

					}
				}
			}
			System.out.println(answer);

		} // for

	}

	public static void dfs(int[][] a, int x, int y) {

		a[x][y] = 0;// 들어온 값을 0으로 만들어 줌

		int dx[] = { 1, -1, 0, 0 };// 상,하,좌,우
		int dy[] = { 0, 0, -1, 1 };// 상,하,좌,우

		for (int i = 0; i < 4; i++) {
			int newx = x + dx[i];
			int newy = y + dy[i];
			// 사방을 다 돌음
			if (newx>=0 && newx<a.length && newy>=0 && newy<a[0].length &&
					a[newx][newy] == 1) {
				//newx>=0 && newx<a.length && newy>=0 && newy<a[0].length -> 범위 초과 안하는 경우..
				
				// a[newx][newy] = 0;
				dfs(a, newx, newy);// 1일때 다시 사방을 돌음, 다시 돌아가서 0으로 만들어줌
			}
		}

	}

}
