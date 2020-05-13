package Programmers;

import java.util.*;

public class pr1_실패율_미완_맵정렬 {
	public static int[] solution(int N, int[] stages) {
		// 5/5 10:02- 틀림. 그러나 혹시 해쉬맵 정렬떄...

		int[] answer = new int[N];

		HashMap<Integer, Double> map = new HashMap<>();
		int notclear = 0;
		int clear = 0;
		for (int i = 1; i <= N; i++) {
			double fail = 0;
			clear = 0;
			notclear = 0;
			
			for (int j = 0; j < stages.length; j++) {

				if (i == stages[j]) {
					notclear++;// 클리어X

				}
				if (i <= stages[j]) {
					clear++;// 클리어 X

				}

			}

			if (notclear != 0 && clear != 0) {
				
				fail = (double) notclear / clear;
				//System.out.println(notclear);
			} // notclear ==0 이면 이미 fail은 0임

			map.put(i, fail);

		}

		// 여기서 정렬.

		Iterator it = pr1_실패율.sortByValue(map).iterator();

		System.out.println("---------sort 후------------");
		while (it.hasNext()) {
			Integer temp = (Integer) it.next();
			System.out.println(temp + " = " + map.get(temp));
		}
		// System.out.println(list);

		return answer;

	}

	public static List sortByValue(final Map map) {
		List<Integer> list = new ArrayList();
		list.addAll(map.keySet());

		Collections.sort(list, new Comparator() {

			public int compare(Object o1, Object o2) {
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);
				

				return ((Comparable) v1).compareTo(v2);
			}

		});
		Collections.reverse(list); // 주석시 오름차순
		return list;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 2, 6, 2, 4, 3, 3 };
		solution(5, arr);
	}

}
