package Boj;

import java.util.*;

public class boj_9012_괄호 {
//11;41 시작
	//11:58 끝
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();

		for (int i = 0; i < in; i++) {
			String s = sc.next();

			Stack<Character> st = new Stack<>();

			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '(') {// (들어오면 add
					st.add('(');
				} else if (!st.isEmpty() && st.peek() == '(' && s.charAt(j) == ')') {// 스택에 (이 있고 다음 들어갈게 )면
					st.pop();
				} else if (st.isEmpty() && s.charAt(j) == ')') {
					st.add(')');

				}
			}
			if (st.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} // for

	}
}
