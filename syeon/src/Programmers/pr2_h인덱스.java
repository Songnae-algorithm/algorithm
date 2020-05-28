package Programmers;

import java.util.*;

public class pr2_h인덱스 {

	public static int solution(int[] citations) {
		// 5/29 01:05-27
		
		//문제는 잘 이해했는데 부등호를 잘못썼따..
		int answer = 0;
		int idx = citations.length;//
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = idx; i >= 0; i--) {

			int up = 0;
			int down = 0;
			for (int j = 0; j < citations.length; j++) {
				if (i <= citations[j]) {
					up++;

				} else {
					down++;
				}

			}
			if (up >= i && down < i) {
				list.add(i);
			}

		}
		list.sort(null);
		if (!list.isEmpty()) {
			answer = list.get(list.size() - 1);
		}
		//System.out.println(list);
		//System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		// int arr[] = { 3, 0, 6, 1, 5 };//3
		 int arr[] = { 5, 5, 5, 5 };
		//int arr[] = { 0, 1, 1, 1, 1, 3, 3, 4 };// 3
		solution(arr);

	}

}

/*
 * 

import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int max = 0;
        for(int i = citations.length-1; i > -1; i--){
            int min = (int)Math.min(citations[i], citations.length - i);
            if(max < min) max = min;
        }

        return max;
    }
}

