package Hash;

import java.util.*;

public class pr2_위장 {

	public static int solution(String[][] clothes) {
		// 5/27 18:19-

		HashMap<String, Integer> map = new HashMap<>();

		int answer = 1;

		for (int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], 0);

		}
		for (int i = 0; i < clothes.length; i++) {
			if (map.containsKey(clothes[i][1])) {
				map.replace(clothes[i][1], map.get(clothes[i][1]) + 1);
			}
		}
		for (String key : map.keySet()) {
			Integer value = map.get(key);
			answer *= (value + 1);

		}

		answer -= 1; // 경우의 수는 (입은경우 + 안입은경우 )* (입은+안입은수) -1 (암것도 안입었을 경우)
		//System.out.println(answer);

		return answer;
	}

	public static void main(String[] args) {
		String arr[][] = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		solution(arr);// 5
	}

}
