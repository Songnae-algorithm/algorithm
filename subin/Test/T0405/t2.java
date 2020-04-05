package T0405;

//30min
public class t2 {

    public int solution(String answer_sheet, String[] sheets) {
        int answer = 0;
        char as[] = new char[answer_sheet.length()];
        
        int max = 0;
        
        for(int i=0; i<answer_sheet.length(); i++)
        	as[i] = answer_sheet.charAt(i);
        
        for(int i=0; i<sheets.length; i++) {
        	for(int j=i+1; j<sheets.length; j++) {
        		
        		int serise = 0;
        		int s = 0;
        		int plus = 0;
        		
        		for(int k=0; k<answer_sheet.length(); k++) {//여기서 비교
        			if(sheets[i].charAt(k) == sheets[j].charAt(k)) {
        				if(sheets[i].charAt(k) != as[k]) {
        					plus++;
        					serise++;
        					
            				if(s==0 && k == answer_sheet.length()-1)
        						s = 1;
        				}
        			}
        			
        			else {
        				s = Math.max(s, serise);
        				serise = 0;    					
        			}
        		}
        		
        		max = Math.max(max, plus + (s*s));
        	}
        }
        
        answer = max;
        
        return answer;
    }
	
	public static void main(String[] args) {
		
	}
}
