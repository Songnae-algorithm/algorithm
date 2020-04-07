package String;

import java.util.*;

public class pr_짝지어제거하기 {

	public static int solution(String s) {
		int answer = 0;

		Stack<Character> st = new Stack<>();

		for (int i = s.length() - 1; i >= 0; i--) {

			if (!st.isEmpty() && st.peek() == s.charAt(i)) { // 비어있지 않고, 꼭대기 값과 같으면
				st.pop();
			} else {
				st.add(s.charAt(i));//아닐떄는 무조건 넣음. 비어있을때도 !!!! 

			}

		}

		if (st.isEmpty()) {
			answer = 1;
		}
		return answer;

	}

	public static void main(String[] args) {
		String s = "baabaa";

		solution("cdcd");

	}
}
