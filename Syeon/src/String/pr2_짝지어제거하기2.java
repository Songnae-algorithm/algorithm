package String;

import java.util.*;

public class pr2_짝지어제거하기2 {

	public static int solution(String s) {
		int answer = 0;

		Stack<Character> st = new Stack<>();

		for (int i = s.length()-1; i >= 0; i--) {
			if (st.isEmpty()) { // st이 비어있으면 넣음
				st.push(s.charAt(i));
			} else if (!st.isEmpty() && st.peek() == s.charAt(i)) { // 비어있지 않고, 꼭대기값이 지금 넣을거랑 같으면
				st.pop();

			}

		}
		if (st.isEmpty()) {
			answer = 1;
		}
		System.out.println(answer);

		return answer;
	}

	public static void main(String[] args) {

		String s = "dcdc";
		solution(s);

	}

}
