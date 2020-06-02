package 탐색;

public class pr2_카펫 {

	static int arr[] = new int[2000000];
	static int[] answer = new int[2];

	public static int[] solution(int brown, int yellow) {
		
		//전체 (사각형의 가로-2)* (세로-2)가 yellow의 크기라는 것을 파악했했음
		//나는 그걸 둘 다 약수로되는 경우의 수를 arr라는 배열에 집어넣어서 문제를 구했다.
		//근데 그럴필요가 없었넹.........ㅎㅎㅎ 다시 풀어보자

		// 1. 약수가 되는 경우의수를 다 구하기

		int sum = brown + yellow;

		gcd(sum, 1);

		gcd2(yellow, 1);

		
		return answer;
	}

	private static void gcd(int sum, int i) {
		while (i <= sum) {

			if (sum % i == 0) {

				arr[i] = sum / i;

			}
			i++;
		}

	}

	private static void gcd2(int col, int i) {
		while (i <= col) {
			if (col % i == 0) {

			
				if (arr[i + 2] == col / i + 2) {
					if (i + 2 < col / i + 2) {
						answer[0] = col / i + 2;
						answer[1] = i + 2;
						break;

					} else {
						answer[0] = i + 2;
						answer[1] = col / i + 2;
						break;
					}
				}

			}
			i++;
		}

	}

	public static void main(String[] args) {
		// solution(10, 2);// [4,3]
		//solution(8, 1);// [3,3]
		solution(24,24);//8 6

	}

}
