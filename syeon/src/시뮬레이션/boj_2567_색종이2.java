package 시뮬레이션;

import java.util.*;

public class boj_2567_색종이2 {
	static int cnt = 0;

	public static void main(String[] args) {
		// 5/15 12:40-13:06

		int arr[][] = new int[101][101];

		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();

		for (int i = 0; i < in; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {

					arr[j][k] = 1;

				}

			}
		} // in

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				if (arr[i][j] == 1) {

//					qu.add(new Node(i, j));
//
//					while (!qu.isEmpty()) {
//
//						Node p = qu.poll();
//						int x = p.x;
//						int y = p.y;

					int dx[] = { -1, 1, 0, 0 };
					int dy[] = { 0, 0, 1, -1 };

					for (int k = 0; k < 4; k++) {

						int nx = i + dx[k];
						int ny = j + dy[k];

						if (arr[nx][ny] == 0 || nx < 0 || nx > 100 || ny < 0 || ny > 100) {
							cnt++;
						}

					}

				}
			}
		}
		System.out.println(cnt);

	}

}
