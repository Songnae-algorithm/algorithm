package BFS_DFS;

public class pr3_단어변환2 {

	
	 static int ans=10000;
	    public static int dfs(String begin, String target, boolean chk[], String[] words, int cnt){
	      
	        if(begin.equals(target)){
	           ans=Math.min(ans,cnt);
	            return ans;
	        }
	        int belen=begin.length();
	        
	        for(int i=0;i<words.length;i++){
	            int len=0;
	            for(int j=0;j<begin.length();j++){
	            if(!chk[i]&&begin.charAt(j)==words[i].charAt(j)){
	                len++;
	                
	                    }
	                 }
	            if(len==belen-1){
	                
	                chk[i]=true;
	                dfs(words[i],target,chk,words,cnt+1);
	                chk[i]=false;
	            }
	        }
	        return ans;
	    }
	    
	    public int solution(String begin, String target, String[] words) {
	        int answer =0;
	        
	        boolean chk[]=new boolean [words.length];
	        
	        for(int i=0;i<words.length;i++){
	            if(target.equals(words[i])){

	               answer= dfs(begin,target,chk,words,0);
	            }
	        }
	       
	         
	        return answer;
	    }
	    
}
