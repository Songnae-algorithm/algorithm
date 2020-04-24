package BFS_DFS;

import java.util.*;

public class boj_1389_케빈베이컨의6단계법칙2 {
	static int arr[][];

	private static void bfs(int x) {

		Queue<Integer> qu = new LinkedList<>();
		boolean chk[] = new boolean[arr.length + 1];
		int cnt = 0;

		qu.add(x);
		while (!qu.isEmpty()) {
			int a = qu.poll();
			chk[a] = true; // 자기자신은 안가
			for (int i = 1; i < arr.length; i++) {

				if (arr[a][i] == 1 && !chk[i]) {
					chk[i] = true;
					cnt = arr[a][i] + 1;
					qu.add(i);
				}

			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ans = new ArrayList<>();

		int a = sc.nextInt();
		int b = sc.nextInt();

		arr = new int[a + 1][a + 1];

		for (int i = 0; i < b; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			arr[x][y] = 1;
			arr[y][x] = 1;

		}
		for (int i = 1; i < arr.length; i++) {

			bfs(i);
		}

	}

}
