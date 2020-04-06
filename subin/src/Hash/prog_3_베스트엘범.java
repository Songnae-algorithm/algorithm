package Hash;

import java.util.*;

public class prog_3_베스트엘범 {
	static class Pos{
		int song;
		int idx;
		
		Pos(int song, int idx){
			this.song = song;
			this.idx = idx;
		}
	}
	
	static public int[] calculation(LinkedList<Pos> tm) {
		int answer[][] = new int[2][2];
		boolean ck = false;
		
		for(int i=0; i<tm.size(); i++) {
			int tsong = tm.get(i).song;
			int tidx = tm.get(i).idx;
			
			
			if(answer[0][0] ==0 && answer[1][0] == 0) {
				answer[0][0] = tsong;
				answer[0][1] = tidx;
			}
			else if(answer[0][0] !=0 && answer[1][0] ==0) {
				ck = true;

				if(answer[0][0] == tsong) {
					if(answer[0][1] < tidx) {

						answer[1][0] = answer[0][0];
						answer[1][1] = answer[0][1];
						answer[0][0] = tsong;
						answer[0][1] = tidx;
					}
					else {
						answer[1][0] = tsong;
						answer[1][1] = tidx;
					}
				}
				
				else if(answer[0][0] < tsong) {
					answer[1][0] = tsong;
					answer[1][1] = tidx;
				}
				else {
					answer[1][0] = answer[0][0];
					answer[1][1] = answer[0][1];
					answer[0][0] = tsong;
					answer[0][1] = tidx;
				}
			}
			
			else if(answer[0][0] !=0 && answer[1][0] !=0) {
				if(tsong <answer[0][0])
					continue;
				else if(tsong>=answer[0][0] && tsong<answer[1][0]) {
					if(tsong == answer[0][0]){
						if(tidx > answer[0][1])
							continue;
					}
					answer[0][0] = tsong;
					answer[0][1] = tidx;
				}
				else if(tsong>= answer[1][0]) {
					if(tsong == answer[1][0]){
						if(tidx> answer[1][1]) {
							answer[1][0] = answer[1][0];
							answer[1][1] = answer[1][1];
							answer[0][0] = tsong;
							answer[0][1] = tidx;
						}
					}
					else {
						answer[0][0] = answer[1][0];
						answer[0][1] = answer[1][1];
						answer[1][0] = tsong;
						answer[1][1] = tidx;
					}
				}
			}
		}
		
		if(ck == false) {
			int realan[] = new int[1];
			realan[0] = answer[0][1];
			
			return realan;
		}
		
		else {
			int realan[] = new int[2];
			realan[0] = answer[1][1];
			realan[1] = answer[0][1];
			
			return realan;
		}
	}
	
    static public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> sum = new HashMap<>();
        
        String ya[] = new String[genres.length];
        
        for(int i=0; i<genres.length; i++) {
        	ya[i] = genres[i] + "," + plays[i] + "," + i;
        	if(sum.containsKey(genres[i]))
        		sum.put(genres[i], sum.get(genres[i]) + plays[i]);
        	else
        		sum.put(genres[i], plays[i]);
        }
        
        LinkedList<String> sorted = new LinkedList<>();
        for(String key: sum.keySet())
        	sorted.add(sum.get(key) + "," + key);
        
        Collections.sort(sorted, Collections.reverseOrder());
        
        LinkedList<Integer> answer = new LinkedList<>();
        
        for(int i=0; i<sorted.size(); i++) {
        	String real[] = sorted.get(i).split(",");
        	LinkedList<Pos> tm = new LinkedList<Pos>();
        	
        	for(int j=0; j<genres.length; j++) {
        		String split[] = ya[j].split(",");
        		if(ya[j].contains(real[1])) {
        			tm.add(new Pos(Integer.parseInt(split[1]), Integer.parseInt(split[2])));
        		}
        	}
        	
        	int two[] = calculation(tm);
        	
        	for(int k=0; k<two.length; k++)
        		answer.add(two[k]);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
	
	public static void main(String[] args) {
		String g[] = {"classic", "pop","pop", "pop", "classic", "classic", "hip"};
		int p[] = {500,500, 600, 600, 150, 800, 50000};
		
		int sol[] = solution(g,p);
		
		for(int i=0; i<sol.length; i++)
			System.out.println(sol[i]);
	}
}
