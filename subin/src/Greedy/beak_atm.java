package Greedy;

import java.util.*;

import java.util.*;

public class beak_atm {
	
	//20 min
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
		
        list.sort(null);
        
        int answer = 0; int k = 0;
        for(int i=0;i<list.size(); i++){
            answer = answer + list.get(i);
            k = k+ answer;
        }
        
        System.out.println(k);
	}
}
