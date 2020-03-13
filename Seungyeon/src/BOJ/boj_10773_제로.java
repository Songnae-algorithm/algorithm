package BOJ;

import java.util.*;

public class boj_10773_제로 {
	// 11:21
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < in; i++) {
			int a = sc.nextInt();

			if (a != 0) {
				st.add(a);
			} else if (a == 0) {
				st.pop();
			}
			System.out.println(st);
		}

		int answer = 0;

		while (!st.isEmpty()) {

			answer += st.pop();
		}
		System.out.println(answer);
	}
}
