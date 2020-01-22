package sy;

import java.util.*;

public class pr_2_올바른괄호 {

	static boolean solution(String s) {
		boolean answer = true;

		Stack<Character> st = new Stack<Character>();

		if (s.charAt(0) == ')') { //처음에 ')'가 들어오면 false
			return false;
		}
		
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {//문자가 '('면 

				st.push('(');//스택에 push
				
			System.out.println(st);
			} else if (s.charAt(i) == ')') {//다음 문자가 ')'일 경우에 ***push 안함. 그냥 pop만 해서 '('를 빼줌 
				
				
				if (st.isEmpty()) {
					//스택이 비어있다면 false. 왜나면 ())이 입력될 경우
					//'('는 push하고 다음이 ')'일 때  pop을 하면서 '('가 사라지기 때문. 그럼 스택이 비고, 올바르지 않게 됨
					return false;
					
				} else {
					st.pop();
				}

			}
		}

		if (!st.isEmpty())//이 과정을 다 하고도 스택이 비어있다면 false

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
