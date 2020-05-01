package Programmers;

import java.util.*;

public class pr1_제일작은수제거하기2 {
	public static int[] solution(int[] arr) {
		int answer[];
		int min = Integer.MAX_VALUE;
		int idx = 0; //min값의 index 저장 
 
		ArrayList<Integer> list = new ArrayList<>();
		// 4/30 19:43 - 20:00 ㅠ 
		if (arr.length != 1) {
			answer = new int[arr.length - 1];
		}

		else {
			answer = new int[1];
			answer[0] = -1;
			return answer;

		}

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
			if (min > arr[i]) {
				min = arr[i];
				idx = i;
			}
		}
		list.remove(idx);

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);

		}

		return answer;
	}

	/*
	 * int[] answer = {}; 
	 * if (arr.length == 1) 
	 * { answer = new int[] { -1 };
	 * 이렇게 써도 됨 
	 * 
	 */

	public static void main(String[] args) {
		int arr[] = { 4, 3, 2, 1 }; // [4,3,2]

		solution(arr);
		int arr1[] = { 10 };
		solution(arr1);
	}

}
