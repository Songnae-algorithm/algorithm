package Programmers;

import java.util.*;

public class pr1_다트게임 {
	public static int solution(String dartResult) {

		// 5/5 11:38-
		int answer = 0;

		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 0; i < dartResult.length() - 1; i++) {// +1 해야하니까 length -1 만큼만 돌아주기
			int a = 0; // a 를 여기서 선언해도 된다.

			if (dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9' && dartResult.charAt(i + 1) != '0') {// 0~9

				// 숫자일 때

				a = dartResult.charAt(i) - '0'; // 숫자로 바꿔서 넣기 chararcter 를 int 로 바꿀 땐 -'0'해줌
				// 숫자 다음의 문자열 따라서 !
			}
			if (dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0') {// 10일 때

				a = 10;
				i++;// 10이니까 다른애들보다 인덱스를 하나 더해서 봐주기
			}
			if (dartResult.charAt(i + 1) == 'T') {
				list.add((int) Math.pow(a, 3));
			}
			if (dartResult.charAt(i + 1) == 'D') {
				list.add((int) Math.pow(a, 2));
			}
			if (dartResult.charAt(i + 1) == 'S') {
				list.add(a);
			}

			if (dartResult.charAt(i + 1) == '*') {//length-1 까지만 도니까 문자 *,#이 맨 끝에있는 경우에는 안돌음. 따라서 i+1로 해줘야 한다ㅠㅠ
				// 별일 때
				if (list.size() >= 2) {// size가 2 이상이면 마지막꺼랑 그 앞에꺼까지 *2
					list.set(list.size() - 1, list.getLast() * 2);
					list.set(list.size() - 2, list.get(list.size() - 2) * 2);
				}
				if (list.size() == 1) {// 1이면 마지막거만 *2
					list.set(list.size() - 1, list.getLast() * 2);
				}

			}
			if (dartResult.charAt(i + 1) == '#') {// #이면
				list.set(list.size() - 1, list.get(list.size() - 1) * -1);

			}
		}

		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			answer += list.get(i);
		}
		System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {
		solution("1T2D3D#");

	}

}
