package Test;

import java.util.*;

public class T0409_2 {

	public static int solution(List<Integer> time, List<Integer> top) {
		int ans = 0;

		int n = time.size();
		int m = top.size();

		Collections.sort(time);

		for (int i = 0; i < m; i++) {
			for (int j = time.size(); j >= 0; j--) {
				int cnt = 0;
				if (top.get(i) >= time.get(j)) {
					cnt++;
					ans++;
					time.remove(j);

				}
				if (cnt == 5) {
					break;
				}

			}
		}

		return ans;
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(2);
		arr.add(4);
		arr.add(8);
		arr.add(11);
		arr.add(28);
		arr.add(30);

		List<Integer> arr2 = new ArrayList<Integer>();

		arr2.add(0);
		arr2.add(5);
		arr2.add(5);
		arr2.add(15);

		solution(arr, arr2);

	}

}
