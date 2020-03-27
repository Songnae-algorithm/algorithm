package Test;

public class test2 {

	public static int solution(int money[][]) {
		int answer = -1;

		int sum = 0;

		for (int i = 0; i < money.length; i++) {
			sum += money[i][0] * money[i][1];
		}

		int mon = sum / 2;

		int hap = 0;
		//5500보다 커지는 순간에 ! 
		while (mon <= hap) {
		
			
	
	}

	public static void main(String[] args) {

		int arr[][] = { { 2500, 3 }, { 700, 5 } };
		solution(arr);

	}
}
