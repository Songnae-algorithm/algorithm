import java.util.*;

class Review{

    public static void main(String[] args) {
    	StringBuilder sb = new StringBuilder();
    	sb.append("101100011100");
    	
    	int idx = 1;
    	while(idx <=sb.length()-1) {
    		if(sb.charAt(idx-1) == sb.charAt(idx) && sb.charAt(idx)=='0')
    			sb.deleteCharAt(idx);//뒤를 지워
    		else 
    			idx++;
    	}
    	
        System.out.println(sb);
    }

}