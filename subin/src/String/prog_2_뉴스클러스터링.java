package String;

import java.util.*;

public class prog_2_뉴스클러스터링 {

    static public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();	str2 = str2.toLowerCase();
        
        String con = "abcdefghijklmnopqrstuvwxyz";
        
        String s1  = str1;
        String s2  = str2;
        
        LinkedList<String> l1 = new LinkedList<>();
        LinkedList<String> l2 = new LinkedList<>();
        
        for(int i=0; i<s1.length()-1; i++) {
        	if(con.contains(String.valueOf(s1.charAt(i))) && con.contains(String.valueOf(s1.charAt(i+1))))
        			l1.add(s1.substring(i,i+2));
        }
        
        for(int i=0; i<s2.length()-1; i++) {
        	if(con.contains(String.valueOf(s2.charAt(i))) && con.contains(String.valueOf(s2.charAt(i+1))))
        			l2.add(s2.substring(i,i+2));
        }
        
        boolean a1[] = new boolean[l1.size()];
        boolean a2[] = new boolean[l2.size()];
        
        int in = 0;
        
        for(int i=0; i<l1.size(); i++) {
        	for(int j=0; j<l2.size(); j++) {
        		if(!a1[i] && !a2[j]) {
	        		if(l1.get(i).equals( l2.get(j))) {
	        			a1[i] = a2[j] = true;
	        			in++;
	        			break;
	        		}
        		}
        	}
        }
        
        int out = a1.length + a2.length -in;
        
        int answer = (in*65536/out);
        
        if(l1.isEmpty() && l2.isEmpty())
        	return 65536;
        
        return answer;
    }
    
    public static void main(String[] args) {
		
    	System.out.println(solution("aa1+aa2", "AAAA12"));
    	
	}
}
