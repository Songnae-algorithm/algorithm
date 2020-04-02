package Permutation;

import java.util.*;

public class boj_15651_n과m3 {
	static int n;
	static int m;
	static LinkedList<Integer> num;
	static StringBuilder sb;

	private static void perm(int count) {

		if (count == m) {
			for (int i : num) { // i
				sb.append(i + " ");

			}
			sb.append("\n");
			return;  //return 해 주 기 ! ! 
		}

		for (int i = 1; i <= n; i++) {

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
