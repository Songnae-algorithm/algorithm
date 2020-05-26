package Programmers;

public class pr2_다음큰숫자2 {
	public static int solution(int n) {
		// 5/27 01:18-25
		int answer = 0;

		String s = Integer.toBinaryString(n); //10진수를 2진수로 바꾸고 string으로 
		int cnt = 0;// 입력한 2진수의 1의갯수
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				cnt++;
			}
		}

		int cnt2 = 0; //비교할 수의 1의 갯수 
		int n2 = n + 1; //비교할 수의 십진수는 n+1부터 시작 

		while (cnt != cnt2) { //cnt!=cnt2일 때
			String s2 = Integer.toBinaryString(n2); //비교할 수를 이진수로 바꿈 
			

			for (int i = 0; i < s2.length(); i++) {
				if (s2.charAt(i) == '1') {
					cnt2++;
				}
			}//1의 갯수 셈 
			if (cnt == cnt2) {
				break;
			}//cnt랑 같으면 break
			//아닐경우에 cnt2는 0으로 초기화, 비교할 수는 1을 더해줌
			
			cnt2 = 0;
			n2++;

		}
		answer = n2;
		//System.out.println(answer);

		return answer;
	}

	public static void main(String[] args) {
		solution(78);// 83
		solution(15);// 23
	}

}
