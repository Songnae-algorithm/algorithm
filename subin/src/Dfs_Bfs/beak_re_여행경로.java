package Dfs_Bfs;

import java.util.*;

public class beak_re_여행경로 {

	static LinkedList<String> result = new LinkedList<>();
	
	static public void dfs(String tic[][], boolean ck[], String s, String input, int count) {
		s += "," + input;
		
		if(count == tic.length) {
			//끝까지 다 돌았으면
			result.add(s);
			System.out.println("s는? " + s);
		}

		for(int i=0; i<tic.length; i++) {
    		if(tic[i][0].equals(input) && !ck[i]) {
    			ck[i] = true;	
    			dfs(tic, ck, s, tic[i][1], count+1); //초기화 String, size
    			ck[i] = false;
    		}
		}//for
		
	}
	
    static public String[] solution(String[][] tickets) {
    	
    	for(int i=0; i<tickets.length; i++) {
    		
    		if(tickets[i][0].equals("ICN")) {
    			boolean chk[] = new boolean[tickets.length];
    			chk[i] = true;
    			dfs(tickets, chk, "ICN",  tickets[i][1], 1); //초기화 String, size
    			chk[i] = false;
    		}
    		
    	}
    	
    	result.sort(null);
    	
    	return result.get(0).split(",");
    }
	
	
	public static void main(String[] args) {
		String s[][] = {{"ICN","COO"},{"ICN","BOO"}, {"COO","ICN"}, {"BOO","DOO"}};
		
		String ss[] = solution(s);
		
		for(int i=0; i<ss.length; i++)
			System.out.println(ss[i]);
		
	}
}
