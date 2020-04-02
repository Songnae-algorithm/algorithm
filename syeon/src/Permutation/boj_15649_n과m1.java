package Permutation;

import java.util.*;

public class boj_15649_n과m1 {

	static int n;
	static int m;
	static LinkedList<Integer> num;
	static StringBuilder sb;

	private static void perm(int count) {

		if (count == m) {// count 가 m개일 때는 여기루 드러감
			for (int i : num) {
				sb.append(i + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (num.contains(i)) { // 이 문제는 1,1 은 포함하지 않기 떄문에
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
