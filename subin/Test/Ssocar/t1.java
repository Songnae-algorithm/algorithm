package Ssocar;

import java.util.*;

public class t1 {
	
	static class Pos{
		int x;
		int y;
		
		Pos(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
	
	static public int []sol(int paths[][]) {
		LinkedList<Pos> list = new LinkedList<Pos>();
		list.add(new Pos(paths[0][0], paths[0][1]));
			
		for(int i=1;i<paths.length; i++) {
			int nowx = paths[i][0];
			int nowy = paths[i][1];
			
			int k = list.size();
			boolean chk = false;
			
			for(int j=0; j<k; j++) {
				if(list.get(j).y == nowx) {
					chk=true;
					if(list.get(j).x < nowy) {
						list.add(new Pos(list.get(j).x, nowy));
						list.remove(j);
					}
				}
				
				if(list.get(j).x == nowy) {
					chk=true;
					if(list.get(j).y > nowx) {
						list.add(new Pos(nowx, list.get(j).y));
						list.remove(j);
					}
				}
			}
			
			if(chk == false) {
				list.add(new Pos(nowx,nowy));
			}
		}
		
		list.sort(new Comparator<Pos>() {
			@Override
			public int compare(Pos arg0, Pos arg1) {
				int x = arg0.x;
				int y = arg1.x;
				
				if(x == y)
					return 0;
				else if(x>y)
					return 1;
				else
					return -1;
			}
		});
		
		List<Integer> listt = new ArrayList();
		
		int i=0;
		
		while(i<list.size()) {
			listt.add(list.get(i).x);
			listt.add(list.get(i).y);
			i++;
		}
		
		return listt.stream().mapToInt(k->k).toArray();
	}
	
	public static void main(String[] args) {
		int n[][] = {{1,2},{4,5},{10,9},{3,4}};
		int si[] = sol(n);
		
		for(int i=0;i<si.length; i++) {
			System.out.print(si[i] +"  ");
		}
	}
}
