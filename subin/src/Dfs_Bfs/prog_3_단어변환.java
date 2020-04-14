package Dfs_Bfs;

import java.util.*;

//35min
public class prog_3_단어변환 {
	static int size;
	static String targ;
	static String [] word;
	static int answer = Integer.MAX_VALUE;
	
	public static void dfs(int begin_idx, boolean visited[], int count) {
		String begin = word[begin_idx];
		
		//아니 여기서 == 해줬는데 왜 답 4나와...?
		if(begin.equals(targ)) {
			if(answer>count)
				answer = count;
			return;
		}
		
		//for 돌면서 하나만 다르면 dfs타기
		for(int i=0; i<word.length; i++) {
        	if(visited[i] == true)
        		continue;
        	
			int cnt = 0;
        	for(int j=0; j<size; j++) {
        		if(begin.charAt(j) == word[i].charAt(j))
        			cnt++;
        	}
        	
        	if(cnt == size-1) {
        		visited[i] = true;
        		dfs(i,visited,count+1);//i번째가 새로운 begin이고 visited는 방문한곳은 다시안가게, 1번 바뀌었다는 뜻
        		visited[i] = false;
        	}	
		}
		
	}
	
	
    public static int solution(String begin, String target, String[] words) {
    	//target이 words에 없는 경우
    	boolean b = false;
        for(int i=0; i<words.length; i++) {
        	if(words[i].equals(target))
        		b = true;
        }
        if(b == false)
        	return 0;
        
        size = target.length();
        targ = target;
        word = words;
        //있는 경우
        //size-1개 만큼 같을 경우 dfs 타고 들어간다
        for(int i=0; i<words.length; i++) {
        	int cnt = 0;
        	for(int j=0; j<size; j++) {
        		if(begin.charAt(j) == words[i].charAt(j))
        			cnt++;
        	}

        	if(cnt == size-1) {
        		boolean visited[] = new boolean[words.length];
            	visited[i] = true;
            	
        		dfs(i,visited,1);//i번째가 새로운 begin이고 visited는 방문한곳은 다시안가게, 1번 바뀌었다는 뜻
        	}
        	
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		String s[] = {"hot", "dot", "dog", "lot", "log", "cog"};
		
		System.out.println("answer "+solution("hit","cog",s));
	}
	
}
