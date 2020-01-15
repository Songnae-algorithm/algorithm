package Greedy;

import java.util.*;

public class prog_2_조이스틱 {

    static public int solution(String name) {
        int answer = 0;
        int arr[] = new int[name.length()];
        
        int check = 0; // A가 아닌 것의 개수 체크
        int last = 0 ; //not A인 마지막 수
        
        for(int i=0; i<name.length(); i++) {
        	arr[i] = Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
        	
        	if(name.charAt(i)!='A') {
            	last = Math.max(last, i);
        		check ++;
        	}
        }

        
        //not A가 1개일 경우와 아닐 경우로 나눈다 	check==0이면 if에 안걸려서 answer=0으로 함수 빠져나감
        if(check == 1) {
        	answer = Math.min(last, name.length()-last);
        }
        
        else if(check >1){
        	
        }
        
        
        return answer;
    }
	
    
	public static void main(String[] args) {
		System.out.println(solution("AABA"));
	}
}
 