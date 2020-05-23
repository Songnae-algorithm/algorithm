package Programmers;

public class pr2_문자열압축 {

	public static int solution(String s) {

		// 5/20 17:20-48 + 5/22 12:30-
		int answer = Integer.MAX_VALUE;

		if (s.length() == 1) {
			return 1;

		}//테케 5번 

		for (int i = 1; i <= s.length() / 2; i++) {

			String ans = "";
			String str1 = s.substring(0, i);// 초깃값 지정

			int cnt = 1;// 갯수를 세 줌

			for (int j = i; j < s.length(); j = j + i) { // substring 할때 잘짤라주기 위해서 j=j+i

				if (j + i > s.length()) {// j+i가 s의 길이를 초과해서 지정할 때는 마지막 인덱스까지만 잘라서 더해주기
					ans += s.substring(j, s.length());
					break;
				}

				if (str1.equals(s.substring(j, j + i))) {

					cnt++;
					continue;

				} // 다 돌고 나오면서 j 2가 됨

				if (cnt == 1) {

					ans += str1;

				} else {
					ans = ans + cnt + str1;

				}
				// 다시 초기화시켜서 처음으로 돌아가기
				cnt = 1;
				str1 = s.substring(j, j + i);

			}

			// 여기서 또 해주는 이유는 length만큼 돌아서 for문을 다 돌고 나왔을 때 마지막부분거를 더해주기 위함.다 하고 나서 i++해서 초기화

			if (cnt == 1) {

				ans += str1;

			} else {

				ans = ans + cnt + str1;

			}
			//System.out.println(ans);

			answer = Math.min(answer, ans.length());
		}

		//System.out.println(answer);

		return answer;

	}

	public static void main(String[] args) {
		solution("abcabcdede");

	}

}
