package Stack_Queue;

import java.util.*;

public class pr2_괄호변환 {
	public static String solution(String p) {
		String answer = "";
		Character arr[] = new Character[p.length() + 1];
		Stack<Character> st = new Stack<>();
		int idx = 0;

		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == '(') {
				st.push('(');
				idx++;
			} else if (!st.isEmpty() && st.peek() == '(' && p.charAt(i) == ')') {
				st.pop();
				arr[idx] = '(';
				arr[idx + 1] = ')';
				idx++;
			} else {
				st.push(')');
				idx++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		return answer;

	}

	public static void main(String[] args) {
		String p = "(()())()";
		String a = ")(";
		String q = "()))((()";// ()(())()
		solution(p);
	}

}
