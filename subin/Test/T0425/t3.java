package T0425;

import java.util.*;

//35
public class t3 {
	static public String solution(String reg_list[], String new_id) {
		String answer = "";
		
		int idx = 0;
		for(int i=0; i<new_id.length(); i++) {
			char rc = new_id.charAt(i);
			if(rc == '1' || rc == '2'|| rc == '3' ||rc == '4'||rc == '5'||rc == '6'||rc == '7'||rc == '8'||rc == '9'||rc == '0'){
				idx = i;
				break;
			}
		}
		
		HashMap <String, LinkedList<Integer>> Map = new HashMap<>();
		
		String s = ""; int find = 0;
		if(idx == 0)
			 s = new_id;
		else {
			s = new_id.substring(0,idx);
			find = Integer.parseInt(new_id.substring(idx, new_id.length()));
		}
		
		//일단 reg에 없으면 그값 return
		boolean b = false;
		for(int i=0; i<reg_list.length; i++) {
			if(new_id.equals(reg_list[i]))
				b = true;
		}
		if(b == false)
			return new_id;
		
		Arrays.sort(reg_list);
		
		String sss ="";
		for(int i=0; i<reg_list.length; i++) {
				if(find == 0)
					sss = s;
				else
					sss = s+find;
				
				if(!reg_list[i].contains(s))
					continue;
				
				System.out.println("sss " + sss +" "+ reg_list[i]);
				
				if(sss.equals(reg_list[i]) && i ==( reg_list.length-1)) {
					answer = s + (find+1);
					System.out.println("here");
				}
				
				else if(sss.equals(reg_list[i])) {
					find++;
					continue;
				}
				
				else {
					System.out.println("else -> " + sss + " " + find);
					answer =sss;
					break;
				}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String s[] = {"card", "ace13", "ace16", "banker", "ace17", "ace14"};
		String ss[] = {"cow", "cow1","cow2","cow3", "cow4","cow9","cow8", "cow7","cow6","cow5"};
		String sss[] = {"bird99", "bird98", "bird101", "gotoxy"};
		String ssss[] = {"apple1", "orange", "banana3"};
		
		//System.out.println("answer " +solution(s,"ace15"));
		//System.out.println("answer " +solution(ss,"cow"));
		System.out.println("answer " +solution(sss,"bird98"));
		//System.out.println("answer " +solution(ssss,"apple"));
	}
}
