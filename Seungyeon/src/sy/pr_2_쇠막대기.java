package sy;

import java.util.*;

public class pr_2_쇠막대기 {
	public static int solution(String arrangement) {
		int answer = 0;

		Stack<Character> st = new Stack<Character>();

		st.push(arrangement.charAt(0));
		for (int i = 1; i < arrangement.length(); i++) {
			if (arrangement.charAt(i) == '(') {
				st.push('(');
			} else {// )
				st.pop();
				if (arrangement.charAt(i - 1) == '(') {

					answer += st.size();
				} else if (arrangement.charAt(i - 1) == ')') {
					answer += 1;

				}

			}
		}

		System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {
		String st = "()(((()())(())()))(())";
		solution(st);
	}

}
