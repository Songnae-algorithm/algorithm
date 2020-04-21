package Dfs_Bfs;

import java.util.*;

public class prog_re_여행경로 {
	static String tic[][];
	static int n;
	static LinkedList<String> list;
	
	static public void dfs(int idx, boolean visited[], int num, String s) {
		String next = tic[idx][1];
		s = s + next + ",";
		
		if(num == n) {
			list.add(s);
			return;
		}

		for(int i=0; i<tic.length; i++) {
			if(tic[i][0].equals(next) && !visited[i]) {
                visited[i] = true;
				dfs(i,visited,num+1, s);
				//까먹지 말기
                visited[i] = false;
			}
		}
		
	}
	
	static public String[] solution(String[][] tickets) {
		tic = tickets;
		n = tickets.length;
		
		list = new LinkedList<>();
		
		for(int i=0; i<tickets.length; i++) {
			boolean visited[] = new boolean[tickets.length];
			if(tickets[i][0].equals("ICN")) {
				visited[i] = true;
				dfs(i ,visited,1, "ICN,");
			}
		}
        
		list.sort(null);
        
		String s[] = list.get(0).split(",");
		
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println("yeal");
	}
}
