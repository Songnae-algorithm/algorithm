package Programmers;

public class pr1_문자열내림차순으로배치하기2 {

	// 4/27 1:28 st

//큰것부터 작은순으로. 대문자는 더 작은 것 

	public static String solution(String s) {
	      String answer = "";
	      
	      //자기보다 작은게 있고, 한번 지가간게 아닐때
	      
	      boolean chk[]=new boolean[s.length()];
	      for(int i=0;i<s.length();i++) {
	    	  for(int j=0;j<s.length();j++) {
	    		  if(s.charAt(i)<=s.charAt(j)&&!chk[j]) {
	    			  answer=answer+s.charAt(j);
	    			  
	    			  chk[j]=true;
	    		  }
	    	  }
	      }
	      System.out.println(answer);
	      return answer;
	  }

	public static void main(String[] args) {
		String s = "Zbcdefg";
		solution(s);
		String a="ABDCEFvr";
		solution(a);
		//

	}

}
