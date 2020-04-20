package Programmers;

import java.util.*;

public class pr_2_숫자의표현 {
	public static int solution(int n) {
		int answer = 0;

		for (int i = 1; i < n + 1; i++) {
			int sum = 0; // 합계

			for (int j = i; j < n + 1; j++) {

				sum += j;// i부터 n까지 sum에 값을 더해줌

				if (sum == n) {// 단, sum이 n과 같아 지면 answer에 +1

					answer++;
					break;// break해서 for문을 빠져나가고 i++이 되어 다시 연속된 숫자를 더해줌.
							

				}
				else if(sum > n) {//더하다가 sum이 n값보다 커지면 break해서 다시 i++
					
					break;
				}
			}
		}

		return answer;

	}

	public static void main(String[] args) {
		int i = 15;
		solution(i);
	}
}
