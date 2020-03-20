package Dfs_Bfs;

import java.util.*;

public class prog_가장먼노드 {

    static public int solution(int n, int[][] edge) {
        int answer = 0;
        boolean ck[] = new boolean[n+1];
        boolean connect[][] = new boolean[n+1][n+1];
        int cnt[] = new int[n+1]; // 거리 저장
        
        for(int i = 0; i < edge.length; i++)
            connect[edge[i][0]][edge[i][1]] = connect[edge[i][1]][edge[i][0]] = true;
        
        
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        ck[0] = ck[1] = true; //이미 방문했으니까
        
        int max = 0;
        
        while(!q.isEmpty()) {
        	int x = q.poll();
        	
        	for(int i=1;i<=n; i++) {
        		if(connect[x][i] && !ck[i]) {
        			q.add(i);
        			cnt[i] = cnt[x]+1;
        			ck[i]= true;
        			if(cnt[i]>max)
        				max = cnt[i];
        		}
        	}
        	
        }
        
        for(int i=1;i<cnt.length; i++) {
        	if(max == cnt[i])
        		answer++;
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		int v[][] = {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};
		
		System.out.println(solution(6,v));
		
	}
}
