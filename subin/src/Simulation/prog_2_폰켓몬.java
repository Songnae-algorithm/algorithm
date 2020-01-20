package Simulation;

import java.util.*;

public class prog_2_폰켓몬 {
	
	//30min
    public int solution(int[] nums) {
        int answer = 0;
        int size = nums.length/2;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]))
               map.put(nums[i],1);
        }
        
        if(size > map.size())
               answer = map.size();
        else
               answer = size;
        return answer;
    }
    
}
