package Dfs_Bfs;

import java.util.*;
import java.io.*;

public class beak_토마토 {

	static class Pos{
		int x;
		int y;
		int count;
		
		Pos(int x, int y, int count){
			this.x = x;
			this.y = y;
			this.count = count;
		}
	}
	
	//m,n 하...
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
        int arr[][] = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
		
		Queue<Pos> qu = new LinkedList<Pos>();
		int dx[] = {0,0,1,-1};
		int dy[] = {1,-1,0,0};
		int answer = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m; j++) {
				if(arr[i][j] == 1) {
					qu.offer(new Pos(i,j,0));
				}//if
			}//in- for
		}// out- for
		
		while(!qu.isEmpty()) {
			Pos now = qu.poll();
			answer = now.count; // 이게 답!.!
			for(int k=0; k<4; k++) {
				int new_x = now.x + dx[k];
				int new_y = now.y + dy[k];
				
				if(new_x>=0 &&  new_x<n && new_y>=0 && new_y<m && arr[new_x][new_y]==0) {
					arr[new_x][new_y] = 1;
					qu.offer(new Pos(new_x,new_y, answer +1));
				}
			}//for
		}//while
		
        boolean check = false;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
            	System.out.print(arr[i][j] + " ");
            	if(arr[i][j] ==0)
            		check = true;
            }
            System.out.println("");
        }
		if(check== true)
			System.out.println(-1);
		else
			System.out.println(answer);
		
	}
}
