package T0405;

import java.util.*;


//25 min
public class t5 {
    public static String[] solution(String[][] dataSource, String[] tags) {
 
        int size[][] = new int[dataSource.length][2];
        
        for(int i=0; i<size.length; i++)
        	size[i][1] = i;
        
        String tg = "";
        for(int i=0;i<tags.length; i++)
        	tg += tags[i];
        
        for(int i=0;i<dataSource.length; i++) {
        	for(int j=1; j<dataSource[i].length; j++) {
        		if(tg.contains(dataSource[i][j]))
        			size[i][0]++;
        	}
        }

        Arrays.sort(size, new Comparator<int[]>() {
        	@Override
        	public int compare(int a[], int b[]) {
        		if(a[0] == b[0])
        			return a[1] - b[1];
        		else
        			return b[0]-a[0];
        	}
        });

        String ans = "";

        for(int i=0; i<size.length; i++) {
        	if(size[i][0] != 0) {
        		int idx = size[i][1];
        		
        		ans += dataSource[idx][0] + ",";
        	}
        }
        
        String[] answer = ans.split(",");
        String[] realan = new String[10];
        
        if(answer.length >10) {
        	for(int i=0 ;i<10; i++)
        		realan[i] = answer[i];
        	
        	return realan;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		String s[][] = {{"doc1", "t1", "t2", "t3"},
				{"doc2", "t0", "t2", "t3"},
			    {"doc3", "t1", "t6", "t7"},
			    {"doc4", "t1", "t2", "t4"},
			    {"doc5", "t6", "t100", "t8"}};
		
		String t[] = {"t1", "t2", "t3"};
		
		solution(s,t);

	}
}
