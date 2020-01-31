package review;

public class pr_2_숫자의표현2 {

	public static int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			//i는 1부터 시작
			int sum = 0;//sum =0
			for (int j = i; j <= n; j++) {
				//j는 i랑 똑같
				//(처음에 j를  i+1이라고 하고 sum을 i로 둬서 틀림...문자 초기화 주의) 
				sum += j; // sum에 j를 순서대로 넣음

				if (sum == n) { //sum이 n과 같아질 때 answer ++ , break해서 i++
					answer++;
					break;
				} else if (sum > n) { //sum이 n보다 커지면 break 해서 i++
					break;

				}

			}

		}
		// System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {
		solution(15);
	}
}
