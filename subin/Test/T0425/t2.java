package T0425;

import java.util.*;
public class t2 {
	static public class Grade{
		String lang;
		int score;
		
		Grade(String lang, int score){
			this.lang = lang;
			this.score = score;
		}
	}
	
	public static int solution(String[] ip_addrs, String[] langs, int[] scores) {
	      HashMap<String, LinkedList<Grade>> map = new HashMap<>();
	      
	      for(int i=0; i<ip_addrs.length; i++) {
	    	  if(map.containsKey(ip_addrs[i])) {
	    		  LinkedList<Grade> inlist = map.get(ip_addrs[i]);
			      inlist.add(new Grade(langs[i], scores[i]));
		    	  
	    		  map.put(ip_addrs[i], inlist);
	    	  }
	    	  else {
	    		  LinkedList<Grade> list = new LinkedList<>();
			      list.add(new Grade(langs[i], scores[i]));
		    	  
	    		  map.put(ip_addrs[i], list);
	    	  }
	      }
	      
	      
	      int size = map.size();
	      for(int i=0; i<size; i++) {
	    	  LinkedList<Grade> g = map.get(ip_addrs[i]);
	    	  
	    	  if(g == null)
	    		  continue;
	    	  
	    	  if(g.size() >=4)
	    		  map.remove(ip_addrs[i]);
	    	  
	    	  else if(g.size() == 3) {
	    		  int num = 0;
		    	  for(int j=1; j<g.size(); j++) {
		    		  String s = g.get(0).lang;
		    		  if(s.contains("C")) {
		    			  if(g.get(j).lang.contains("C"))
		    				  num++;
		    		  }
		    		  else{
		    			  if(g.get(j).lang.equals(g.get(0).lang))
		    				  num++;
		    		  }
		    	  }
		    	  if(num == 2) {
		    		  map.remove(ip_addrs[i]);
		    	  }
	    	  }
	    	  

	    	  else if(g.size() == 2) {
	    		  int num = 0;
		    	  for(int j=1; j<g.size(); j++) {
		    		  String s = g.get(0).lang;
		    		  if(s.contains("C")) {
		    			  if(g.get(j).lang.contains(s) && g.get(j).score == g.get(0).score)
		    				  num++;
		    		  }
		    		  else{
		    			  if(g.get(j).lang.equals(g.get(0).lang) && g.get(j).score == g.get(0).score) {
		    				  num++;
		    			  }
		    		  }
		    	  }
		    	  if(num == 1) {
		    		  map.remove(ip_addrs[i]);
		    		 }
	    	  }
	    	  
	      }
	      
	      int answer = 0;
	      for(String s :map.keySet()) {
	    	  LinkedList<Grade> g = map.get(s);
	    	  //System.out.println("key는 "+ s);
	    	  answer += g.size();
	      }
	      
	      return answer;
	}

   
	
	public static void main(String[] args) {
      String ip[] = { "5.5.5.5", "155.123.124.111", "10.16.125.0", "155.123.124.111", "5.5.5.5", "155.123.124.111",
            "10.16.125.0", "10.16.125.0" };
      String lang[] = { "Java", "C++", "Python3", "C#", "Java", "C", "Python3", "JavaScript" };
      int score[] = { 294, 197, 373, 45, 294, 62, 373, 373 };

      String ip1[] = { "7.124.10.0", "7.124.10.0", "0.0.0.0", "7.124.10.0", "0.0.0.0", "7.124.10.0" };
      String lang1[] = { "C++", "Java", "C#", "C#", "C", "Python3" };
      int score1[] = { 314, 225, 45, 0, 155, 400 };

      System.out.println(solution(ip, lang, score));

   }
}
