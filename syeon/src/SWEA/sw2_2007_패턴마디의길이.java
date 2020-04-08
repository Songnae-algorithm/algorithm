package SWEA;

import java.util.*;

public class sw2_2007_패턴마디의길이 {

	// 11;50 start
	// 12:12 fin
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();

		for (int i = 0; i < in; i++) {
			String s = sc.next();

			int ans = 0;

			for (int j = 2; j < s.length() / 2; j++) {
				String str = s.substring(0, j);
				if (str.equals(s.substring(j, 2 * j))) {

					ans = str.length();
					break;
				}

			}

			System.out.println("#" + (i + 1) + " " + ans);
		} // in
	}

}
