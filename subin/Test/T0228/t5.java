package T0228;

import java.util.*;

class Pos{
	int x;
	int y;
	
	Pos(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class t5 {
	
    public int solution(int[][] monsters, int[][] bullets) {
        int answer = 0;
        
        int bs = bullets.length;
        LinkedList<Pos> a1 = new LinkedList<>();
        LinkedList<Pos> a2 = new LinkedList<>();
        LinkedList<Pos> a3 = new LinkedList<>();
        LinkedList<Pos> a4 = new LinkedList<>();
        
        for(int i=0;i<bullets.length; i++) {
        	if(bullets[i][0] >0 && bullets[i][1] >0)
        		a1.add(new Pos(bullets[i][0], bullets[i][1]));
        	if(bullets[i][0] <=0 && bullets[i][1] >=0)
        		a2.add(new Pos(bullets[i][0], bullets[i][1]));
        	if(bullets[i][0] <0 && bullets[i][1] <0)
        		a3.add(new Pos(bullets[i][0], bullets[i][1]));
        	if(bullets[i][0] >=0 && bullets[i][1] <=0)
        		a4.add(new Pos(bullets[i][0], bullets[i][1]));
        }
        
        
        for(int i=0; i<monsters.length; i++) {
        	
        	if(bs==0)
        		break;
        	
        	if(monsters[i][0] >0 && monsters[i][1] >0) {
        		Pos p = a1.remove();
        		int x = p.x;
        		int y = p.y;
        		
        		if((x/y)*monsters[i][0] == monsters[i][1])
        		{
        			answer++;
        			bs--;
        		}
        		
        	}
        	
        	else if(monsters[i][0] <=0 && monsters[i][1] >=0) {
        		Pos p = a2.remove();
        		int x = p.x;
        		int y = p.y;
        		
        		if((x/y)*monsters[i][0] == monsters[i][1])
        		{
        			answer++;
        			bs--;
        		}
        	}
        	
        	else if(monsters[i][0] <0 && monsters[i][1] <0) {
        		Pos p = a3.remove();
        		int x = p.x;
        		int y = p.y;
        		
        		if((x/y)*monsters[i][0] == monsters[i][1])
        		{
        			answer++;
        			bs--;
        		}
        	}
        	else if(monsters[i][0] >=0 && monsters[i][1] <=0) {
        		Pos p = a4.remove();
        		int x = p.x;
        		int y = p.y;
        		
        		if((x/y)*monsters[i][0] == monsters[i][1])
        		{
        			answer++;
        			bs--;
        		}
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
	}
}
