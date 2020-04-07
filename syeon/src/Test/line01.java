package Test;

import java.util.Stack;

public class line01 {

	public static int solution(String inputString) {
		int answer = 0;

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < inputString.length(); i++) {

			if (inputString.charAt(i) == '(') { // (들어오면 입력
				st.add('(');

			} else if (inputString.charAt(i) == '[') {// [ 들어오면 입력
				st.add('[');

			} else if (inputString.charAt(i) == '{') {// [ 들어오면 입력
				st.add('{');

			} else if (inputString.charAt(i) == '<') {// [ 들어오면 입력
				st.add('<');

			}

			else if (inputString.charAt(i) == ']') {
				if (!st.isEmpty() && st.contains('[')) { //마지막게 아니고 포함 !!!!! 

					int idx = st.indexOf('['); // stack 의 인덱스를 가져와서 제거
					st.remove(idx);
					answer++;
				} else {
					st.add(']');
					break;
				}

			} else if (inputString.charAt(i) == ')') {
				if (!st.isEmpty() && st.contains('(')) {
					int idx = st.indexOf('(');
					st.remove(idx);
					answer++;
				} else {
					st.add(')');
					break;
				}
			} else if (inputString.charAt(i) == '}') {
				if (!st.isEmpty() && st.contains('{')) {
					int idx = st.indexOf('{');
					st.remove(idx);

					answer++;
				} else {
					st.add('}');
					break;
				}
			} else if (inputString.charAt(i) == '>') {
				if (!st.isEmpty() && st.contains('<')) {
					int idx = st.indexOf('<');
					st.remove(idx);
					answer++;
				} else {
					st.add('>');
					break;
				}
			}

		}

		if (!st.isEmpty()) {
			answer = -1;
		}

		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		String s = "Hello, world!";
		String s1 = "line [plus]";
		String s2 = "if (Count of eggs is 4.) {Buy milk.}";
		String s3 = ">_<";
		String s4 = "{(})";

		solution(s4);
	}

}
