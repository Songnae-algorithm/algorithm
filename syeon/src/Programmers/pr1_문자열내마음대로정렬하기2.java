package Programmers;

import java.util.*;

public class pr1_문자열내마음대로정렬하기2 {
	// 4/27 15:04 15:21 fin
	//예전에 풀었던게 더 효율좋을듯....생각을 하자 생각생각
	

	public static String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		boolean chk[] = new boolean[strings.length];

		ArrayList<Character> list = new ArrayList<>();

		for (int i = 0; i < strings.length; i++) {
			list.add(strings[i].charAt(n));
		}

		Arrays.sort(strings); // 배열도 정렬
		list.sort(null); // list 정렬

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < strings.length; j++) {
				if (!chk[j] && list.get(i) == strings[j].charAt(n)) {
					chk[j] = true;
					answer[i] = strings[j];
					break; //중복인게 있으면 한번만하고 넘어가야 하니까 break 
				}
			}
		}

		
		return answer;
	}

	public static void main(String[] args) {
		String arr[] = { "sun", "bed", "car" };
		solution(arr, 1);

		String arr1[] = { "abce", "abcd", "cdx" };
		solution(arr1, 2);

	}

}
