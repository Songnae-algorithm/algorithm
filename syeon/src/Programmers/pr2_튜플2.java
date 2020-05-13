package Programmers;

import java.util.*;

public class pr2_튜플2 {

	public static int[] solution(String s) {

		s = s.substring(2, s.length() - 2).replace("},{", "-");

		String[] arr = s.split("-");
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		ArrayList<Integer> list = new ArrayList<>();
		for (String temp : arr) {
			String[] val = temp.split(",");

			for (int i = 0; i < val.length; i++) {

		

				int num = Integer.valueOf(val[i]);

				if (!list.contains(num)) {
					list.add(num);
				}
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;

	}

	public static void main(String[] args) {
		solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
		solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");
		solution("{{123}}");
	}
}
