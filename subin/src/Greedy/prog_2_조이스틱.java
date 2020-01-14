package Greedy;

import java.util.*;

public class prog_2_조이스틱 {

    public int solution(String name) {
        int answer = 0;
        int arr[] = new int[name.length()];
        
        
        for(int i=0; i<name.length(); i++)
        	arr[i] = Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
        
        for(int i=0;i<name.length();i++) {
       
        	
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		
	}
}
 