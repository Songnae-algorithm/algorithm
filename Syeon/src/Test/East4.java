package Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class East4 {

	private static int getCount(String answer, String first) {
		// count 를 세는 함수

		int count = 0;

		Pattern p = Pattern.compile(first);
		Matcher m = p.matcher(answer);

		for (int i = 0; m.find(i); i = m.end()) {
			count++;
		}

		return count;
	}

	public static String solution(String S, String C) {

		String answer = "";

		String[] arr = S.split("; ");// ;로 split 해서 받아옴

		for (int i = 0; i < arr.length; i++) {

			String str[] = arr[i].split(" "); // 공백으로 잘라서 str에 넣기
			String first = str[0].toLowerCase();// 성 입력
			String last = str[str.length - 1].toLowerCase(); // 이름

			if (last.contains("-")) { // "-"가 있으면 없애줌
				last = last.replace("-", "");
			}

			if (answer.contains(first)) { // 성이 똑같은게 있으면
				int count = getCount(answer, first);
				first = first + (count + 1); // 성+숫자

			}

			answer += arr[i] + " <" + last + "_" + first + "@" + C.toLowerCase() + ".com>; ";

		}

		answer = answer.substring(0, answer.length() - 2);// 맨마지막; 지우기

		return answer;

	}

	public static void main(String[] args) {
		String s = "John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";
		String c = "Example";
		solution(s, c);
	}

}
