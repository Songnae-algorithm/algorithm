package review;

import java.util.*;

public class pr_2_올바른괄호2 {
	static boolean solution(String s) {

		Stack<String> st = new Stack<String>();

		boolean answer = true;

//		if (s.charAt(0) == ')') {
//			answer = false;
//		}
//		
//없어도 되는 코드... 왜냐면 밑에서 해주기 때문

		for (int i = 0; i < s.length(); i++) {
			// ( 들어옴

			if (s.charAt(i) == '(') {
				st.push("(");

			} else {

				if (st.isEmpty()) {// ())인 경우 그냥 pop하면 오류
					answer = false;
				}

				else {
					st.pop();// 비어있지 않을 때 -> 앞에 (가 있을때만 pop 해줌
				}

			}

		}
		if (!st.isEmpty())

		{
			answer = false;
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {

		String st = "(())()";
		solution(st);

		String st2 = "(())()";
		solution(st2);

		String st3 = "(()(";
		solution(st3);

	}

}
