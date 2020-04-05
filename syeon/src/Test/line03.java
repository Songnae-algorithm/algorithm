package Test;

import java.util.*;

public class line03 {

	static ArrayList<Integer> list;
	static LinkedList<Integer> num;
	static StringBuilder sb;
	static int max = Integer.MIN_VALUE;

	private static void perm(int count, int m, String s) {

		if (count == m) {// 3
			sb = new StringBuilder(s);
			for (int i = 0; i < m; i++) {

				sb.setCharAt(num.get(i), '1');
			}
			int cnt = count(sb.toString());
			if (cnt > max) {
				max = cnt;
			}
		}

		for (int i = 0; i < list.size(); i++) {
			if (num.contains(list.get(i)) || !num.isEmpty() && list.get(i) < num.getLast()) {
				continue;
			}
			num.add(list.get(i));
			perm(count + 1, m, s);
			num.removeLast();
		}
	}

	private static int count(String s) {
		int max = 0;

		String arr[] = s.split("0");
		for (int i = 0; i < arr.length; i++) {
			int count = arr[i].length();
			if (count > max) {
				max = count;
			}

		}

		return max;
	}
	// 가장 긴 1의길이를 찾아

	public static int solution(String road, int n) {
		
		list = new ArrayList<Integer>();

		for (int i = 0; i < road.length(); i++) {
			if (road.charAt(i) == '0') {
				list.add(i);
			}
		}
		num = new LinkedList<Integer>();
		if (n > list.size()) {

			return road.length();
		} else {

			perm(0, n, road);

		}
		System.out.println(max);
		return max;
	}

	public static void main(String[] args) {
		String s = "111011110011111011111100011111";
		String s1 = "001100";

		solution(s, 3);

	}

}
