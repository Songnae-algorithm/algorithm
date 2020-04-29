package T0425;

import java.util.*;
public class t1 {
	
	static public int[] solution(String pur[]) {
		int answer[] = new int[5];
		int days[][] = new int[pur.length][3];
		int money[] = new int[pur.length];
		int ms[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int year[] = new int[366];
		
		for(int i=0; i<pur.length; i++) {
			String s[] = pur[i].split(" ");//s[0], s[1];
			String ss[] = s[0].split("/");
			for(int j=0; j<3; j++) {
				days[i][j] = Integer.valueOf(ss[j]);
			}
			money[i] = Integer.valueOf(s[1]);
		}
		
		for(int i=0; i<pur.length; i++) {
			int day = 0;	int realday = days[i][1];
			for(int j=0; j<realday-1; j++)
				day += ms[j];
			day += days[i][2];
			
			for(int j=day; j<day+30; j++)
				year[j] += money[i];
		}
		
		for(int i=1; i<366; i++) {
			if(year[i] <10000)
				answer[0]++;
			
			else if(year[i] <20000)
				answer[1]++;
			
			else if(year[i] <50000)
				answer[2]++;
			
			else if(year[i] <100000)
				answer[3]++;
			
			else
				answer[4]++;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		String p[] = {"2019/01/01 5000","2019/01/20 15000","2019/02/09 90000"};
		int an[] = solution(p);
		
		for(int i=0; i<an.length; i++)
			System.out.print(an[i] + " ");
	}
}
