package Permutation;

import java.util.*;

public class boj_15657_n과m8 {

	static int n;
	static int m;
	static LinkedList<Integer> num;
	static LinkedList<Integer> list;
	static StringBuilder sb;

	private static void perm(int count) {
		if (count == m) {
			for (int i = 0; i < m; i++) {
				sb.append(num.get(i) + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < n; i++) {
			if (!num.isEmpty() && num.getLast() > list.get(i)) {

			
				continue;
			}
			num.add(list.get(i));
			perm(count + 1);
			num.removeLast();

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		num = new LinkedList<Integer>();
		list = new LinkedList<Integer>();
		sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		list.sort(null);

		perm(0);

		System.out.println(sb.toString());
	}
}
