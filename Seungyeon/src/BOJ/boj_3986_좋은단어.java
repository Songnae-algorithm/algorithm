package BOJ;

import java.util.*;

public class boj_3986_좋은단어 {
	public static void main(String[] args) {
		int answer = 0;

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {

			String s = sc.next();

			Stack<Character> st = new Stack<>();

			st.add(s.charAt(0));//먼저 0번째거 넣어주기
			for (int j = 1; j < s.length(); j++) {

				if (!st.isEmpty() && st.peek() == s.charAt(j)) {
					//!!!!!!!!!!!!!!!!!!!!!!!!!st.isEmpty() 꼭 해 주 기 !!!! 
					//peek() 맨 꼭대기값 가져오기만 할때
					st.pop();
					
				} else {
					st.add(s.charAt(j));

				}
			}

			if (st.isEmpty()) {
				answer++;

			}
		}

		System.out.println(answer);
	}

}
