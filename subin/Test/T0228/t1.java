package T0228;

import java.util.*;
import java.util.stream.Collectors;

//5min
public class t1 {

    public int[] solution(int[] waiting) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<waiting.length; i++) {
        	
        	if(list.contains(waiting[i]))
        			continue;
        	else
        		list.add(waiting[i]);
        }
       
        return list.stream().mapToInt(i->i).toArray();
    }
    
    public static void main(String[] args) {
		
	}
    
}
