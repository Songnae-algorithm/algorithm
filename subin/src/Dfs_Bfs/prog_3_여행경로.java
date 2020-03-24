package Dfs_Bfs;

import java.util.*;

public class prog_3_여행경로 {
	static ArrayList<String> list = new ArrayList<>();
	
	static void dfs(String tic[][], String start, String s, boolean visited[], int size) {
		s = s + start + ","; //들어온거 넣어주고
		
		if(size == tic.length) {
			list.add(s);
			return ;
		}
			
		for(int i=0; i<tic.length; i++) {
			if(tic[i][0].equals(start) && !visited[i]) {
				visited[i] = true;
				dfs(tic,tic[i][1], s, visited, size+1);
				visited[i] = false; // visited 하나만 사용하기때문에 나오면서 false 해줘야한다
			}
		}
		
	}
	
    static public String[] solution(String[][] tickets) {
       
    	for(int i=0;i<tickets.length; i++) {
    		boolean visited[] = new boolean[tickets.length];
    				
    		if(tickets[i][0].equals("ICN")) {
    			visited[i] = true;
    			dfs(tickets, tickets[i][1], "ICN,",visited,1);
    			visited[i] = false; // visited 하나만 사용하기때문에 나오면서 false 해줘야한다
    		}
    	}
    
    	
    	list.sort(null);
    	String real[] = list.get(0).split(",");
    	String answer[] = new String[real.length];
    	
    	for(int i=0;i<answer.length; i++)
    		answer[i] = real[i];
    	
        return answer;
    }
	
	public static void main(String[] args) {
		String s[][] = {{"ICN","COO"},{"ICN","BOO"}, {"COO","ICN"}, {"BOO","DOO"}};
		
		String ss[] = solution(s);
		
		for(int i=0; i<ss.length; i++)
			System.out.println(ss[i]);
		
	}
}
