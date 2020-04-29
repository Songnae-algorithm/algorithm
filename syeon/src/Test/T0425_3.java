package Test;

import java.util.*;

public class T0425_3 {

	public static String solution(String[] registered_list, String new_id) {
		String answer = "";

		boolean chk = false;
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < registered_list.length; i++) {
			if (registered_list[i].equals(new_id)) {
				chk = true;
				break;
			}
		}
		if (chk == false) {
			answer += new_id;
			return answer;
		}

		Arrays.sort(registered_list);
	
		for(int i=0;i<registered_list.length;i++) {
			System.out.println(registered_list[i]);
		}
		String newchk = "";// new id에서 문자열만 뺴냄
		String newin = "";// 숫자 뺌

		for (int j = 0; j < new_id.length(); j++) {
			// 48 ~ 57은 아스키 코드로 0~9F
			if (48 <= new_id.charAt(j) && new_id.charAt(j) <= 57) {
				newin += new_id.charAt(j); // 숫자부분저장
			}

			else {
				newchk += new_id.charAt(j); // 문자저장
			}
		}

		int a = 0;

		for (int i = 0; i < registered_list.length; i++) {
			String ans = "";
			String su = "";
			while (!registered_list[i].equals(new_id) && registered_list[i].contains(newchk)) {

				for (int j = 0; j < registered_list[i].length(); j++) {
					// 48 ~ 57은 아스키 코드로 0~9
					if (48 <= registered_list[i].charAt(j) && registered_list[i].charAt(j) <= 57) {
						su += registered_list[i].charAt(j); // 숫자부분저장
					}

					else {
						ans += registered_list[i].charAt(j); // 문자저장

					}
				}

				if (su.equals("")) {
					a = 0;
				} else {
					a = Integer.parseInt(su);// newid에서 숫자만 빼낸거
				}
				new_id = ans + a;

			}
			answer = newchk + (a + 1);

		}
		System.out.println(answer);
		return answer;

	}

	// while

	public static void main(String[] args) {
//		String str1 = "1234 ";
//		String str2 = "";
//		String str3 = new String(); // str3또한 new String("")과 같다.

//		for (int i = 0; i < str1.length(); i++) {
//			// 48 ~ 57은 아스키 코드로 0~9이다.
//			if (48 <= str1.charAt(i) && str1.charAt(i) <= 57)
//				str3 += str1.charAt(i);
//		}
//
//		System.out.println(str3);
//		int b = Integer.parseInt(str3);

		String arr[] = { "bird97","bird99", "bird98", "bird101", "gotoxy" };
		String id = "bird99";
		solution(arr, id);

//		String arr1[] = { "card", "ace13", "ace16", "banker", "ace17", "ace14" };
//		String id1 = "ace15";
//		solution(arr1, id1);
	}

}
