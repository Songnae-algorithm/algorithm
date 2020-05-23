package Programmers;

import java.util.*;

public class pr2_쇠막대기3 {

	public static int solution(String arrangement) {
		int answer = 0;

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < arrangement.length(); i++) {
			if (arrangement.charAt(i) == '(') { // '(' 들어오면 무조건 push
				st.push('(');
				// ')'가 들어올 때.

			} else {
				if (st.peek() == '(' && arrangement.charAt(i - 1) == '(') {

					// )가 들어오고, peek가 (이고, charAt(i-1)도 (일 때 --> ()이렇게 될 때
					st.pop();
					answer += st.size();// 그건 pop하고 st 크기를 더해줌
				} else {

					// 문자열은 ))인데, peek 값은 ( 일 때
					st.pop();
					answer += 1;

				}
			}
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		solution("()(((()())(())()))(())");
	}

}
