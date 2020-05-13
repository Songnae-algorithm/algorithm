package Stack_Queue;

import java.util.*;

public class pr2_탑 {

	public static int[] solution(int[] heights) {

		// 5/12 12:45 -

		LinkedList<Integer> list = new LinkedList<>();

		for (int i = heights.length - 1; i >= 1; i--) {

			for (int j = i - 1; j >= 0; j--) {
				if (heights[i] < heights[j]) {
					list.add(j + 1);
					break;

				}
				if (j == 0) {
					list.add(0);// j가 0이 될 때까지 값이 없으면(맨 끝까지 가도 큰 게 없으면) 0넣기
				}

			}

		}
		list.add(0);// 0번쨰는 무조건 0

		int[] answer = new int[list.size()];
	

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(list.size() - 1 - i);
			
		}

		// System.out.println(list);
		return answer;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 6, 7, 6, 5 };
		solution(arr);

	}
}
