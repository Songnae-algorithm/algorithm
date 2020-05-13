package Programmers;

import java.util.*;

public class pr2_튜플 {

	static String[] arr;

	public static int[] solution(String s) {
		// 5/12 14:57-

		s = s.substring(1, s.length() - 1);// 맨 앞, 맨 뒤 대괄호 제거

		if (s.contains("{")) {
			s = s.replace("{", "");
		}

		arr = s.split("}");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].charAt(0) == ',') {
				arr[i] = arr[i].substring(1, arr[i].length());

			}
		}
		// 2
		// 2,1
		// 2,1,3 이런식으로 만들기

		// 길이가 짧은것부터 순서대루 정렬 compatator 사용법 꼭 알아두기 외우기
		Comparator<String> comp = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		};

		Arrays.sort(arr, comp);

		ArrayList<String> ans = new ArrayList<>(); //값 입력할 list 

		for (int i = 0; i < arr.length; i++) {
			String[] spl = arr[i].split(",");
			//,마다 짤라서 배열에 넣기 
			for (int j = 0; j < spl.length; j++) {
				if (!ans.contains(spl[j])) {
					ans.add(spl[j]);//포함안하면 리스트에입력
				}
			}
		}

		int[] answer = new int[ans.size()];

		for (int i = 0; i < ans.size(); i++) {
			answer[i] = Integer.parseInt(ans.get(i));
		}

		return answer;

	}

	public static void main(String[] args) {
		solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
		solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");
		solution("{{123}}");
	}

}
