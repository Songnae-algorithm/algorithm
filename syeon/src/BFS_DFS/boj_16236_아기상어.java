package BFS_DFS;

import java.util.*;

public class boj_16236_아기상어 {

	static int shsize = 2;
	static int arr[][];

	public static void main(String[] args) {
		// 5/15 2:51-

		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();
		arr = new int[in][in];

		for (int i = 0; i < in; i++) {
			for (int j = 0; j < in; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 9) {
					dfs(x, y);
				}
			}
		}
	}

}
