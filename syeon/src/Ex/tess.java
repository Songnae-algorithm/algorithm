package Ex;

import java.util.*;

public class tess {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("bbb");
		String s = "aei";

		int cnt = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (!list.contains(s.charAt(j))) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
