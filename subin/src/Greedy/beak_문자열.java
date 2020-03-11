package Greedy;

import java.util.*;

public class beak_문자열 {

	//30min
    static public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String s[] = a.split(" "); //s[0]이 s[1]보다 작다
             
        int count = 0;            	int min = 100;
        if(s[0].length() == s[1].length()){
            for(int i=0; i<s[0].length(); i++) {
            	if(s[0].charAt(i) != s[1].charAt(i))
            		count++;
            }
        }
        else{
            for(int i=0; i<s[1].length()-s[0].length()+1; i++) {
            	count = 0;
            	String ss = s[0]; int front = i-1; int back = i+ s[0].length();
            	
            	while(ss.length() != s[1].length()) {
            		if(front<0 && back <s[1].length()) {
            			ss =  ss + "*";
            			back++;
            		}
            		else if(front>=0 && back >=s[1].length()) {
            			ss= "*" + ss;
            			front--;
            		}
            		else if(front>=0 && back <s[1].length()){
            			ss = "*" + ss + "*";
            			front--; back++;
            		}
            	}//while
            	
            	
            	for(int j=0; j<s[1].length(); j++) {
            		if(ss.charAt(j) == '*')
            			continue;
                	if(ss.charAt(j) != s[1].charAt(j)) {
                		count++;
                		
                	}
                		
                }
            	
            	min = Math.min(count, min);
            }//for
            
            count =min;
        }
        
        System.out.println(count);
    }
}
