package Dfs_Bfs;

import java.util.*;

//15min
public class beak_바이러스 {
	static int maze[][];
	
	static public void dfs(int x, int visited[]) {
		visited[x] = 1;
		
		for(int i=0; i<maze.length; i++) {
			if(maze[i][0] == x && visited[maze[i][1]] == 0) {
				dfs(maze[i][1], visited);
			}
			
			if(maze[i][1] == x && visited[maze[i][0]] == 0) {
				dfs(maze[i][0], visited);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int visited[] = new int[n+1];
		
		maze = new int[m][2];

		for(int i=0; i<m; i++) {
			maze[i][0] = sc.nextInt();
			maze[i][1] = sc.nextInt();
		}
		
		for(int i=0; i<maze.length; i++) {
			if(maze[i][0] == 1) {
				visited[maze[i][0]] = 1;//visited
				dfs(maze[i][1], visited);
			}
			
			if(maze[i][1] == 1) {
				visited[maze[i][1]] = 1;//visited
				dfs(maze[i][0], visited);
			}
				
		}
		
		int answer = 0;
		for(int i=2; i<visited.length; i++) {
			if(visited[i] == 1)
				answer++;
		}
		
		System.out.println(answer);
	}
}
