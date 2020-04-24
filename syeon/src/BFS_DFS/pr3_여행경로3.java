package BFS_DFS;

import java.util.*;

public class pr3_여행경로3 {

	static ArrayList<String> list = new ArrayList<>();

	private static void dfs(String[][] tickets, String str, String last, boolean chk[], int cnt) {

		str += last + " ";

		if (cnt == tickets.length) {
			list.add(str);
		}

		// 문제 -> SFO에서 넘어갈 때,,,,,두개가 true가 되는것이 문제다.
		for (int i = 0; i < tickets.length; i++) {
			if (!chk[i] && tickets[i][0].equals(last)) {

				chk[i] = true;

				last = tickets[i][1];
				// list.add(last);
				dfs(tickets, str, last, chk, cnt + 1);
				chk[i] = false;
			}
		}

	}

	public static String[] solution(String[][] tickets) {
		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i][0].equals("ICN")) {
				boolean chk[] = new boolean[tickets.length];
				String str = "";
				chk[i] = true;
				str += "ICN ";
				String last = tickets[i][1];
				dfs(tickets, str, last, chk, 1);

			}
		}

		list.sort(null);

		return list.get(0).split(" ");
	}

	public static void main(String[] args) {

//		String arr[][] = { { "ICN", "JFK" }, { "HND", "IAD" }, { "JFK", "HND" } };
//		solution(arr);

		String arr2[][] = { { "ICN", "SFO" }, { "ICN", "ATL" }, { "SFO", "ATL" }, { "ATL", "ICN" }, { "ATL", "SFO" } };

		solution(arr2);
	}

}
