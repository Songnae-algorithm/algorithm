package Programmers;

import java.util.*;

public class pr1_문자열내림차순으로배치하기2 {

	// 4/27 1:28 st

//큰것부터 작은순으로. 대문자는 더 작은 것 

	public static String solution(String s) {
		String answer = "";

		String arr[] = new String[s.length()];

		for (int i = 0; i < s.length(); i++) {
			arr[i] = Character.toString(s.charAt(i));
		}
		Arrays.sort(arr);
		
		// Arrays.sort(arr,  Collections.reverseOrder()); 배열 역순정렬은 이렇게..

		for (int i = arr.length - 1; i >= 0; i--) {
			answer += arr[i];
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		String s = "Zbcdefg";// gfedcbZ
		solution(s);
		String a = "ABDCEFvr";
		solution(a);
		//

	}

}
