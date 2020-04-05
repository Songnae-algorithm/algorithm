package sort;

import java.util.*;

public class pr3_여행경로2 {

	public static String[] solution(String[][] tickets) {
		String[] answer = {};

		Arrays.sort(tickets, new Comparator<String[]>() {

			public int compare(String a[], String b[]) {
				if (a[1].charAt(0) == b[1].charAt(0)) {
					return a[0].charAt(0) - b[0].charAt(0);
				} else {
					return a[1].charAt(0) - b[1].charAt(0);
				}
			}
		});

		boolean chk[] = new boolean[tickets.length];
		Queue<String> qu = new LinkedList<>();
		ArrayList<String> list = new ArrayList<>();
		int cnt = 1;
		list.add("ICN");

		for (int i = 0; i < tickets.length; i++) {

			if (tickets[i][0].equals("ICN")) {
				qu.add(tickets[i][1]);
				chk[i] = true;
				list.add(tickets[i][1]);

				while (!qu.isEmpty()) {

					String str = qu.poll();

					for (int j = 0; j < tickets.length; j++) {

						if (tickets[j][0].equals(str) && chk[j] == false) {
							qu.add(tickets[j][1]);

							list.add(tickets[i][1]);
							cnt++;
							chk[j] = true;
							System.out.println(tickets[i][0] + "     " + tickets[i][1]);
						}
					}
				}

			}
		}
		System.out.println(list);
		return answer;

	}

	public static void main(String[] args) {
		String arr[][] = { { "ICN", "JFK" }, { "HND", "IAD" }, { "JFK", "HND" } };

		String arr2[][] = { { "ICN", "SFO" }, { "ICN", "ATL" }, { "SFO", "ATL" }, { "ATL", "ICN" }, { "ATL", "SFO" } };
		solution(arr2);
	}

}
