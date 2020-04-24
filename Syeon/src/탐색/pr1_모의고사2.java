package 탐색;

import java.util.*;

public class pr1_모의고사2 {
//4/24 01:03 - 01:25
	

	public static int[] solution(int[] answers) {

		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> anslist = new ArrayList<>();

		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int c[] = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int cnta = 0;
		int cntb = 0;
		int cntc = 0;

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == a[i % 5]) {
				cnta++;
			}
			if (answers[i] == b[i % 8]) {
				cntb++;
			}
			if (answers[i] == c[i % 10]) {
				cntc++;
			}

		}
		list.add(cnta);
		list.add(cntb);
		list.add(cntc);

		int max = Collections.max(list); // list에서 최댓값을 가져오는 방법

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) >= max) {
				anslist.add(i + 1);
			}
		}

		int answer[] = new int[anslist.size()];
		for (int i = 0; i < anslist.size(); i++) {
			answer[i] = anslist.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5 };
		// solution(arr1);

		int arr2[] = { 1, 3, 2, 4, 2 };
		solution(arr2);
	}

}
