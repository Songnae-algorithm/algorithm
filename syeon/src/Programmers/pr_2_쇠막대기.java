package Programmers;

import java.util.*;

public class pr_2_쇠막대기 {
	public static int solution(String arrangement) {
		int answer = 0;

		Stack<Character> st = new Stack<Character>();//스택선언

		st.push(arrangement.charAt(0));//스택에 첫번째 문자 넣음(  '('이게 들어옴)
		for (int i = 1; i < arrangement.length(); i++) {
			if (arrangement.charAt(i) == '(') {//만약 두번째 문자가 '('면 
				st.push('(');//스택에 추가
			} else {// 만약 ')'면
				st.pop();//앞에있던 '('를 Pop 해줌
				if (arrangement.charAt(i - 1) == '(') {// pop한 후 ')'앞의 문자가 '('면, 레이저를 의미하므로, 스택의 사이즈를 리턴

					answer += st.size();
				} else if (arrangement.charAt(i - 1) == ')') { //pop한 후 ')'앞의 문자가 ')'면 레이저가 아니니까 1 더해줌
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
