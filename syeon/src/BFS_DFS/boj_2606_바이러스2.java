package BFS_DFS;

import java.util.*;

public class boj_2606_바이러스2 {

	public static void main(String[] args) {
		// 5/12 11:27-39

		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();
		int in = sc.nextInt();

		int arr[][] = new int[len + 1][len + 1];

		for (int i = 0; i < in; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			arr[x][y] = 1;
			arr[y][x] = 1;

		}

		Queue<Integer> qu = new LinkedList<>();
		boolean chk[] = new boolean[arr.length];

		qu.add(1);
		chk[1] = true;

		while (!qu.isEmpty()) {

			int p = qu.poll();
			for (int i = 1; i < arr.length; i++) {

				if (arr[p][i] == 1 && !chk[i]) {
					qu.add(i);
					chk[i] = true;

				}
			}

		}

		int answer = 0;

		for (int i = 2; i < chk.length; i++) {
			if (chk[i] == true) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
