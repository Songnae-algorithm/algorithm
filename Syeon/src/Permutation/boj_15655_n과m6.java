package Permutation;

import java.util.*;

public class boj_15655_n과m6 {

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
		}

		for (int i = 0; i < n; i++) {
			if (num.contains(list.get(i)) || !num.isEmpty()&&list.get(i) < num.getLast()) {
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
		list = new LinkedList<Integer>();
		num = new LinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		sb = new StringBuilder();

		list.sort(null);
		
		perm(0);

		System.out.println(sb.toString());

	}

}
