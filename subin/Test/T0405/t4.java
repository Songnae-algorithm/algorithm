package T0405;

import java.util.*;

//50min
public class t4 {
    public static String[][] solution(String[][] snapshots, String[][] transactions) {
        TreeMap<String, String> tran = new TreeMap<>();
        TreeMap<String, Integer> snap = new TreeMap<>();
        
        
        for(int i=0; i<snapshots.length; i++)
        	snap.put(snapshots[i][0], Integer.parseInt(snapshots[i][1]));
        
        
        for(int i=0; i<transactions.length; i++) {
        	if(tran.containsKey(transactions[i][0]))
        		continue;
        	else {
        		String s = "";
        		for(int j=1; j<transactions[i].length; j++)
        			s += transactions[i][j] + ",";
        		tran.put(transactions[i][0], s);
        	}
        }
        
       for(String key:tran.keySet()) {
    	   String re[] = tran.get(key).split(",");
    	   
    	   if(re[0].equals("SAVE")) {
    		   if(snap.containsKey(re[1]))
    			   snap.put(re[1], Integer.parseInt(re[2]) + snap.get(re[1]));
    		   else
    			   snap.put(re[1], Integer.parseInt(re[2]));
    	   }
    	   
    	   if(re[0].equals("WITHDRAW")) {
    		   if(snap.containsKey(re[1]))
    			   snap.put(re[1], snap.get(re[1]) - Integer.parseInt(re[2]));
    	   }
    	   
       }
       
       String real = "";
       for(String key:snap.keySet()) {
    	   System.out.println(key + " " + snap.get(key));
    	   real += key + "," + snap.get(key)+",";
       }
       
       String[][] answer = new String[snap.size()][2];
       String rs[] = real.split(",");
       
       int idx = 0;
       for(int i=0; i<answer.length; i++) {
    	   answer[i][0] = rs[idx++];
    	   answer[i][1] = rs[idx++];
       }
       
       return answer;
    }
	
	public static void main(String[] args) {
		String t[][] = {
				{"ACCOUNT1", "100"}, 
		                {"ACCOUNT2", "150"}
		};
		String s[][] = {
		                {"1", "SAVE", "ACCOUNT2", "100"},
		                {"2", "WITHDRAW", "ACCOUNT1", "50"}, 
		                {"1", "SAVE", "ACCOUNT2", "100"}, 
		                {"4", "SAVE", "ACCOUNT3", "500"}, 
		                {"3", "WITHDRAW", "ACCOUNT2", "30"}
		                };
		
		System.out.println(solution(t,s));
	}
}
