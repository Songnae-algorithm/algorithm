package Permutation;

import java.util.*;
//13:55 시작

public class boj_1759_암호만들기 {

	static int m;
	static int n;
	static LinkedList<String> list;
	static LinkedList<String> num;
	static LinkedList<String> ans;
	static StringBuilder sb = new StringBuilder();
	static String s = "aeiou";

//	private static LinkedList<String> chk(LinkedList<String> chk) {// <문자형
//
//		int cnt = 0;
//		for (int i = 0; i < chk.size(); i++) {
//			if (chk.contains(s)) {
//				if (!chk.get(i).contains(s)) {
//					cnt++;
//				}
//
//			}
//
//		}
//		if (cnt >= 2) {
//
//			return chk;
//
//		}
//		return null;
//
//	}

	private static void perm(int count) {

		if (count == m) {
			int cnt = 0;
			for (int i = 0; i < num.size(); i++) {

				for (int j = 0; j < s.length(); j++) {
					if (!num.contains(s.charAt(j))) {
						cnt++;

					}
				}

			}
			for (int i = 0; i < num.size(); i++) {
				if (s.contains(num.get(i)) && cnt >= 2) {

					for (int k = 0; k < m; k++) {

						sb.append(num.get(k));

					}
					sb.append("\n");
					// }
				}

			}
			// }
			// }
			// }

		}
		for (

				int i = 0; i < list.size(); i++) {
			if (num.contains(list.get(i)) || !num.isEmpty() && list.get(i).charAt(0) < num.getLast().charAt(0)) {
				// 중복안됨 //비어있을때는 넣어야하니까!!

				continue;
			}

			num.add(list.get(i));
			perm(count + 1);
			num.removeLast();

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();// 4
		n = sc.nextInt();// 6

		list = new LinkedList<>();
		num = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			String s = sc.next();

			list.add(s);
		}

		list.sort(null);

		perm(0);
		System.out.println(sb.toString());

	}

}
