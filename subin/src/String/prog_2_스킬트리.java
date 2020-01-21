package String;

import java.util.*;

public class prog_2_스킬트리 {

	//30 min
    public int solution(String skill, String[] skill_trees) {
    	char arr[] = new char[skill.length()];
    	int answer = 0;
    	
    	for(int i=0;i<skill.length(); i++)
    		arr[i] = skill.charAt(i);
    	
    	for(int i=0;i<skill_trees.length;i++) {
    		ArrayList<Character> s = new ArrayList<Character>();
    		
    		for(int j=0; j<skill_trees[i].length(); j++) {
    			for(int k=0; k<arr.length; k++) {
    				if(skill_trees[i].charAt(j) == arr[k])
    					s.add(arr[k]);
    			}
    		}
    		
    		boolean chk = false;
    		for(int j=0; j<s.size(); j++) {
    			if(arr[j] != s.get(j))
    				chk=true;
    		}
    		
    		if(chk==false) 
    			answer++;
    		
    		chk= false;
    		s.clear();
    	}
    
    	return answer;
    }
	
	public static void main(String[] args) {
		
	}
}