package Test;

public class test2 {

	public static void solution(int money[][]) {
		int answer = -1;

		int sum = 0;

		for (int i = 0; i < money.length; i++) {
			sum += money[i][0] * money[i][1];
		}

		int mon = sum / 2;

		int hap = 0;
		// 5500���� Ŀ���� ������ !
		while (mon <= hap) {

		}

	}

	public static void main(String[] args) {

		int arr[][] = { { 2500, 3 }, { 700, 5 } };
		solution(arr);

	}
}
