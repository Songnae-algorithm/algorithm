package Greedy;

import java.util.*;

public class pr2_큰수만들기2 {

	public static String solution(String number, int k) {

		int idx = 0;
		char max;
		StringBuilder answer = new StringBuilder();

		if (number.charAt(0) == '0')
			return "0";
		for (int i = 0; i < number.length() - k; i++) { // 범위초과안시킬려고
			max = '0';

			System.out.println(i);

			for (int j = idx; j <= k + i; j++) { // k+i는 맨 끝까지 봐주는 것
				if (max < number.charAt(j)) {
					max = number.charAt(j);
					System.out.println(max + " " + j);

					idx = j + 1;// 0번째부터 끝까지 보면서 자기보다 큰 게 있으면 바꿔준다! j를 idx 로 지정해서, 큰 값이 있으면 자기 다음부터 봐주기...
					//이걸 어떻게 생각하는거야ㅠㅠㅠㅠ
				}
			}

			answer.append(max);
		}
		return answer.toString();

	}

	public static void main(String[] args) {

		// solution("1924", 2);
		// solution("1231234", 3);// 3234
		solution("4177252841", 4);// 775841

	}

}
