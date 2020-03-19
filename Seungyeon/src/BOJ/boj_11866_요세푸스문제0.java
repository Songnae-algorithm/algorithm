package BOJ;

import java.util.*;

public class boj_11866_요세푸스문제0 {

	// 12:14 -30 //근데 왜 안맞는지 몰겠음__

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt() - 1;

		Queue<Integer> qu = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			qu.add(i);
		}

		System.out.print("<");
		while (qu.size() > k) {
			for (int i = 0; i < k; i++) {
				int a = qu.poll();
				qu.add(a);
			}
			int front = qu.poll();
			System.out.print(front + ", ");
		}

		while (!qu.isEmpty()) {
			list.add(qu.poll());
		}

		for (int i = 0; i < list.size() - 1; i++) {

			System.out.print(list.get(i) + ", ");
		}
		System.out.print(list.get(list.size() - 1) + ">");

	}
}
