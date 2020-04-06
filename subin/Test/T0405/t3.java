package T0405;

import java.util.*;

public class t3 {
	
    public int solution(String road, int n) {
        int answer = -1;
        
        LinkedList<Integer> list = new LinkedList<>();
        int ck = 0;
        for(int i=0;i<road.length(); i++) {
        	if(road.charAt(i) == '0') {
        		list.add(i);
        		ck++;
        	}
        }
        
        if(ck <=n)
        	return road.length();
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		
	}
}
