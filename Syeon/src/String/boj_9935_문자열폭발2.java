package String;

import java.io.*;
import java.util.*;

public class boj_9935_문자열폭발2 {
	// 10:31 start
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String s = br.readLine();
		
		//Scanner 로 했더니 시간초과가 떳다...

		Stack<Character> st = new Stack<>();

		for (int i = str.length() - 1; i >= 0; i--) {// 입력 문자열의 끝에서부터 봐줌
			st.add(str.charAt(i));// 일단 다 넣음

			if (st.peek() == s.charAt(0) && st.size() >= s.length()) {// 스택 맨 위값과 이 비교값의 처음과 같으면
				boolean chk = true;

				for (int j = 0; j < s.length(); j++) {// for문을 돌려서 peek값과 같은지 체크
					if (st.get(st.size() - 1 - j) != s.charAt(j)) {// 다르면 false 로 해서 나옴!! st.get()으로 index처럼 쓸수있음 !!
						chk = false;
						break;
					}

				}
				if (chk == true) { // st 크기만큼 pop
					for (int j = 0; j < s.length(); j++) {
						st.pop();
					}

				}

			}
		}

		if (st.isEmpty()) {
			System.out.println("FRULA");
			
		} else {
			int size = st.size();// 스택사이즈가 계속 줄어서 그런지...바로 for문에 size로 넣어줬더니 출력이 제대로 안됬다.
			for (int i = 0; i < size; i++) {
				System.out.print(st.pop());
			}
		}

	}

}
