package T0509;

import java.util.*;

public class t3 {
	
    public static int[] solution(String[] gems) {
        LinkedList<String> list = new LinkedList<>();
        
        for(int i=0; i<gems.length; i++) {
        	if(list.contains(gems[i]))
        		continue;
        	else
        		list.add(gems[i]);
        }
        
        int size = list.size();
        
        System.out.println(size);
        HashMap<String, Integer> map = new HashMap<>();
        
		int min = size;
		int max = 0;
		
		int realx=0;
		int realy=0;
		int calc = Integer.MAX_VALUE;
        for(int i=0; i<gems.length; i++) {
        	
        	if(map.containsKey(gems[i])) {
              	if(map.get(gems[i]) <i)
              		map.put(gems[i], i);
        	}
        	
        	else
        		map.put(gems[i], i);
        	
           	if(map.size() == size) {
            		for(String key:map.keySet()) {
            			min = Math.min(min, map.get(key));
            			max = Math.max(max, map.get(key));
            		}
            		if(calc > max-min) {
            			calc = max-min;
            			realx = min;
            			realy = max;
            		}
            }
        	
        }
        
        int[] answer = new int[2];
        answer[0] = realx +1;
        answer[1] = realy+1;
        
        return answer;
    }
    
    public static void main(String[] args) {
		String s[] = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
		
		solution(s);
	}
}
