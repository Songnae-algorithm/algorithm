package BFS_DFS;

import java.util.*;

public class boj_1759_암호만들기2 {
	// 10: 45 시작

	static LinkedList<String> list;
	static LinkedList<String> ans;
	static StringBuilder sb;
	static int a;

	private static void dfs(int cnt) {

		if (cnt == a) {// a e i o u 포함할 때

			// System.out.println(ans);

			String a = chk(ans);

			sb.append(a + "\n");

		} else {

			for (int i = 0; i < list.size(); i++) {
				if (ans.contains(list.get(i))) { // ans가 list 값을 가질 떄는 pass
					continue;
				}
				ans.add(list.get(i));// 아닐떄 넣기

				dfs(cnt + 1);
				ans.removeLast();
			}

		}

	}

	private static String chk(LinkedList<String> chk) {
		String str = "";

		int chkcnt = 0;

		for (int i = 0; i < chk.size(); i++) {
			if (chk.get(i).equals("a") || chk.get(i).equals("e") || chk.get(i).equals("i") || chk.get(i).equals("o")
					|| chk.get(i).equals("u")) {
				chkcnt++;
			}

		}

		if (chkcnt >= 1 && a - chkcnt >= 2) {
			for (int i = 0; i < chk.size(); i++) {
				str += chk.get(i);
			}

		}
		// System.out.println(chkcnt);
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();// 뽑을 갯수 input
		int b = sc.nextInt(); // 입력할개수

		list = new LinkedList<>();
		ans = new LinkedList<>();

		for (int i = 0; i < b; i++) {
			list.add(sc.next());
		}

		list.sort(null);

		sb = new StringBuilder();

		dfs(0);

		System.out.println(sb.toString());

	}

}
