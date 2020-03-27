
package Boj;

import java.util.*;

public class bj_9935_문자열폭발 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		StringBuffer s1 = new StringBuffer(s);

		String comp = sc.next();

		int leng = comp.length(); // comp 길이

		while (s.contains(comp)) {
			if (s.contains(comp)) {
				int idx = s.indexOf(comp);

				s = s1.delete(idx, idx + leng).toString();
				// 내가 replace 안된이유...다시 s 에 집어넣어줘야지...ㅠㅠㅠ
				// s=s.replace(comp,""); 이렇게 쓰기.. 근데 어짜피 이것도 메모리초과
			}

		}
		if (s.equals("")) {
			System.out.println("FRULA");
		} else
			System.out.println(s);
	}
}

