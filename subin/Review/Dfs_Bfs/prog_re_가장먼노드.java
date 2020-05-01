package Dfs_Bfs;

//15min
import java.util.*;
public class prog_re_가장먼노드 {

    static public int solution(int n, int[][] edge) {
        int answer = 0;
        
        //1에서 n까지 가는 최소 경로들을 다 저장해놓는 배열
        int root[] = new int[n+1];
        
        Queue<Integer> qu = new LinkedList<>();
        
        qu.add(1);
        root[1] = 1;
        
        int max = 0;
        
        while(!qu.isEmpty()) {
        	int now = qu.poll();
        	
        	for(int i=0; i<edge.length; i++) {
        		if(now==edge[i][0] && root[edge[i][1]] ==0) {
        			root[edge[i][1]] += root[now]+1;
        			qu.add(edge[i][1]);
        			max = Math.max(max, root[edge[i][1]]);
        		}
        		
        		if(now==edge[i][1] && root[edge[i][0]] ==0) {
        			root[edge[i][0]] += root[now]+1;
        			qu.add(edge[i][0]);
        			max = Math.max(max, root[edge[i][0]]);
        		}
        	}
        	
        }     
        
        for(int i : root) {
        	if(max == i)
        		answer++;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		int e[][] = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
    	System.out.println(solution(6,e));
	}
	
}
