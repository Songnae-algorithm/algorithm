package Stack_Queue;

import java.util.*;

public class prog_3_이중우선순위큐 {

    static public int[] solution(String[] operations) {
        LinkedList<Integer> realqu = new LinkedList<Integer>();
        int answer[] = {0,0};
        
        for(int i=0;i<operations.length; i++) {
            Collections.sort(realqu,Collections.reverseOrder());
        	String a[] = operations[i].split(" ");
        	
        	System.out.println(realqu);
        	
        	if(a[0].equals("I")) {
        		realqu.add(Integer.parseInt(a[1]));
        	}
        	
        	if(a[0].equals("D") && a[1].equals("1")) {
        		if(realqu.isEmpty())
        			continue;
        		
        		realqu.remove(0);
        	}
        	
        	if(a[0].equals("D") && a[1].equals("-1")) {
        		if(realqu.isEmpty())
        			continue;
        		
           		realqu.remove(realqu.size()-1);
        	}
        	
        }
        
        //매번 reverse 해줘야 한다는 점 잊지말자!
        Collections.sort(realqu,Collections.reverseOrder());
        
        if(realqu.isEmpty()) {
        	answer[0] = 0;
        	answer[1] = 0;
        }
        else {
        	answer[0] = realqu.get(0);
        	answer[1] = realqu.get(realqu.size()-1);
        }
        
        return answer;
    }
	
    
	public static void main(String[] args) {
		String a[] = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
		solution(a);
	}
}
