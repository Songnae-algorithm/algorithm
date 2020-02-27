package BOJ;

import java.util.*;

public class boj_1697_숨바꼭질 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		boolean[] check = new boolean[100001];
		int[] cnt = new int[100001];

		check[a] = true;// 수빈이가 방문한 곳 true로
		cnt[a] = 0;

		Queue<Integer> q = new LinkedList<Integer>();

		q.add(a);

		while (!q.isEmpty()) {
			int x = q.poll();
//			System.out.println(x);
//			System.out.println(cnt[x]);

			if (0 <= x - 1 && check[x - 1] == false) {
				q.add(x - 1);
				check[x - 1] = true;

				cnt[x - 1] = cnt[x] + 1;

			}
			if (x + 1 < 10000 && check[x + 1] == false) {
				q.add(x + 1);
				check[x + 1] = true;

				cnt[x + 1] = cnt[x] + 1;
			}
			if (x * 2 < 10000 && check[x * 2] == false) {
				q.add(x * 2);
				check[x * 2] = true;
				cnt[x * 2] = cnt[x] + 1;
			}

		}
		System.out.println(cnt[b]);

	}
}
