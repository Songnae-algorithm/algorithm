package Programmers;

public class pr2_n진수게임 {

	public static String solution(int n, int t, int m, int p) {

		// 5/6 16:53 -
		String answer = "";
		int a = 0;

		while (answer.length() <= t * m) {
			int i = a;

			String num = ""; // 각 숫자별로 num 구해주기

			if (i / n == 0) { // 몫이 0일때는 나머지만 더해주기
				num += i % n;
			} else {
				num = i % n + num; // 몫이 n보다는 안클경우 나머지랑 몫 더해줌

				while (i / n >= n) {
					num = i % n + num;
					i = i / n;

				}
				num = i / n + num;

			}

			a++;

			if (i == 10) {
				num = "A";
			}
			if (i == 11) {
				num = "B";
			}

			if (i == 12) {
				num = "C";
			}
			if (i == 13) {
				num = "D";
			}
			if (i == 14) {
				num = "E";
			}
			if (i == 15) {
				num = "F";
			}
			answer += num;

		}

		String ans = "";
		int i = p - 1;
		while (ans.length() != t) {
			
			ans += Character.toString(answer.charAt(i));
			i += m;
		}
		//System.out.println(ans);

		return ans;
	}

	public static void main(String[] args) {
		solution(16, 16, 2, 2);// "0111";
	}

}
