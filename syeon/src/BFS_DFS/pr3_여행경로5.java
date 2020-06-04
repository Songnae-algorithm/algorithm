package BFS_DFS;

public class pr3_여행경로5 {
	
	 static  ArrayList<String> list =new ArrayList<>();
	    
	    public static void dfs(String[][] arr, String s, String next, boolean[] chk,int cnt){
	        s+=next +","; //처음 + 다음 (다음거의 앞이 됨 )
	        
	        if(cnt==arr.length-1){
	            list.add(s);
	        
	        }
	        for(int i=0;i<arr.length;i++){
	                if(!chk[i]&&arr[i][0].equals(next)){
	                    chk[i]=true;
	                   dfs(arr,s,arr[i][1],chk,cnt+1);
	                    chk[i]=false;
	            }
	        }
	        
	        
	    }
	    
	    
	    public String[] solution(String[][] tickets) {
	        
	        //0605 03:00- 16
	      
	    
	    boolean chk[]=new boolean[tickets.length];
	        for(int i=0;i<tickets.length;i++){
	           
	                if(tickets[i][0].equals("ICN")){
	                    chk[i]=true;
	                    dfs(tickets,"ICN,",tickets[i][1],chk,0);
	                    chk[i]=false;
	                    //배열, 시작하는 icn, 도착지 , 체크배열
	                }
	            }
	       list.sort(null);
	        String ans=list.get(0);
	        ans=ans.substring(0,ans.length());
	        String answer[]=ans.split(",");
	        
	        
	    
	        return answer;
	    }
}
