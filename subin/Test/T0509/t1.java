package T0509;

import java.util.*;

public class t1 {
	static class Pos{
		int x;
		int y;
		int cnt;
		
		Pos(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		Pos(int x, int y, int cnt){
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
		
	}
	
	static char num[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#'}};
	static Pos l_po = new Pos(3,0);
	static Pos r_po = new Pos(3,2);
	
	static String hands = "";
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	static void go_left(char n) {
		if(n == '1') {
			l_po = new Pos(0,0);
		}
		if(n == '2') {
			l_po = new Pos(0,1);
		}
		if(n == '3') {
			l_po = new Pos(0,2);
		}
		if(n == '4') {
			l_po = new Pos(1,0);
		}
		if(n == '5') {
			l_po = new Pos(1,1);
		}
		if(n == '6') {
			l_po = new Pos(1,2);
		}
		if(n == '7') {
			l_po = new Pos(2,0);
		}
		if(n == '8') {
			l_po = new Pos(2,1);
		}
		if(n == '9') {
			l_po = new Pos(2,2);
		}
		if(n == '*') {
			l_po = new Pos(3,0);
		}
		if(n == '0') {
			l_po = new Pos(3,1);
		}
		if(n == '#') {
			l_po = new Pos(3,2);
		}
	}
	
	static void go_right(char n) {
		if(n == '1') {
			r_po = new Pos(0,0);
		}
		if(n == '2') {
			r_po = new Pos(0,1);
		}
		if(n == '3') {
			r_po = new Pos(0,2);
		}
		if(n == '4') {
			r_po = new Pos(1,0);
		}
		if(n == '5') {
			r_po = new Pos(1,1);
		}
		if(n == '6') {
			r_po = new Pos(1,2);
		}
		if(n == '7') {
			r_po = new Pos(2,0);
		}
		if(n == '8') {
			r_po = new Pos(2,1);
		}
		if(n == '9') {
			r_po = new Pos(2,2);
		}
		if(n == '*') {
			r_po = new Pos(3,0);
		}
		if(n == '0') {
			r_po = new Pos(3,1);
		}
		if(n == '#') {
			r_po = new Pos(3,2);
		}
	}
	
	static int check(char n) {
		Queue<Pos> qu = new LinkedList<>();
		boolean visited[][] = new boolean[4][3];
		
		int l_cnt = 0;
		qu.add(new Pos(l_po.x,l_po.y,0));
		
		
		while(!qu.isEmpty()) {
			Pos p = qu.poll();
			visited[p.x][p.y] = true;
			
			if(num[p.x][p.y] == n) {
				l_cnt = p.cnt;
				break;
			}
			
			for(int i=0; i<4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(nx >=0 && nx<4 && ny>=0 &&ny<3 && !visited[nx][ny]) {
					qu.add(new Pos(nx,ny, p.cnt+1));
				}
			}
		}
		
		
		qu.clear();
		boolean v[][] = new boolean[4][3];
		
		int r_cnt = 0;
		qu.add(new Pos(r_po.x,r_po.y,0));
		
		while(!qu.isEmpty()) {
			Pos p = qu.poll();
			v[p.x][p.y] = true;
			
			if(num[p.x][p.y] == n) {
				r_cnt = p.cnt;
				break;
			}
			
			for(int i=0; i<4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(nx >=0 && nx<4 && ny>=0 &&ny<3 && !v[nx][ny]) {
					qu.add(new Pos(nx,ny, p.cnt+1));
				}
			}
		}


		int b = 0;
		if(r_cnt == l_cnt) {
			if(hands.equals("right")) {
				go_right(n);
				b = 2;
			}
			
			else {
				go_left(n);
				b = 1;
			}
		}
		
		else if(r_cnt > l_cnt) {
			go_left(n);
			b = 1;
		}
		else {
			go_right(n);
			b = 2;
		}
		
		return b;
	}
	
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        hands = hand;
        for(int i=0; i<numbers.length; i++) {
        	char n = Character.forDigit(numbers[i], 10);
        	if(n == '1' || n == '4' || n == '7' || n == '*') {
        		go_left(n);
        		answer += "L";
        	}
        	
        	else if(n == '3' || n == '6' || n == '9' || n == '#') {
        		go_right(n);
        		answer += "R";
        	}
	        else {
	        	int b = check(n);
	        	if(b == 1)
	        		answer +="L";
	        	else if(b == 2)
	        		answer +="R";
	        }
       }
        
        return answer;
    }
    
    public static void main(String[] args) {
		int numbers[] = {1,3,4,5,8,2,1,4,5,9,5};
		String h = "right";
		
		System.out.println(solution(numbers,h));
	}
}
