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
		
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0; i<reg_list.length; i++) {
			if(s.equals(reg_list[i])) {
				list.add(0);
				continue;
			}
			
			int idxx = 0;
			for(int ii=0; ii<reg_list[i].length(); ii++) {
				char rc = reg_list[i].charAt(ii);
				if(rc == '1' || rc == '2'|| rc == '3' ||rc == '4'||rc == '5'||rc == '6'||rc == '7'||rc == '8'||rc == '9'||rc == '0'){
					idxx = ii;
					break;
				}
			}
			
			String ck = reg_list[i].substring(0, idxx);
			if(ck.equals(s))
					list.add(Integer.parseInt(reg_list[i].substring(idxx, reg_list[i].length())));
		}
		
		list.sort(null);
		
		for(int i=0; i<list.size(); i++) {
				if(find == list.get(i)) {
					find++;
					if(i==list.size()-1) {
						answer = s+ find;
					}
					continue;
				}
				else {
					answer = s + find;
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
		
		System.out.println(solution(s,"ace15"));
		System.out.println(solution(ss,"cow"));
		System.out.println(solution(sss,"bird98"));
		System.out.println(solution(ssss,"apple"));
	}
}
