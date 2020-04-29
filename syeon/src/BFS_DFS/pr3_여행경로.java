package BFS_DFS;

import java.util.*;

//class node {
//	String start;
//	String end;
//
//	node(String start, String end) {
//		this.start = start;
//		this.end = end;
//
//	}
//}

public class pr3_여행경로 {
	public static String[] solution(String[][] tickets) {
		String[] answer = new String[tickets.length];

		ArrayList<String> list = new ArrayList<>();
		boolean chk[] = new boolean[tickets.length];

		Arrays.sort(tickets, new Comparator<String[]>() {
			// Override된 compare 함수를 어떻게 정의하냐에 따라서 다양한 정렬이 가능해집니다
			@Override
			public int compare(String[] o1, String[] o2) {
				if (o1[1].charAt(0) > o2[1].charAt(0))
					return 1;
				else
					return -1;
				// 내림자순 정렬을 하고 싶다면 o2와 o1의 위치를 바꿔줍니다
				// return o2[1] - o1[1];
			}
		});

		Queue<String> qu = new LinkedList<>();
		list.add("ICN");
		int cnt = 0;

		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i][0].equals("ICN")) {// icn이랑 같을 때
				qu.add(tickets[i][1]);// at

				chk[i] = true;
				list.add(tickets[i][1]);

				while (!qu.isEmpty() && cnt != tickets.length) {
					String s = qu.poll(); // 꺼낸 값

					for (int j = 0; j < tickets.length; j++) {

						if (tickets[j][0].equals(s) && chk[j] == false) {

							chk[j] = true;

							list.add(tickets[j][1]);
							qu.add(tickets[j][1]);
							cnt++;
						}
					}
				}
			}
		}

		for (int i = 0; i < answer.length; i++) {
			answer[i] += list.get(i);
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