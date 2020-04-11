package Test;

import java.util.*;

public class T0409_1 {

	public static int split(List<Integer> arr) {
		int cnt = 0;

		int n = 1;

		while (n < arr.size()) {
			int left = 0;
			int right = 0;
			// 한번 돌때마다 초기화

			for (int i = 0; i < arr.size(); i++) {

				if (i < n) {
					left += arr.get(i);
				} else {
					right += arr.get(i);

				}

			}
			if (left > right) {
				cnt++;
			}
			n++;

		} // while

		System.out.println(cnt);
		return cnt;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(-5);
		list.add(6);
		// list.add(7);
		split(list);
	}
}
