package Programmers;

import java.util.*;

public class pr_2_쇠막대기_2 {
	public static int solution(String arrangement) {
		int answer = 0;

		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < arrangement.length(); i++) {
			if (arrangement.charAt(i) == '(') {// (들어오면 push
				st.push('(');
			} else {// ')'들어올 때
				if (st.peek() == '(' && arrangement.charAt(i - 1) == '(') { // 바로 앞에가 (고, stack에도 (가 있을 때
					// --> (( () 이렇게 들어왔을 떄
					st.pop(); // pop하고
					answer += st.size(); //stack의 size를 더해줌

				} else {
					st.pop();//그게 아닐 경우 
					answer += 1;//1만 더해줌
				}

			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		String s = "()(((()())(())()))(())";

		solution(s);
	}

}
