package algo_study;

import java.util.*;

public class ž {

	public static void solution(int[] heights) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = heights.length-1; i >= 0; i--) {
			for (int j = i-1; j >= 0; j--) {
			
				if (heights[i] < heights[j]) {
					list.add(j + 1);
					
					break;
				}

				else{
					list.add(0);
				}
			}
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}
	

	public static void main(String[] args) {
		int[] arr = { 6, 9, 5, 7, 4 };
		solution(arr);
	}
}
