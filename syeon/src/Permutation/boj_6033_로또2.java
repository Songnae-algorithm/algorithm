package Permutation;

import java.util.*;

public class boj_6033_로또2 {

	public static void main(String[] args) {
		// 5/1 11:54 -12:30
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			int in = sc.nextInt();
			if (in == 0) {
				break;
			}

			LinkedList<Integer> list = new LinkedList<>(); // 숫자 입력받아서 저장 해 놓을 리스트
			LinkedList<Integer> num = new LinkedList<>(); // 하나씩 넣어서 출력할 리스트
			for (int i = 0; i < in; i++) {

				list.add(sc.nextInt());

			} // 배열 입력

			perm(list, num, 0);

			list.clear();
			num.clear();
			System.out.println();

		}

	}

	private static void perm(LinkedList<Integer> list, LinkedList<Integer> num, int cnt) {

		if (cnt == 6) {

			for (int i = 0; i < 6; i++) {
				System.out.print(num.get(i) + " ");
			}
			System.out.println();

		}

		for (int i = 0; i < list.size(); i++) {
			if (num.contains(list.get(i)) || !num.isEmpty() && list.get(i) < num.getLast()) {
				continue;
			}

			// 이미 갖고 있거나 들어갈 숫자가 num의 마지막보다 작으면 안넣음

			num.add(list.get(i));

			perm(list, num, cnt + 1);
			num.removeLast();

		}

	}

}
