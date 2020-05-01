package Ex;

public class ee {

	public static void main(String[] args) {
		int a = 12345;
		int n = 10000;

		while (n != 1) {
			System.out.println(a / n);
			System.out.println(a % n);
			n = n / 10;
		}
	}

}
