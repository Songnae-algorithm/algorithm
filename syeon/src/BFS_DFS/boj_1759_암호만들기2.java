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
			String s ="";
			for(String k : ans)
				s+=k;
			
			int v_size = chk(s);

			sb.append(a + "\n");

		} 
		else {
			//bCa
			for (int i = 0; i < list.size(); i++) {
				if (ans.contains(list.get(i))) { // ans가 list 값을 가질 떄는 pass
					continue;
				}
				//ans가 empty가 아니면서, i가 커야함!
				if(!ans.isEmpty()&&i <= list.indexOf(ans.getLast()))
					continue;
				
				ans.add(list.get(i));// 아닐떄 넣기=
				dfs(cnt + 1);
				ans.removeLast();
			}

		}

	}

	private static int chk(String s) {
		String str = "aeiou";

		int chkcnt = 0;

		for (int i = 0; i < s.length(); i++) {
			//str.contaion (s)
			//cnt++;

		}

		if (chkcnt >= 1 && a - chkcnt >= 2) {
			for (int i = 0; i < chk.size(); i++) {
				str += chk.get(i);
			}

		}
		// System.out.println(chkcnt);
		return chkcnt;
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
