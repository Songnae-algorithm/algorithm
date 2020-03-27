package Prog;

import java.util.*;

public class pr3_������2 {
	public static String[] solution(String[][] tickets) {
		String[] answer = new String[tickets.length+1];

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
					// System.out.println(s + "Ssss");

					for (int j = 0; j < tickets.length; j++) {

						if (chk[j] == false && tickets[j][0].equals(s)) {

							chk[j] = true;

							// System.out.println(tickets[j][0] + " " + tickets[j][1]);
							list.add(tickets[j][1]);
							qu.add(tickets[j][1]);
							break;//1���� ���ߵǿ�^^ 
						}
					}
				}
			}
		}

		System.out.println(list);
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		String arr[][] = { { "ICN", "JFK" }, { "HND", "IAD" }, { "JFK", "HND" } };

		String arr2[][] = { { "ICN", "SFO" }, { "ICN", "ATL" }, { "SFO", "ATL" }, { "ATL", "ICN" }, { "ATL", "SFO" } };
		
		String arr3[][]= {{"ICN", "COO"}, {"ICN", "BOO"}, {"COO", "ICN"}, {"BOO", "DOO"}};
		solution(arr3);

	}

}
