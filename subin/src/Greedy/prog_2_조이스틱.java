package Greedy;

import java.util.*;

public class prog_2_조이스틱 {

    static public int solution(String name) {
        int answer = 0;
        int arr[] = new int[name.length()];
        
        int last = 0 ; //not A인 마지막 수
        
        for(int i=0; i<name.length(); i++) {
        	arr[i] = Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
        	
        	if(name.charAt(i)!='A') {
            	last = Math.max(last, i);
        	}
        }
        
        return answer;
    }
	
    
	public static void main(String[] args) {
		System.out.println(solution("AABA"));
	}
}
 