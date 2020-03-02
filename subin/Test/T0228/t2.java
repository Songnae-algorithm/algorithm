package T0228;

public class t2 {

	//40
    static public String solution(String s1, String s2) {     
        String test1 = "";
        String test2 = "";
        
        int i=0; int j=0;
        while(true) {
        	if(s2.charAt(i) != s1.charAt(j))
        		j++;
        	
        	else if(s2.charAt(i) == s1.charAt(j)){
        		i++; j++;
        	}
        	
        	if(i == s2.length() || j == s1.length())
        		break;
        	
        }

        test1 = s1 + s2.substring(i);
        
        i=0; j=0;
        while(true) {
        	if(s1.charAt(i) != s2.charAt(j)) {
        		j++;
        	}
        	else if(s1.charAt(i) == s2.charAt(j)){
        		i++; j++;
        	}
        	
        	if(i == s1.length() || j == s2.length())
        		break;
        }
        
        test2 = s2 + s1.substring(i);
        
        
        if(test1.length() <test2.length())
        	return test1;
        else if(test2.length() < test1.length())
        	return test2;
        else {
        	if(test1.compareTo(test2) == 1)
        		return test2;
        	else
        		return test1;
        }
        
    }
    
    public static void main(String[] args) {
		String s1 = "AxA";
		String s2 = "AyA";
    	
		System.out.println(solution(s1,s2));
		
    	
	}
	
}
