package String;

import java.util.*;

public class boj_9935_문자열폭발 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String s = sc.next();

		Stack<Character> st = new Stack<>();

		// 끝에서부터 봐주는 거 기억하기 + stack 사용 !!
		for (int i = str.length(); i >= 0; i--) {
			st.add(str.charAt(i));
			st.contains(s);
		}
	}

}
