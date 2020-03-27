package Prog;

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

public class pr3_������ {
	public static String[] solution(String[][] tickets) {
		String[] answer = new String[tickets.length];

		ArrayList<String> list = new ArrayList<>();
		boolean chk[] = new boolean[tickets.length];

		Arrays.sort(tickets, new Comparator<String[]>() {
			// Override�� compare �Լ��� ��� �����ϳĿ� ���� �پ��� ������ ���������ϴ�
			@Override
			public int compare(String[] o1, String[] o2) {
				if (o1[1].charAt(0) > o2[1].charAt(0))
					return 1;
				else
					return -1;
				// �����ڼ� ������ �ϰ� �ʹٸ� o2�� o1�� ��ġ�� �ٲ��ݴϴ�
				// return o2[1] - o1[1];
			}
		});

		Queue<String> qu = new LinkedList<>();
		list.add("ICN");

		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i][0].equals("ICN")) {// icn�̶� ���� ��
				qu.add(tickets[i][1]);// at

				chk[i] = true;
				list.add(tickets[i][1]);

				while (!qu.isEmpty()) {
					String s = qu.poll(); // ���� ��

					for (int j = 0; j < tickets.length; j++) {

						if (tickets[j][0].equals(s) && chk[j] == false) {

							chk[j] = true;
							
							list.add(tickets[j][1]);
							qu.add(tickets[j][1]);

						}
					}
				}
			}
		}

		for(int i=0;i<answer.length;i++) {
			answer[i]+=list.get(i);
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
