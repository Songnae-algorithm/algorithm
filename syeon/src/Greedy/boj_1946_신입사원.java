package Greedy;

import java.util.*;

public class boj_1946_신입사원 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 0; i < a; i++) {

			ArrayList<Integer> arr1 = new ArrayList<>();
			ArrayList<Integer> arr2 = new ArrayList<>();

			for (int j = 0; j < b; j++) {

				arr1.add(sc.nextInt());
				arr2.add(sc.nextInt());

			}

			int fir = arr1.indexOf(1);
			int m = arr2.get(fir);

			for (int j = 0; j < arr2.size(); j++) {
				if (arr2.get(j) > m) {
					arr1.remove(j);
					arr2.remove(j);
					System.out.println(j);
				}
			}
			System.out.println(arr1 + " " + arr2);
			int fir2 = arr2.indexOf(1);
			int m2 = arr1.get(fir2);

			for (int j = 0; j < arr1.size(); j++) {
				if (arr1.get(j) > m2) {
					arr1.remove(j);
					arr2.remove(j);
				}
			}

			System.out.println(arr1.size());
		} // here

	}

}
