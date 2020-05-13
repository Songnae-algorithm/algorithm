package Sort;

import java.util.*;
public class prog_1_실패율 {

    class Fail{
        int stage;
        double rate;
        
        Fail(int stage, double rate){
            this.stage = stage;
            this.rate = rate;
        }
    }
    
    public int[] solution(int N, int[] stages) {
        int fail[] = new int[N+2];
        double sum = stages.length;
        for(int i=0; i<stages.length; i++){
            fail[stages[i]]++;
        }
        
        LinkedList<Fail> faill = new LinkedList<>();
        
        for(int i=1; i<=N; i++){
            if(fail[i] !=0){
                faill.add(new Fail(i, fail[i]/sum));
                sum = sum-fail[i];
            }
            else
                faill.add(new Fail(i, 0));
        }
        
        Comparator<Fail> comp = new Comparator<Fail>(){
            public int compare(Fail a, Fail b){ // rate로 내림차순
                if(a.rate < b.rate)
                    return 1;
                else if(a.rate > b.rate)
                    return -1;
                
                return 0;
            }
        };
         
        Collections.sort(faill,comp);
        
        int answer[] = new int[N];
     
        for(int i=0; i<N; i++)
            answer[i] = faill.get(i).stage;
        
        return answer;
    }
	
	
	
}
