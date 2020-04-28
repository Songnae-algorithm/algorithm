package T0425;

//11:10
public class t1 {
	
	static public int[] solution(String pur[]) {
		int answer[] = new int[5];//브실골플다
		String days[][] = new String[pur.length][3];
		int money[] = new int[pur.length];
		int ms[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i=0; i<pur.length; i++) {
			String s[] = pur[i].split(" ");//s[0], s[1];
			String ss[] = s[0].split("/");
			for(int j=0; j<3; j++) {
				days[i][j] = ss[j];
			}
			money[i] = Integer.valueOf(s[1]);
		}
		
		int idx = 0;	int rank=0;		int now_money = 0;
		for(int k=0; k<12; k++) {
			for(int i=1; i<=ms[k]; i++) {
				if(rank <0)
					rank=0;
				
				int m=0;
				int d=32;
				if(idx<pur.length) {
					m = Integer.valueOf(days[idx][1]);
					d = Integer.valueOf(days[idx][2]);
					int mon= money[idx];
					
					if(k+1 == m && i == d) {
						now_money +=mon;
						idx++;
						if(now_money <10000)
							rank = 0;
						else if(now_money <20000)
							rank +=1;
						else if(now_money <50000)
							rank += 2;
						else if(now_money <100000)
							rank += 3;
						else if(now_money >=100000)
							rank +=4;
					}
				}				
	
				if(i > d)
					rank--;
				
				if(rank == 0)
					answer[0]++;
				else if(rank == 1)
					answer[1]++;
				else if(rank == 2)
					answer[2]++;
				else if(rank == 3)
					answer[3]++;
				else if(rank >= 4)
					answer[4]++;
				

				System.out.println(k+1 + "월" + i +"일 " + rank + " " + now_money);
			}
			
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
