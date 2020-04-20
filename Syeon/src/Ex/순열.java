package Ex;

import java.util.*;

public class 순열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int r = sc.nextInt();
		LinkedList<Integer> perArr = new LinkedList<>();
		int[] perchk = new int[n];

		permutation(n, r, perArr, perchk);

		// ¼ø¿­ (¼ø¼­ÀÖ°Ô ¹è¿­)


	}

	private static void permutation(int n, int r, LinkedList<Integer> perArr, int[] perCheck) {
		if (perArr.size() == r) {
			// for (int i : perArr) {
			for (int i = 0; i < perArr.size(); i++) {
				System.out.print(perArr.get(i)+1 + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < n; i++) {
			if (perCheck[i] == 0) {
				perArr.add(i);
				perCheck[i] = 1;

				permutation(n, r, perArr, perCheck);

				perCheck[i] = 0;

				perArr.removeLast();

			}
		}

	}

}