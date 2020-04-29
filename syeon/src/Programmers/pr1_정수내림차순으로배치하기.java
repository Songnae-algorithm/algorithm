package Programmers;

import java.util.*;

public class pr1_정수내림차순으로배치하기 {
	public static long solution(long n) {
		//리턴타입주의

		// 4/29 17:32 -43 
		long answer = 0;

		String a = "" + n;

		ArrayList<Character> list = new ArrayList<>();

		for (int i = 0; i < a.length(); i++) {
			list.add(a.charAt(i));

		}
		list.sort(null);
		String s = "";
		for (int i = list.size() - 1; i >= 0; i--) {
			s += list.get(i);
		}
		answer = Long.parseLong(s);
		// long.parseInt(s)하면 long 타입으로 반환 

		return answer;
	}

	public static void main(String[] args) {
		solution(118372);// 873211

	}

}
