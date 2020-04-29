package Programmers;

public class pr1_자릿수더하기2 {

	public static int solution(int n) {

		// 4/29 17:15 -17:20 
		int answer = 0;
		while (n > 9) {
			answer += n % 10;// 10으로 나눈 나머지
			n = n / 10; // 다음 n은 10으로 나눈 몫

		}

		answer += n;

		return answer;
	}
	/*
	 *  public int solution(int n) {
        int answer = 0;
        while(n>0){

            answer += n%10;
            n /= 10;

        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
    
	 */

	public static void main(String[] args) {
		solution(123);// 6
		solution(987);// 24
	}
}
