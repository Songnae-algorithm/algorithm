package String;

import java.util.*;

public class prog_2_튜플 {
    
	static public int[] solution(String s) {

        s = s.substring(1, s.length()-1);
        s += ",";
        
        String sp[] = s.split("},");

        for(int i=0; i<sp.length; i++)
        	sp[i] = sp[i].substring(1,sp[i].length());
        
        int cnt[] = new int[sp.length];
        
		StringTokenizer st = null;
		ArrayList<Integer>[] list = new ArrayList[sp.length];
		
		for(int i=0; i<list.length; i++) {
			list[i] = new ArrayList<>();
			st = new StringTokenizer(sp[i], ",");
			while(st.countTokens() > 0) {
				list[i].add(Integer.parseInt(st.nextToken()));
				cnt[i]++;
			}
		}
		
        
		int size = 1;
		int idx = 0;
		
		int num[] = new int[100000];
		
		LinkedList<Integer> ans = new LinkedList<>();
		
		while(size <=sp.length) {
			for(int i=0; i<list.length; i++) {
				if(list[i].size() == size) {
					idx = i;
					size++;
					break;
				}
			}
			
			for(int i=0; i<list[idx].size(); i++) {
				for(int j=0; j<list[idx].size(); j++) {
					int x = list[idx].get(j);
					
					if(num[x] ==0) {
						ans.add(x);
						num[x] = 1;
					}	
				}
			}
		}
		
		
        return ans.stream().mapToInt(i->i).toArray();
    }
	
	public static void main(String[] args) {
		
		int arr[] = solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");
		
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
}
