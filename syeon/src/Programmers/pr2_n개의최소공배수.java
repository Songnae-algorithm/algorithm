package Programmers;

import java.util.*;

public class pr2_n개의최소공배수 {
	
    
    public static int gcd(int a,int b){// 유클리드 호제법. a가 더 커야한다 꼭! 
        if(a%b==0){
            return b;
        }
        else{
          return   gcd(b,a%b); 
        }
     
    }
    public int solution(int[] arr) {
        
        //0604 02: 41-
        int answer = 0;
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        if(arr.length==1){
            return arr[0];
        }
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        while(pq.size()>2){
        int a=pq.poll();
        int b=pq.poll();
        int c = gcd(b,a);//b가 더 커야함 
            pq.add(a*b/c);
        
        }
        if(pq.size()==2){
        int a=pq.poll();
        int b=pq.poll();
        int c = gcd(b,a);//b가 더 커야함 
         answer=a*b/c;
        }
        else if(pq.size()==1){
            return pq.poll();
        }
        return answer;
    }
    

}
