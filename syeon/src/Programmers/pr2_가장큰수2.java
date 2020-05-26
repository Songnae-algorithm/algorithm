package Programmers;

import java.util.*;

public class pr2_가장큰수2 {
	static int n;
	static int m;
	static LinkedList<Integer> num = new LinkedList<>();
	static LinkedList<Integer> list = new LinkedList<>();
	static int max = Integer.MIN_VALUE;

	public static String solution(int[] numbers) {
		// 5/26
		String answer = "";
		n = numbers.length;
		m = numbers.length;

		boolean perChk[] = new boolean[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}

		perm(m, 0, num, perChk);

		answer += max;
		System.out.println(answer);
		return answer;
	}

	private static void perm(int m, int count, LinkedList<Integer> num, boolean[] perChk) {

		if (m == count) {
			String s = "";
			for (int i = 0; i < num.size(); i++) {
				s += num.get(i);
			}
			max = Math.max(max, Integer.parseInt(s));
		}
		for (int i = 0; i < list.size(); i++) {
			if (!perChk[i]) {
				num.add(list.get(i));
				perChk[i] = true;

				perm(m, count + 1, num, perChk);
				perChk[i] = false;
				num.removeLast();

			}

		}
	}

	public static void main(String[] args) {
		// int arr[] = { 6, 10, 2 };
		// int arr[] = { 3, 30, 34, 5, 9 };
		// int arr[] = { 0, 0, 0, 0 };
		// int arr[] = { 40, 403 };//40403
		// int arr[] = { 70, 0, 0, 0 };//70000
		// int arr[]= {12,121}; //12121

		//int arr[] = { 21, 212 };//21221

		solution(arr);
	}

}
