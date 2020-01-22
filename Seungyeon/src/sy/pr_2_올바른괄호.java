package sy;

import java.util.*;

public class pr_2_올바른괄호 {

	static boolean solution(String s) {
		boolean answer = true;

		Stack<Character> st = new Stack<Character>();

		if (s.charAt(0) == ')') { //처음에 )가 들어오면 false
			return false;
		}
		
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {

				st.push('(');
				
			System.out.println(st);
			} else if (s.charAt(i) == ')') {
				if (st.isEmpty()) {
					return false;
					
				} else {
					st.pop();
				}

			}
		}

		if (!st.isEmpty())

		{
			answer = false;
		}

		return answer;

	}

	public static void main(String[] args) {

		String st = "(())()";
		solution(st);

	}

}
