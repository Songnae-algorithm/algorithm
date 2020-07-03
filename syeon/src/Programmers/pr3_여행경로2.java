package Programmers;

import java.util.*;

public class pr3_여행경로2 {
	public static String[] solution(String[][] tickets) {
		String[] answer = new String[tickets.length+1];

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

		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i][0].equals("ICN")) {// icn이랑 같을 때
				qu.add(tickets[i][1]);// at

				chk[i] = true;
				list.add(tickets[i][1]);

				while (!qu.isEmpty()) {
					String s = qu.poll(); // 꺼낸 값
					// System.out.println(s + "Ssss");

					for (int j = 0; j < tickets.length; j++) {

						if (chk[j] == false && tickets[j][0].equals(s)) {

							chk[j] = true;

							// System.out.println(tickets[j][0] + " " + tickets[j][1]);
							list.add(tickets[j][1]);
							qu.add(tickets[j][1]);
							break;//1번만 가야되용^^ 
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