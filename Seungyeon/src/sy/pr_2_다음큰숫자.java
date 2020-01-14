package sy;

import java.util.*;

public class pr_2_다음큰숫자 {

	public static int solution(int n) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> aslist = new ArrayList<Integer>();

		// 입력받은 수를 2진수로 바꿔서 list배열에 넣음
		while (n / 2 != 0) {// 몫이 0이 아닐때까지 반복
			list.add(n % 2);// 2로 나눈 나머지값을 list에 넣음
			n = n / 2;
		}
		list.add(1);// 마지막에 list에 1을 더해줌(몫) 2진수를 만들기위해

		int cnt = 0;// 입력받은 list의 1의 갯수를 저장

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 1) {
				cnt++;
			}
		}
		// list의 1의 갯수 저장
		System.out.println(list);
		System.out.println(cnt);
		
		int answer = n + 1; //n과 비교해줄 값(처음엔 n+1로 시작
		while (true) {
			int chk = 0;//n과 비교해줄 aslist의 1의 갯수 저장 할 변수
			int a = answer;//나중에 answer값을 또 이용해야 하기 때문에
			//비교할 값의 이진수를 만들기 위해 a를 선언

			while (a / 2 != 0) {

				aslist.add(a % 2);
				a = a / 2;
			}
			aslist.add(1);	
		//이진수구하기
			
			for (int i = 0; i < aslist.size(); i++) {
				if (aslist.get(i) == 1) {
					chk++;

				}//1의 개수 판별

			}

			if (cnt != chk) {//1의 갯수가 다르면
				answer++;// answer값을 1추가해줌
				aslist.clear();// list를 다 지우고 다시 시작
				chk = 0;// chk도 0으로 리셋하고 다시

			} else {//같으면 멈춤
				
				break;
			}
		}

		// System.out.println(aslist);

		int sum = 0;//return 해줄 값 
		/*현재 aslist에는 이진수가 거꾸로 들어가 있음!!
		 *그렇지만 십진수로 바꿔줄 때 arr[0]에 2^0을, arr[1]에 2^1, arr[2]에 2^2를 곱하면
		 *더 수월하니까 배열을 바꿔주지 않아도 된다
	
	*/
		for (int i = 0; i < aslist.size(); i++) {

			sum += (int) Math.pow(2, i) * aslist.get(i);
			// System.out.println(sum);
		}
		// System.out.println(sum);
		return sum;

	}

	public static void main(String[] args) {

		solution(78);
	}
}
