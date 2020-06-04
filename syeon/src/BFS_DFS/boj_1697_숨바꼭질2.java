package BFS_DFS;

import java.util.*;

public class boj_1697_숨바꼭질2 {

	static class Node {
		int x;
		int cnt;

		public Node(int x, int cnt) {
			this.x = x;
			this.cnt = cnt;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int start = sc.nextInt();
		int des = sc.nextInt();

		Queue<Node> qu = new LinkedList<>();
		qu.add(new Node(start, 0));

		while (!qu.isEmpty()) {

			Node q = qu.poll();
			int x = q.x;
			int cnt = q.cnt;
			
			if (x == des) {
				System.out.println(cnt);
				break;
			}

			for (int i = 0; i < 3; i++) {
				qu.add(new Node(x - 1, cnt + 1));
				qu.add(new Node(x + 1, cnt + 1));
				qu.add(new Node(2 * x, cnt + 1));
			}

		}
	}

}
