package Permutation;

import java.util.*;

public class boj_15650_n과m2 {

	static int n;
	static int m;
	static LinkedList<Integer> num;
	static StringBuilder sb;

	private static void perm(int count) {

		if (count == m) {

			for (int i : num) {
				sb.append(i + " ");
			}
			sb.append("\n");
		}

		for (int i = 1; i <= n; i++) {
			if (num.contains(i)) {
				continue;
			}
			if (!num.isEmpty() && num.getLast() > i) {
				continue;
			}

			num.add(i);

			perm(count + 1);
			num.removeLast();

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		num = new LinkedList<>();
		sb = new StringBuilder();

		perm(0);
		System.out.println(sb.toString());
	}
}
