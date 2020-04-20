package SWEA;

import java.util.*;

public class sw2_1859_백만장자프로젝트 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();

		for (int i = 1; i <= in; i++) { // 1부터 in 까지 출력

			ArrayList<Integer> list = new ArrayList<>(); // 값 입력할 list

			int a = sc.nextInt();// 몇개의 값을 넣을지 입력받음
			for (int j = 0; j < a; j++) {
				list.add(sc.nextInt());
			} // list에 값 입력

			int sum = 0;

			for (int j = 0; j < list.size() - 1; j++) {
				int max = 0;
				for (int k = j + 1; k < list.size(); k++) {
					if (list.get(k) > list.get(j))
						max = Math.max(max, list.get(k)); // j보다 클 때만 최댓값을 찾음
				}

				if (max != 0) {
					sum += max - list.get(j);
				} else {
					continue;
				}
			}
			System.out.println("#" + i + " " + sum);

		} // in

	}

}
