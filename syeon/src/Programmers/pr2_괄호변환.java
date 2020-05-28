package Programmers;

import java.util.*;

public class pr2_괄호변환 {

	public static String solution(String p) {

		// 5/25 17:52-

		return sep(p);

	}

	private static String sep(String s) {

		if (s.length() == 0)
			return "";

		int idx = 0;

		int left = 0;// (갯수
		int right = 0; // )갯수

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {
				left++;

			}
			if (s.charAt(i) == ')') {
				right++;

			}

			if (left != 0 && right != 0 && left == right) {

				idx = i;

				break;

			}

		}

		String u = s.substring(0, idx + 1); // substring은 맨 마지막 부분을 포함 안하니까 idx~i까지 짜르려면 i+1로 짤라야 함.
		String v = s.substring(idx + 1, s.length());

		// System.out.println(v);

		boolean rightu = right(u); // 올바른 괄호인지 판단

		if (!rightu) {
			// false면 u 앞뒤에 ( ) 붙이고 안에를 뒤집음

			String ans = "(" + sep(v) + ")";

			// u의 앞뒤 자르고 뒤집기
			u = u.substring(1, u.length() - 1);
			StringBuffer sb = new StringBuffer();
			// 첨에 걍 reverse 해서 틀렸다 12~23까지

			for (int i = 0; i < u.length(); i++) {
				if (u.charAt(i) == '(') {
					sb.append(')');

				} else {
					sb.append('(');

				}
			}
			return ans + sb.toString();
			// ans에 붙이기

		} else {
			// 올바른 문자열이면
			return u + sep(v);

		}

	}

	private static boolean right(String str) {

		boolean chk = false;

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				st.push('(');
			} else if (!st.isEmpty() && str.charAt(i) == ')' && st.peek() == '(') {
				st.pop();
				// (들어오고 st의 바로 앞에가 (면 pop
			} else if (st.isEmpty() && str.charAt(i) == ')') {
				st.add(')');

			}
		}
		if (st.isEmpty()) {
			chk = true;
		}

		return chk;

	}

	public static void main(String[] args) {
		solution("()))((()"); // ()(())()
		// solution(")(");

	}

}
