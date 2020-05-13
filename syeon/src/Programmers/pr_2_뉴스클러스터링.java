package Programmers;

import java.util.*;

public class pr_2_뉴스클러스터링 {
	public static int solution(String str1, String str2) {

		// 5/12 13:09- 14:15;
		int answer = 0;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// System.out.println(str1);
		// 둘 다 소문자로 바꿈

//		for (int i = 0; i < str1.length(); i++) {
//
//			if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
//				s1 += Character.toString(str1.charAt(i));
//
//			}
//		}
//
//		for (int i = 0; i < str2.length(); i++) {
//
//			if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z') {
//				s2 += Character.toString(str2.charAt(i));
//
//			}
//		}

		// 공백으로 치환하면...길이가 계속 바뀌어서 제대로 안바뀌는 문제가 발생 ^^

		ArrayList<String> arr1 = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();

		for (int i = 0; i < str1.length() - 1; i++) {
			String s = str1.substring(i, i + 2);

			if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z' && s.charAt(1) >= 'a' && s.charAt(1) <= 'z') {
				arr1.add(s);
			}

		}
		// System.out.println(arr1);
		for (int i = 0; i < str2.length() - 1; i++) {
			String s = str2.substring(i, i + 2);

			if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z' && s.charAt(1) >= 'a' && s.charAt(1) <= 'z') {
				arr2.add(s);
			}

		}
		// System.out.println(arr2);

		boolean chk1[] = new boolean[arr1.size()];
		boolean chk2[] = new boolean[arr2.size()];

		for (int i = 0; i < arr1.size(); i++) {
			for (int j = 0; j < arr2.size(); j++) {
				if (arr1.get(i).equals(arr2.get(j)) && !chk1[i] && !chk2[j]) {
					chk1[i] = true;
					chk2[j] = true;
					break;
				}
			}
		}
		int ans = 0;// 공통된것들의 합

		for (int i = 0; i < chk1.length; i++) {
			if (chk1[i] == true) {
				ans++;
			}
		}

		if (arr1.size() == 0 && arr2.size() == 0) {
			return 65536;
		}
		answer = (ans * 65536 / (arr1.size() + arr2.size() - ans));
		// System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		// solution("FRANCE", "french");// 0.25 16384
		solution("E=M*C^2", "e=m*c^2");// 1

		// solution("handshake", "shake hands");

	}

}
