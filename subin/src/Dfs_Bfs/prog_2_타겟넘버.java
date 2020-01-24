package Dfs_Bfs;

import java.util.*;

public class prog_2_타겟넘버 {

	static int answer = 0;
	
	static public void dfs(int numbers[], int idx, int sum, int target) {
		//기저 조건
		if(idx == numbers.length) {
			if(sum == target)
				answer ++;
		}
		
		else if(idx<numbers.length) {
			dfs(numbers,idx+1, sum+numbers[idx], target);
			dfs(numbers,idx+1, sum-numbers[idx], target);
		}
		
	}
	
	
	static public int solution(int[] numbers, int target) {
		
		dfs(numbers,0,0,target);
		
		return answer;
	}
	
	public static void main(String[] args) {
		int n[] = {1,1,1,1,1}; int target = 3;
		
		System.out.println(solution(n,target));
	}
}
