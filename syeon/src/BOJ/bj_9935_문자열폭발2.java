package BOJ;

import java.util.*;

public class bj_9935_���ڿ�����2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String comp = sc.next();

		Character arr[] = new Character[comp.length()];

		for (int i = 0; i < comp.length(); i++) {
			arr[i] = comp.charAt(i);

		}

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			st.add(s.charAt(i));
			if (s.charAt(i) == arr[0]) {// C�� �����Ҷ�

				for (int j = 1; j < comp.length(); j++) {
					if (s.charAt(i + 1) == arr[j]) {
						st.pop();
					}
					st.pop();

				}

			}

		}
		System.out.println(st);

	}

}
