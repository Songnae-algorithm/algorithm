package BFS_DFS;

import java.util.*;

public class pr3_여행경로4 {

	static LinkedList<String> list = new LinkedList<>();

	private static void dfs(String[][] tickets, String s, String last, boolean[] chk, int cnt) {

		s += ","+last;

		if (cnt == tickets.length) {

			list.add(s);
		}

		for (int i = 0; i < tickets.length; i++) {
			if (!chk[i] && tickets[i][0].equals(last)) {
				chk[i] = true;
				last = tickets[i][1];
				dfs(tickets, s, last, chk, cnt + 1);
				chk[i] = false;

			}
		}

	}

	public static String[] solution(String[][] tickets) {

		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i][0].equals("ICN")) {
				boolean chk[] = new boolean[tickets.length];
				String s = "";
				chk[i] = true;
				s += "ICN";
				String last = tickets[i][1];

				dfs(tickets, s, last, chk, 1);
			}
		}
		list.sort(null);

		return list.get(0).split(",");
	}

	public static void main(String[] args) {

//		String arr[][] = { { "ICN", "JFK" }, { "HND", "IAD" }, { "JFK", "HND" } };
//		solution(arr);

		String arr2[][] = { { "ICN", "SFO" }, { "ICN", "ATL" }, { "SFO", "ATL" }, { "ATL", "ICN" }, { "ATL", "SFO" } };

		solution(arr2);
	}

}
