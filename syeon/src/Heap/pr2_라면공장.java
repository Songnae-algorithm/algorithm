package Heap;

import java.util.*;

public class pr2_라면공장 {

	public static int solution(int stock, int[] dates, int[] supplies, int k) {
		int answer = 0;

		PriorityQueue<Integer> qu = new PriorityQueue<>();
	
	       
	        int j=0;
	        int day=stock; //처음 시작 4 
	        
	        for(int i=0;i<k;i++){
	        	//하루씩 갈 때마다 stock이 줄어야 하니까 k 만큼 돌아줌
	            int d=dates[j];
	            int sup=supplies[j];
	            
	           if()
	            
	            day++;
	   
	            stock--;
	        }

		return answer;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 10, 40, 20, 30 };
		solution(4, a, b, 100);// 4

		int aa[] = { 4, 10, 15 };
		int bb[] = { 20, 5, 10 };
		solution(4, aa, bb, 30);
	}
}
