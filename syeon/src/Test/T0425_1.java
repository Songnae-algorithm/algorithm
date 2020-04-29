package Test;

import java.util.*;

public class T0425_1 {

	static String str[] = { "2019/01/01 5000", "2019/01/20 15000", "2019/02/09 90000" };
	//static String str[] = { "2019/01/30 5000", "2019/04/05 10000", "2019/06/10 20000" , "2019/08/15 50000", "2019/12/01 100000"};

	public static void main(String[] args) {

		int month[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 0~12
		int day[] = new int[366]; // 1부터

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length; i++) {

			int wol = Integer.parseInt(str[i].substring(5, 7)); // 입력했던거에서 달만 뺴옴
			int il = Integer.parseInt(str[i].substring(8, 10)); // 월 빼옴
			int money = Integer.parseInt(str[i].substring(11, str[i].length()));
			int daily = 0;

			for (int j = 0; j < wol; j++) {
				daily += month[j];
			}
			daily += il;
			map.put(daily, money);
		}

			System.out.println(map);

		for (Integer key : map.keySet()) {

			for (int i = key; i < key + 30; i++) {
				day[i] += map.get(key);
			}
		}

		int rank[] = new int[5];

		for (int i = 1; i < day.length; i++) {

			if (day[i] >= 0 && day[i] < 10000) {
				rank[0]++;

			}

			else if (day[i] >= 10000 && day[i] < 20000) {
				rank[1]++;
			}

			else if (day[i] >= 20000 && day[i] < 50000) {
				rank[2]++;
			}
			else if (day[i] >= 50000 && day[i] < 100000) {
				rank[3]++;
			} else {
				rank[4]++;
			}

		}
		
		
		for(int i=0;i<rank.length;i++) {
			System.out.println(rank[i]);
		}

	}

}
