package Hash;

import java.util.*;

public class prog_2_전화번호목록{
	
    static public boolean solution(String[] phone_book) {
        boolean answer = true;

    	HashMap<String,String> map = new HashMap<String,String>();
    	
    	for(int i=0;i<phone_book.length;i++)
    		map.put(phone_book[i], phone_book[i]);
    	
    	for(int i=0;i<map.size();i++){
    		String a = map.get(phone_book[i]);
    		for(int j=i+1; j<map.size(); j++) {
    			if(a.startsWith(phone_book[j]) || phone_book[j].startsWith(a)) {
    				answer = false;
    				break;
    			}
    		}
    		
    		if(answer == false)
    			break;
    	}

        return answer;
    }
    
    
	public static void main(String[] args) {
		
	}
	
}
