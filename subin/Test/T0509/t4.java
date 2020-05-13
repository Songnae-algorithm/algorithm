package T0509;

import java.util.*;

public class t4 {

	static class Pos{
		int x;
		int y;
		int cost;
		String cur;
		
		Pos(int x, int y, int cost, String cur){
			this.x = x;
			this.y = y;
			this.cost = cost;
			this.cur = cur;
		}
	}
	
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	static String curve(int x1, int y1, int x2, int y2) {
		String an = "";
		
		if(x1 > x2 && y1 == y2)
			an = "UP";
		else if(x1 <x2 && y1==y2)
			an = "DOWN";
		else if(x1 == x2 && y1>y2)
			an = "LEFT";
		else if(x1 == x2 && y1<y2)
			an = "RIGHT";
		
		return an;
	}
	
    public static int solution(int[][] board) {    
        Queue<Pos> qu = new LinkedList<>();
        qu.add(new Pos(0,0,0, ""));
        
        int len = board.length;
        
        boolean visited[][] = new boolean[len+1][len+1];
        
        int min_cost=Integer.MAX_VALUE;
        
        while(!qu.isEmpty()) {
        	Pos p = qu.poll();
        	visited[p.x][p.y] = true;
        	
        	System.out.println(p.x + " " + p.y + " " + p.cost + " " + p.cur);
        	if(p.x == len-1 && p.y == len-1) {
        		//break 걸지말고, 끝까지 다 돌아
        		if(p.cost < min_cost) {
        			min_cost = p.cost;
        		}
        	}
        	
        	for(int i=0; i<4; i++) {
        		int nx = p.x + dx[i];
        		int ny = p.y + dy[i];

        		//현재 위치에서 다음위치에 갈 수 있으면서 코너를 도는 것이라면 500원 추가
        		if(nx>=0 && nx<len && ny>=0 && ny<len && board[nx][ny] !=1 && !visited[nx][ny]) {
        			//curve 인지아닌지
        			if(p.cur.equals("")) {
        				qu.add(new Pos(nx,ny, p.cost + 100, curve(p.x, p.y, nx, ny)));
        			}
        			if(curve(p.x, p.y, nx, ny).equals(p.cur))
        				qu.add(new Pos(nx, ny, p.cost + 100, curve(p.x, p.y, nx, ny)));
        			else
        				qu.add(new Pos(nx, ny, p.cost + 600, curve(p.x, p.y, nx, ny)));
        		}
        	}
        }
        
        return min_cost;
    }
    
    public static void main(String[] args) {
//		int b[][] = {{0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0},
//					 {0,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,1},{0,0,1,0,0,0,1,0},
//					 {0,1,0,0,0,1,0,0},{1,0,0,0,0,0,0,0}};
		
    	//int b[][] = {{0,0,0},{0,0,0},{0,0,0}};		 
			
		
		int b[][]= {{0,0,0,0,0,0},{0,1,1,1,1,0},{0,0,1,0,0,0},{1,0,0,1,0,1},{0,1,0,0,0,1},{0,0,0,0,0,0}};
		System.out.println(solution(b));
    }
    
}
