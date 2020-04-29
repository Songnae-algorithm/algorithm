package Programmers;

import java.util.*;

public class pr1_가운데글자가져오기2 {

	// 4/27 12:42 star 12:48 fin

	public static String solution(String s) {

		String answer = "";

		int a = s.length() / 2;

		if (s.length() % 2 == 0) { // s가 짝수일 때

			answer = s.substring(a - 1, a + 1);

		} else {// 홀수일 때
			answer = s.substring(a, a+1);

	
		}

		return answer;
	}

	public static void main(String[] args) {

		String a = "abcde";
		solution(a);

		String b = "qwer";
		solution(b);
	}

}
