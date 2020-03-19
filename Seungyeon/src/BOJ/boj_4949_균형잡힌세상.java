package BOJ;

import java.util.*;

public class boj_4949_균형잡힌세상 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String s = sc.nextLine();
			if (s.equals(".")) {
				break;
			}

			Stack<Character> st = new Stack<>();

			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) == '(') { // (들어오면 입력
					st.add('(');

				} else if (s.charAt(i) == '[') {
					st.add('[');

				} else if (s.charAt(i) == ']') {
					if(!st.isEmpty() && st.peek() == '[')
						st.pop();
					else {
						st.add(']');
						break;
					}

				} else if (s.charAt(i) == ')') {
					if(!st.isEmpty() && st.peek() == '(')
						st.pop();
					else {
						st.add(')');
						break;
					}
				}
			}

			if (st.isEmpty()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		} // while

	}

}
